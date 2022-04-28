package com.leonbauer.FarmerMap.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Listing")
@Data
public class Listing {

    @Id
    private String id;

    private String name;
}
