package banking_system.operations;

import banking_system.models.BankAccount;
import banking_system.models.CardAccount;

public interface Transaction {
    void deposit(CardAccount card, int amount);
    void withDraw(CardAccount card, int amount);
    void transfer(CardAccount senderCard, CardAccount receiverCard, int amount);
}
