package com.leonbauer.FarmerMap;

import com.leonbauer.FarmerMap.repository.ListingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class FarmerMapApplication {

	@Autowired
	ListingRepository listingRepository;

	public static void main(String[] args) {
		SpringApplication.run(FarmerMapApplication.class, args);
	}

}
