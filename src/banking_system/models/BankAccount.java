package banking_system.models;

import banking_system.enums.Currency;

import java.util.List;

public class BankAccount {
    private double balance;
    private String number;
    private Currency currency;


    public BankAccount(double balance, String number, Currency currency) {
        this.balance = balance;
        this.number = number;
        this.currency = currency;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return
                " balance = " + balance + "\n" +
                        " Number = " + number + "\n" +
                        " currency  = " + currency + "\n";
    }
}
