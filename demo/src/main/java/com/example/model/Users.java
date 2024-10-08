package com.example.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Users {
    @Id
    private int id;
    private String name;
    private String password;

    //构造函数
    public Users(){}
    public Users(int id,String name,String password){
        this.id = id;
        this.name = name;
        this.password = password;
    }

    //getter and setter
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
}
