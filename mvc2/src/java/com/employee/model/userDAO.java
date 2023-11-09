package com.employee.model;

import java.io.Serializable;


public class userDAO implements Serializable {
    private int id;
    private String name, email,fname,password,mobile,address;

    public userDAO(String name, String email,String fname, String password, String mobile, String address) {
        this.name = name;
         this.fname = fname;
        this.email = email;
        this.password = password;
        this.mobile = mobile;
        this.address = address;
    }
    
   

    public userDAO() {
    }


    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
     
     public String getName() {
        return name;
    }
 public void setName(String fname) {
        this.name = name;
    }
   
     public String getFname() {
        return fname;
    }

    public void setFname(String name) {
        this.fname = name;
    }
   
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String salary) {
        this.address = address;
    }
    
   
    
     
}