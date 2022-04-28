package com.leonbauer.FarmerMap.repository;

import com.leonbauer.FarmerMap.models.Listing;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface ListingRepository extends MongoRepository<Listing, String> {

    @Query("{name:'?0'}")
    Listing findItemByName(String name);

    @Query(value="{category:'?0'}", fields="{'name' : 1, 'quantity' : 1}")
    List<Listing> findAll(String category);

    public long count();

}
