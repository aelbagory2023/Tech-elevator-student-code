package com.techelevator;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
       super(accountHolderName, accountNumber, balance);
    }
    public int withdraw(int amountToWithdraw) {
        int remainingBalance = getBalance() - amountToWithdraw;
        if (remainingBalance <= 150) {
            return remainingBalance - 2;
        } else if(remainingBalance >= 150) {
            return getBalance();
        }
       return remainingBalance;

    }
}






