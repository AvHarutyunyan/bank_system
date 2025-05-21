package banking_system.models;

import banking_system.enums.BankAccountType;
import banking_system.enums.Currency;

import java.util.List;

public class BankAccount extends CommonFilds {
    private BankAccountType AccountType;

    public BankAccount(double balance, String number, Currency currency, BankAccountType accountType) {
        this.setBalance(balance);
        this.setNumber(number);
        this.setCurrency(currency);
        AccountType = accountType;
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
                " balance = " + getBalance() + "\n" +
                        " Number = " + getNumber() + "\n" +
                        " currency  = " + getCurrency() + "\n";
    }
}
