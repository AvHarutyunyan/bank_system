package banking_system.models;

import banking_system.enums.CardStatus;
import banking_system.enums.Currency;

public abstract class Account {
    private String number;
    private double balance;
    private Currency currency;;

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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

}
