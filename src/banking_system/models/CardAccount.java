package banking_system.models;

import banking_system.enums.CardStatus;
import banking_system.enums.CardType;
import banking_system.enums.Currency;

import java.time.LocalDate;
import java.util.List;

public class CardAccount extends CommonFilds {
    private String cvv;
    private LocalDate expirationDate;
    private CardType type;
    private CardStatus status;
    private List<banking_system.models.CardAccount> cards;

    public CardAccount(String number, String cvv, LocalDate expirationDate, CardType type, CardStatus status, double balance, Currency currency) {
        this.setNumber(number);
        this.cvv = cvv;
        this.expirationDate = expirationDate;
        this.type = type;
        this.status = status;
        this.setBalance(balance);
        this.setCurrency(currency);
    }

    public List<banking_system.models.CardAccount> getCards() {
        return cards;
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


    @Override
    public String toString() {
        return "[Card Account:]\n" +
                "[number = " + getNumber() +
                ", cvv = " + cvv +
                ", expirationDate = " + expirationDate +
                ", type = " + type +
                ", status = " + status +
                ", balance = " + getBalance() +
                ", currency = " + getCurrency() +
                "]";
    }


}


