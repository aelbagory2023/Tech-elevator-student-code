package com.techelevator;


public class CheckingAccount extends BankAccount {

    public CheckingAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    public int withdraw(int amountToWithdraw) {
     int difference = getBalance() - amountToWithdraw;
        if (difference >= 0) {
            return super.withdraw(amountToWithdraw);
        } else if(difference <= -100) {
            return getBalance();
        }
        return super.withdraw(amountToWithdraw + 10);

    }
}





