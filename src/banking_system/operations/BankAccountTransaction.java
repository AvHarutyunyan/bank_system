package banking_system.operations;

import banking_system.enums.CardStatus;
import banking_system.exceptions.BankTransactionException;
import banking_system.exceptions.InsufficientFoundsException;
import banking_system.models.BankAccount;
import banking_system.models.CardAccount;
import banking_system.exceptions.InsufficientFoundsException;

public class BankAccountTransaction  {

    public void deposit( double amount , BankAccount bankAccount ) {
        if (amount <= 0) {
            throw  new BankTransactionException("Deposit amount must be positive.");
        }
        double newBalance = bankAccount.getBalance() + amount;
        bankAccount.setBalance(newBalance);
        System.out.println("Deposited: " + amount + " BankAccount Balance " + bankAccount.getBalance());
    }

    public void withdraw(double amount , BankAccount bankAccount) {
        if (amount <= 0) {
                throw  new BankTransactionException("Withdraw amount must be positive.");
        }
        if (amount > bankAccount.getBalance()) {
          throw  new BankTransactionException("Insufficient funds.");
        }
        double newBalance = bankAccount.getBalance() - amount;
        bankAccount.setBalance(newBalance);
        System.out.println("Withdrawn: " + amount + " BankAccount Balance " + bankAccount.getBalance());
    }

    public void transfer(double amount, BankAccount bankAccount ,  BankAccount toAccount) {
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
