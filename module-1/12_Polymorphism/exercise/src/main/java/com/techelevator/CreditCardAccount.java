package com.techelevator;

public class CreditCardAccount implements Accountable{
    private String accountNumber;
    private String accountHolderName;
    private String cardNumber;
    private int debt;
    private int balance;
    public CreditCardAccount(String accountHolderName,String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.cardNumber = accountNumber;
    }


    public String getAccountHolderName() {
        return accountHolderName;
    }
    public String getCardNumber() {
        return cardNumber;
    }
    public int getDebt() {
        return debt;
    }
    public int getBalance() {
        return debt* -1;
    }

    public int pay(int amountToPay) {
        if(amountToPay > 0){
            debt -= amountToPay;
        }

        return debt;
    }
    public int charge(int amountToCharge) {
        if(amountToCharge > 0) {
            debt += amountToCharge;
        }

        return debt;
    }
}
