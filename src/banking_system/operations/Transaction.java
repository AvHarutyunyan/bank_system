package banking_system.operations;

import banking_system.models.Account;
import banking_system.models.BankAccount;
import banking_system.models.CardAccount;

public interface Transaction {
    void deposit(Account account, double amount);

    void withDraw(Account account, double amount);

    void transfer(Account from, Account to, double amount);
}
