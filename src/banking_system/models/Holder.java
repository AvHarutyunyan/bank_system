package banking_system.models;

import banking_system.operations.CardTransaction;

import java.util.List;

public class Holder {
    private int passportNumber;
    private Address address;
    private int holderId;
    private String fullName;
    private List<CardAccount> cards;
    private BankAccount bankAccount;
    private CardTransaction cardTransaction;

    public Holder(Address address, int holderId, String fullName, int passportNumber, List<CardAccount> cards, BankAccount bankAccount) {
        this.address = address;
        this.holderId = holderId;
        this.fullName = fullName;
        this.cards = cards;
        this.bankAccount = bankAccount;
        this.passportNumber = passportNumber;
    }

    public int getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(int passportNumber) {
        this.passportNumber = passportNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getHolderId() {
        return holderId;
    }

    public void setHolderId(int holderId) {
        this.holderId = holderId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<CardAccount> getCards() {
        return cards;
    }

    public void setCards(List<CardAccount> cards) {
        this.cards = cards;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public CardTransaction getCardTransaction() {
        return cardTransaction;
    }

    public void setCardTransaction(CardTransaction cardTransaction) {
        this.cardTransaction = cardTransaction;
    }

    @Override
    public String toString() {
        return
                address + "\n" +
                        " holderid = " + holderId + "\t" +
                        ",fullName = " + fullName + "\t" +
                        ",passport Number = " + passportNumber + "\t" +
                        bankAccount;
    }
}
