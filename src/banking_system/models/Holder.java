package banking_system.models;

import java.util.List;

public class Holder {
    private Address address;
    private int holderId;
    private String fullName;
    private List<Card> cards;
    private BankAccount bankAccount;

    public Holder(Address address, int holderId, String fullName , List<Card> cards , BankAccount bankAccount) {
        this.address = address;
        this.holderId = holderId;
        this.fullName = fullName;
        this.cards = cards;
        this.bankAccount = bankAccount;
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

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String toString() {
        return
                 address + "\n"+
                " holderid = " + holderId + "\n" +
                " fullName = " + fullName + "\n" +
                " Cards = " + cards + "\n" +
                "Bank Account " + bankAccount;
    }
}
