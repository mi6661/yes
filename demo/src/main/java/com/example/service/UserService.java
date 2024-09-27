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

    //1.返回所以用户的账号密码
    public List<Users> getAll(){
        return userRepository.findAll();
    }

    //2.通过用户名查找
    public Users getById(Long id){
        return userRepository.findById(id).get();
    }
}
