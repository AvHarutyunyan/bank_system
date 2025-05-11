package banking_system.models;

import banking_system.enums.CardStatus;
import banking_system.exceptions.InsufficientFoundsException;

import java.util.ArrayList;

public class CardTransaction {
    private BankAccount bankAccount;
    private Card card;
    private InsufficientFoundsException exception;

    public CardTransaction(BankAccount bankAccount, Card card) {
        this.bankAccount = bankAccount;
        this.card = card;
    }

    public InsufficientFoundsException getException() {
        return exception;
    }

    public void setException(InsufficientFoundsException exception) {
        this.exception = exception;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }


    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void deposit(int addMoney) {
        if (card.getStatus() == CardStatus.CLOSED || card.getStatus() == CardStatus.BLOCKED || addMoney < 0) {
            throw new InsufficientFoundsException("Deposit failed");
        }
        bankAccount.setBalance(bankAccount.getBalance() + addMoney);
        card.setCards(new ArrayList<>(addMoney));
    }

    public void withDraw(int takeMoney) {
        if (takeMoney > bankAccount.getBalance() || card.getStatus() == CardStatus.CLOSED || card.getStatus() == CardStatus.BLOCKED) {
            throw new IllegalArgumentException("WithDraw failed");
        }
        bankAccount.setBalance(bankAccount.getBalance() - takeMoney);

    }

    public void transfer(Card card1, Card card2) {
        if (card1.getBalance() > bankAccount.getBalance() || card1.getStatus() == CardStatus.CLOSED || card1.getStatus() == CardStatus.BLOCKED) {
            throw new IllegalArgumentException("Transfer failed");
        }
        bankAccount.setBalance((bankAccount.getBalance() + card2.getBalance()));

    }

    public void cardLimit(int cardCount) {
        if (cardCount > 3) {
            throw new RuntimeException("Card limit exceeded");
        }
    }


    @Override
    public String toString() {
        return "Card: " + card.getNumber() + " | Status: " + card.getStatus() + "\n" +
                "Balance: " + bankAccount.getBalance() + "\n";
    }
}
