package com.employee.model;

import java.io.Serializable;

public class EmployeeDAO implements Serializable {
    private int id;
    private String name, email, password, mobile;

    public EmployeeDAO() {
        // Default constructor
    }

    public EmployeeDAO(String name, String email, String password, String mobile) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.mobile = mobile;
    }

    // Setters
    public void setname(String name) {
        this.name = name;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public void setpassword(String password) {
        this.password = password;
    }

    public void setmobile(String mobile) {
        this.mobile = mobile;
    }

    // Getters
    public String getname() {
        return name;
    }

    public String getemail() {
        return email;
    }

    public String getpassword() {
        return password;
    }

    public String getmobile() {
        return mobile;
    }
}
