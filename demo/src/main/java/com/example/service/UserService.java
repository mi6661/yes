package com.example.service;

import com.example.model.Users;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    //功能
    public List<Users> getAll(){
        return userRepository.findAll();
    }
}
