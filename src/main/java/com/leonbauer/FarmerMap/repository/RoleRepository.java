package com.leonbauer.FarmerMap.repository;

import com.leonbauer.FarmerMap.models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<Role, String> {
    Role findByRole(String role);
}
