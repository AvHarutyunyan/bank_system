package simple_banking_system;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private double accountBalance;
    private String accountNumber;
    private String cardHolderId;
    private List<Card> cards;


    public BankAccount(double accountBalance, String accountNumber, String cardHolderId, List<Card> cards) {
        this.accountBalance = accountBalance;
        this.accountNumber = accountNumber;
        this.cardHolderId = cardHolderId;
        this.cards = cards;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCardHolderId() {
        return cardHolderId;
    }

    public void setCardHolderId(String cardHolderId) {
        this.cardHolderId = cardHolderId;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }


}
