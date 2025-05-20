package banking_system.models;

import banking_system.enums.BankAccountType;
import banking_system.enums.Currency;

import java.util.List;

public class BankAccount  {
    private double balance;
    private String number;
    private Currency currency;
    private BankAccountType AccountType;


    public BankAccount(double balance, String number, Currency currency, BankAccountType accountType) {
        this.balance = balance;
        this.number = number;
        this.currency = currency;
        AccountType = accountType;
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

    public BankAccountType getAccountType() {
        return AccountType;
    }

    public void setAccountType(BankAccountType accountType) {
        AccountType = accountType;
    }

    @Override
    public String toString() {
        return
                " balance = " + balance + "\n" +
                        " Number = " + number + "\n" +
                        " currency  = " + currency + "\n";
    }
}
