package banking_system.models;

import banking_system.enums.BankAccountType;
import banking_system.enums.Currency;

import java.util.List;

public class BankAccount extends Account {
    private BankAccountType accountType;

    public BankAccount(double balance, String number, Currency currency, BankAccountType accountType) {
        this.setBalance(balance);
        this.setNumber(number);
        this.setCurrency(currency);
        this.accountType = accountType;
    }


    public BankAccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(BankAccountType accountType) {
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        return
                " balance = " + getBalance() + "\n" +
                        " Number = " + getNumber() + "\n" +
                        " currency  = " + getCurrency() + "\n";
    }
}
