package banking_system.operations;

import banking_system.exceptions.BankTransactionException;
import banking_system.models.Account;
import banking_system.models.BankAccount;

public class BankAccountTransaction implements Transaction {

    @Override
    public void deposit(Account bankAccount, double amount) {
        if (amount <= 0) {
            throw new BankTransactionException("Deposit amount must be positive.");
        }
        double newBalance = bankAccount.getBalance() + amount;
        bankAccount.setBalance(newBalance);
        System.out.println("Deposited: " + amount + " BankAccount Balance " + bankAccount.getBalance());
    }

    @Override
    public void withDraw(Account bankAccount, double amount) {
        if (amount <= 0) {
            throw new BankTransactionException("Withdraw amount must be positive.");
        }
        if (amount > bankAccount.getBalance()) {
            throw new BankTransactionException("Insufficient funds.");
        }
        double newBalance = bankAccount.getBalance() - amount;
        bankAccount.setBalance(newBalance);
        System.out.println("Withdrawn: " + amount + " BankAccount Balance " + bankAccount.getBalance());
    }

    @Override
    public void transfer(Account bankAccount, Account toAccount, double amount) {
        if (amount <= 0) {
            throw new BankTransactionException("Transfer amount must be positive.");
        }
        if (amount > bankAccount.getBalance()) {
            throw new BankTransactionException("Insufficient funds for transfer.");
        }
        if (!bankAccount.getCurrency().equals(toAccount.getCurrency())) {
            throw new BankTransactionException("Currency mismatch. Cannot transfer.");
        }

        double toNewBalance = toAccount.getBalance() + amount;
        toAccount.setBalance(toNewBalance);

        System.out.println("Transferred: " + amount + " to " + toAccount.getNumber() + " BankAccount Balance " + toAccount.getBalance());
    }
}
