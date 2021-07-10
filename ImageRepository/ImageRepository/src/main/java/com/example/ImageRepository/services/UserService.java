package com.example.ImageRepository.services;

import com.example.ImageRepository.models.UserTable;
import com.example.ImageRepository.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public UserTable getUserDetails(String user, String pass) {
        return  userRepository.findIfUserExists(user, pass);
    }
}
