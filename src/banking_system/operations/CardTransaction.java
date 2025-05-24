package banking_system.operations;

import banking_system.enums.CardStatus;
import banking_system.exceptions.InsufficientFoundsException;
import banking_system.models.Account;
import banking_system.models.BankAccount;
import banking_system.models.CardAccount;

import java.util.List;

public class CardTransaction implements Transaction {

    @Override
    public void deposit(Account account, double amount) {
        CardAccount c1 = (CardAccount) account;
        if (c1.getStatus() == CardStatus.CLOSED || c1.getStatus() == CardStatus.BLOCKED || amount < 0) {
            throw new InsufficientFoundsException("Deposit failed");
        }

        c1.setBalance(c1.getBalance() + amount);
        System.out.println("Deposited: " + amount + " to card " + c1.getNumber()
                + ". New balance: " + c1.getBalance() + "\n");
    }

    @Override
    public void withDraw(Account account, double takeMoney) {
        CardAccount c1 = (CardAccount) account;
        if (takeMoney > c1.getBalance() || c1.getStatus() == CardStatus.CLOSED || c1.getStatus() == CardStatus.BLOCKED) {
            throw new IllegalArgumentException("WithDraw failed");
        }
        c1.setBalance(c1.getBalance() - takeMoney);
        System.out.println("WithDrawed: " + takeMoney + " in card " + c1.getNumber() + ". New balance: " + c1.getBalance() + "\n");
    }

    @Override
    public void transfer(Account senderAccount, Account receiverAccount, double amount) {
        CardAccount c1 = (CardAccount) senderAccount;
        CardAccount c2 = (CardAccount) receiverAccount;
        if (c1.getStatus() == CardStatus.CLOSED || c1.getStatus() == CardStatus.BLOCKED) {
            throw new IllegalArgumentException("Sender card is not active.");
        }

        if (amount > c1.getBalance()) {
            throw new IllegalArgumentException("Insufficient funds in sender account.");
        }

        c1.setBalance(c1.getBalance() - amount);
       c2.setBalance(c2.getBalance() + amount);

        System.out.println("Transferred: " + amount +
                " from card " + c1.getBalance() +
                " to card " + c2.getBalance());
    }


    public String cardLimit(List<CardAccount> cards) {
        if (cards.size() > 3) {
            throw new RuntimeException("Card limit exceeded");
        }
        return "You have " + cards.size() + " Cards";
    }
}
