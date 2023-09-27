package com.techelevator;

public class BankCustomer {
    private String name;
    private String address;
    private String phoneNumber;
    private Accountable[] accounts;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public Accountable[] getAccounts(){
        return accounts;
    }
    public void setAccounts(Accountable[] accounts) {
        this.accounts = accounts;

    }public void addAccount(Accountable newAccount) {

    }

}
