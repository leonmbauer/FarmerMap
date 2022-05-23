package com.leonbauer.FarmerMap.controller;

import com.leonbauer.FarmerMap.models.Listing;
import com.leonbauer.FarmerMap.repository.ListingRepository;
import com.leonbauer.FarmerMap.routines.ListingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ListingController {
    @Autowired
    ListingService listingService;

    //CREATE
    @PostMapping("/listings")
    public Listing postListing(@RequestBody Listing listing) {
        return listingService.createListing(listing);
    }

    //READ
    @GetMapping("/listings")
    public List<Listing> getListings() {
        return listingService.getListings();
    }

    //UPDATE
    @PutMapping("/listings/{id}")
    public Listing editListing(@PathVariable String id, @RequestBody Listing listing) {
        return listingService.updateListing(id, listing);
    }

    //DELETE
    @DeleteMapping("/delete")
    public String deleteListings() {
        return listingService.deleteListing();
    }

    @GetMapping("/createListing")
    public ModelAndView createListing() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        ModelAndView modelAndView = new ModelAndView();
        if (authentication != null) {
            modelAndView.setViewName("createListing");
            return modelAndView;
        }
        modelAndView.setViewName("redirect:/login");
        return modelAndView;
    }
}
