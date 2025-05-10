package banking_system.models;

import banking_system.enums.CardStatus;
import banking_system.enums.CardType;
import banking_system.enums.Currency;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.List;

public class Card {
    private String number;
    private String cvv;
    private LocalDate expirationDate;
    private CardType type;
    private CardStatus status;
    private int balance;
    private Currency currency;

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    private List<Card> cards;

    public Card(String number, String cvv, LocalDate expirationDate, CardType type, CardStatus status, int balance, Currency currency) {
        this.number = number;
        this.cvv = cvv;
        this.expirationDate = expirationDate;
        this.type = type;
        this.status = status;
        this.balance = balance;
        this.currency = currency;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public CardType getType() {
        return type;
    }

    public void setType(CardType type) {
        this.type = type;
    }

    public CardStatus getStatus() {
        return status;
    }

    public void setStatus(CardStatus status) {
        this.status = status;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "number = " + number + "\t" +
                ", cvv = " + cvv + "\t" +
                ", expirationDate = " + expirationDate + "\t"+
                ", type = " + type + "\t" +
                ", status = " + status + "\t" +
                ", balance = " + balance + "\t" +
                ", currency = " + currency + "\t" + " ";
    }

}

