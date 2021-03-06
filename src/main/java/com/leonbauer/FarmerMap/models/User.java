package com.leonbauer.FarmerMap.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Document("User")
@Data
public class User {
    @Id
    private String id;
    private String email;
    private String username;
    private String password;
    private Set<Role> roles;
}
