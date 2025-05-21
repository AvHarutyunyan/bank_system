package banking_system.models;

import banking_system.enums.Currency;

public class Account extends CommonFilds {

    public Account(String number, Currency currency, double balance) {
        this.setNumber(number);
        this.setCurrency(currency);
        this.setBalance(balance);
    }

}
