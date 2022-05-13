package com.leonbauer.FarmerMap.routines;

import com.leonbauer.FarmerMap.models.User;
import com.leonbauer.FarmerMap.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    //CREATE
    public User createUser(User user) {
//        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//        String encodedPassword = passwordEncoder.encode(user.getPassword());
//        user.setPassword(encodedPassword);
        return userRepository.save(user);
    }

    //READ
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    //UPDATE
//    public User updateUser(String id, User updatedUser) {
//    }

    //DELETE
    public String deleteUsers() {
        userRepository.deleteAll();
        return "All deleted";
    }

    //login
    public User userLogin(String username, String password) throws Exception {
        User user = userRepository.findUserByUsername(username);
        if(null != user) {
            if(!password.equals(user.getPassword())) {
                throw new Exception();
            } else {
                return user;
            }
        } else {
            throw new Exception();
        }
    }
}
