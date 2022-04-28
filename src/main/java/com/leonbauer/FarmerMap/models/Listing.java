package com.leonbauer.FarmerMap.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.awt.*;
import java.util.Date;

@Document("Listing")
@Data
public class Listing {

    @Id
    private String id;

    private String productName;
    private String price;
    private String address;
    private Date date;
//    private Image image;
}