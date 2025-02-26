package com.techelevator;

public class BankAccount implements Accountable {

    private String accountHolderName;
    private String accountNumber;
    private int balance;

    public BankAccount(String accountHolder, String accountNumber) {
        this.accountHolderName = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public BankAccount(String accountHolder, String accountNumber, int balance) {
        this.accountHolderName = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public int deposit(int amountToDeposit) {
        if (amountToDeposit > 0) {
            balance = balance + amountToDeposit;
        }
        return balance;
    }

    public int withdraw(int amountToWithdraw) {
        if (amountToWithdraw > 0) {
            balance = balance - amountToWithdraw;
        }
        return balance;
    }

    public int transferFunds(BankAccount destinationAccount, int transferAmount) {
        if (transferAmount > 0 && getBalance() >= transferAmount) {
            this.balance -= transferAmount;
            destinationAccount.balance +=transferAmount;
       //     return this.balance;
       // } else if (transferAmount < 0 && destinationAccount.balance > -transferAmount) {
       //     destinationAccount.balance -= -transferAmount;
       //     this.balance += -transferAmount;
        }
        return this.balance;


    }
}