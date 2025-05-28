package banking_system.operations;

import banking_system.exceptions.BankTransactionException;
import banking_system.models.Account;
import banking_system.models.BankAccount;

public class BankAccountTransaction implements Transaction {

    @Override
    public void deposit(Account account, double amount) {
        BankAccount acc = (BankAccount) account;
        if (amount <= 0) {
            throw new BankTransactionException("Deposit amount must be positive.");
        }
        double newBalance = acc.getBalance() + amount;
        acc.setBalance(newBalance);
        System.out.println("Deposited: " + amount + " BankAccount Balance " + acc.getBalance());
    }

    @Override
    public void withDraw(Account account, double amount) {
        BankAccount acc = (BankAccount) account;
        if (amount <= 0) {
            throw new BankTransactionException("Withdraw amount must be positive.");
        }
        if (amount > acc.getBalance()) {
            throw new BankTransactionException("Insufficient funds.");
        }
        double newBalance = acc.getBalance() - amount;
        acc.setBalance(newBalance);
        System.out.println("Withdrawn: " + amount + " BankAccount Balance " + acc.getBalance());
    }

    @Override
    public void transfer(Account account, Account toAccount, double amount) {
        BankAccount acc1 = (BankAccount) account;
        BankAccount acc2 = (BankAccount) toAccount;
        if (amount <= 0) {
            throw new BankTransactionException("Transfer amount must be positive.");
        }
        if (amount > acc1.getBalance()) {
            throw new BankTransactionException("Insufficient funds for transfer.");
        }
        if (!acc1.getCurrency().equals(toAccount.getCurrency())) {
            throw new BankTransactionException("Currency mismatch. Cannot transfer.");
        }

        double toNewBalance = toAccount.getBalance() + amount;
        toAccount.setBalance(toNewBalance);

        System.out.println("Transferred: " + amount + " to " + toAccount.getNumber() + " BankAccount Balance " + toAccount.getBalance());
    }
}
