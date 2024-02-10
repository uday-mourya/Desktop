/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.pojo;

/**
 *
 * @author dell
 */
import java.util.Date;

public class Account {

    private int accountId;
    private String accountNumber;
    private String accountType;
    private double balance;
    private String holderName;
    private Date openDate;
    private String status;

    // Constructors, getters, setters (omitted for brevity)
    public Account() {
    }

    public Account(String accountNumber, String accountType, double balance, String holderName, Date openDate, String status) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
        this.holderName = holderName;
        this.openDate = openDate;
        this.status = status;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public Date getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
