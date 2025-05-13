package banking_system.operations;

import banking_system.enums.CardStatus;
import banking_system.exceptions.InsufficientFoundsException;
import banking_system.models.BankAccount;
import banking_system.models.CardAccount;

import java.util.List;

public class CardTransaction  {
//    private BankAccount bankAccount;
//    private Card card;
//    private InsufficientFoundsException exception;
//
//    public CardTransaction(BankAccount bankAccount, Card card) {
//        this.bankAccount = bankAccount;
//        this.card = card;
//    }

//    public InsufficientFoundsException getException() {
//        return exception;
//    }
//
//    public void setException(InsufficientFoundsException exception) {
//        this.exception = exception;
//    }
//
//    public Card getCard() {
//        return card;
//    }
//
//    public void setCard(Card card) {
//        this.card = card;
//    }
//
//
//    public BankAccount getBankAccount() {
//        return bankAccount;
//    }
//
//    public void setBankAccount(BankAccount bankAccount) {
//        this.bankAccount = bankAccount;
//    }

    public void deposit(CardAccount card, BankAccount bankAccount, int amount) {
        if (card.getStatus() == CardStatus.CLOSED || card.getStatus() == CardStatus.BLOCKED || amount < 0) {
            throw new InsufficientFoundsException("Deposit failed");
        }

        bankAccount.setBalance(bankAccount.getBalance() + amount);
        System.out.println("Deposited: " + amount + " to card " + card.getNumber()
                + ". New balance: " + bankAccount.getBalance() + "\n");
    }


    public void withDraw(CardAccount card, BankAccount bankAccount, int takeMoney) {
        if (takeMoney > bankAccount.getBalance() || card.getStatus() == CardStatus.CLOSED || card.getStatus() == CardStatus.BLOCKED) {
            throw new IllegalArgumentException("WithDraw failed");
        }
        bankAccount.setBalance(bankAccount.getBalance() - takeMoney);
        System.out.println("WithDrawed: " + takeMoney + " in card " + card.getNumber() + ". New balance: " + bankAccount.getBalance() + "\n");
    }

    public void transfer(BankAccount senderAccount, CardAccount senderCard, BankAccount receiverAccount, CardAccount receiverCard, double amount) {
        if (senderCard.getStatus() == CardStatus.CLOSED || senderCard.getStatus() == CardStatus.BLOCKED) {
            throw new IllegalArgumentException("Sender card is not active.");
        }

        if (amount > senderAccount.getBalance()) {
            throw new IllegalArgumentException("Insufficient funds in sender account.");
        }

        senderAccount.setBalance(senderAccount.getBalance() - amount);
        receiverAccount.setBalance(receiverAccount.getBalance() + amount);

        System.out.println("Transferred: " + amount +
                " from card " + senderCard.getNumber() +
                " to card " + receiverCard.getNumber() +
                ". New sender balance: " + senderAccount.getBalance() +
                ", receiver balance: " + receiverAccount.getBalance() + "\n");
    }


    public String cardLimit(List<CardAccount> cards) {
        if (cards.size() > 3) {
            throw new RuntimeException("Card limit exceeded");
        }
        return "You have " + cards.size() + " Cards";
    }

}