package banking_system.models.card;

import banking_system.enums.card_status.CardStatus;
import banking_system.enums.card_type.CardType;
import banking_system.enums.card_currency.Currency;

import java.time.YearMonth;

public class Card {
    private String cardNumber;
    private String cvv;
    private YearMonth expirationDate;
    private CardType cardType;
    private CardStatus status;
    private int cardBalance;
    private int cardHolderId;
    private Currency currency; // Optional

    public Card(String cardNumber, String cvv, YearMonth expirationDate,
                CardType cardType, CardStatus status,
                int cardBalance, int cardHolderId , Currency currency) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expirationDate = expirationDate;
        this.cardType = cardType;
        this.status = status;
        this.cardBalance = cardBalance;
        this.cardHolderId = cardHolderId;
        this.currency = currency;
    }


    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public YearMonth getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(YearMonth expirationDate) {
        this.expirationDate = expirationDate;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public CardStatus getStatus() {
        return status;
    }

    public void setStatus(CardStatus status) {
        this.status = status;
    }

    public int getCardBalance() {
        return cardBalance;
    }

    public void setCardBalance(int cardBalance) {
        this.cardBalance = cardBalance;
    }

    public int getCardHolderId() {
        return cardHolderId;
    }

    public void setCardHolderId(int cardHolderId) {
        this.cardHolderId = cardHolderId;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
    @Override
    public String toString() {
        return "Card {" +
                "cardNumber= " + cardNumber + '\'' +
                ", cvv= " + cvv + '\'' +
                ", expirationDate= " + expirationDate +
                ", cardType= " + cardType +
                ", status= " + status +
                ", cardBalance= " + cardBalance +
                ", cardHolderId= " + cardHolderId +
                ", banking_system.models.currency= " + currency +
                '}';
    }

}

