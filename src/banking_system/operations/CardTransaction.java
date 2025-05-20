package banking_system.operations;

import banking_system.enums.CardStatus;
import banking_system.exceptions.InsufficientFoundsException;
import banking_system.models.BankAccount;
import banking_system.models.CardAccount;

import java.util.List;

public class CardTransaction extends Transaction  {
    @Override
    public void deposit(CardAccount card, int amount) {
        if (card.getStatus() == CardStatus.CLOSED || card.getStatus() == CardStatus.BLOCKED || amount < 0) {
            throw new InsufficientFoundsException("Deposit failed");
        }

        card.setBalance(card.getBalance() + amount);
        System.out.println("Deposited: " + amount + " to card " + card.getNumber()
                + ". New balance: " + card.getBalance() + "\n");
    }

    @Override
    public void withDraw(CardAccount card, int takeMoney) {
        if (takeMoney > card.getBalance() || card.getStatus() == CardStatus.CLOSED || card.getStatus() == CardStatus.BLOCKED) {
            throw new IllegalArgumentException("WithDraw failed");
        }
        card.setBalance(card.getBalance() - takeMoney);
        System.out.println("WithDrawed: " + takeMoney + " in card " + card.getNumber() + ". New balance: " + card.getBalance() + "\n");
    }
    @Override
    public void transfer( CardAccount senderCard, CardAccount receiverCard, int amount) {
        if (senderCard.getStatus() == CardStatus.CLOSED || senderCard.getStatus() == CardStatus.BLOCKED) {
            throw new IllegalArgumentException("Sender card is not active.");
        }

        if (amount > senderCard.getBalance()) {
            throw new IllegalArgumentException("Insufficient funds in sender account.");
        }

        senderCard.setBalance(senderCard.getBalance() - amount);
        receiverCard.setBalance(receiverCard.getBalance() + amount);

        System.out.println("Transferred: " + amount +
                " from card " + senderCard.getBalance()  +
                " to card " + receiverCard.getBalance());
    }


    public String cardLimit(List<CardAccount> cards) {
        if (cards.size() > 3) {
            throw new RuntimeException("Card limit exceeded");
        }
        return "You have " + cards.size() + " Cards";
    }

}