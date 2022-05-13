package com.leonbauer.FarmerMap.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document("Listing")
@Data
public class Listing {
    @Id
    private String id;
    private String productName;
    private String price;
    private Address address;
    private Date date;
    private User poster;
//    private Image image;
}