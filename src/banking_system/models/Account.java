package banking_system.models;

import banking_system.enums.Currency;

public class Account {
    private String number;
    private Currency currency;
    private double balance;

    public Account(String number, Currency currency, double balance) {
        this.number = number;
        this.currency = currency;
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

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
