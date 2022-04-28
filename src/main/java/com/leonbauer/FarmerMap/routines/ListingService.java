package com.leonbauer.FarmerMap.routines;

import com.leonbauer.FarmerMap.models.Listing;
import com.leonbauer.FarmerMap.repository.ListingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListingService {
    @Autowired
    ListingRepository listingRepository;

    //CREATE
    public Listing createListing(Listing listing) {
        return listingRepository.save(listing);
    }

    //READ
    public List<Listing> getListings() {
        return listingRepository.findAll();
    }

    //UPDATE
    public Listing updateListing(String id, Listing updatedListing) {
        Listing listing = listingRepository.findById(id).get();
        listing.setProductName(updatedListing.getProductName());
        listing.setPrice(updatedListing.getPrice());
        listing.setAddress(updatedListing.getAddress());
        return listingRepository.save(listing);
    }

    //DELETE
    public String deleteListing() {
        listingRepository.deleteAll();
        return "All deleted";
    }
}
