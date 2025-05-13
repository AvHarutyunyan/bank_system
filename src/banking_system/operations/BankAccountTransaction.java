package banking_system.operations;

import banking_system.enums.CardStatus;
import banking_system.exceptions.InsufficientFoundsException;
import banking_system.models.BankAccount;
import banking_system.models.CardAccount;
import banking_system.exceptions.InsufficientFoundsException;

public class BankAccountTransaction {
    private BankAccount bankAccount;

    public BankAccountTransaction(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw  new  InsufficientFoundsException("Deposit amount must be positive.");
        }
        double newBalance = bankAccount.getBalance() + amount;
        bankAccount.setBalance(newBalance);
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw  new InsufficientFoundsException("Withdraw amount must be positive.");
        }
        if (amount > bankAccount.getBalance()) {
          throw  new InsufficientFoundsException("Insufficient funds.");
        }
        double newBalance = bankAccount.getBalance() - amount;
        bankAccount.setBalance(newBalance);
        System.out.println("Withdrawn: " + amount);
    }

    public void transfer(double amount, BankAccount toAccount) {
        if (amount <= 0) {
           throw new InsufficientFoundsException("Transfer amount must be positive.");
        }
        if (amount > bankAccount.getBalance()) {
            throw new InsufficientFoundsException("Insufficient funds for transfer.");
        }
        if (!bankAccount.getCurrency().equals(toAccount.getCurrency())) {
          throw new RuntimeException("Currency mismatch. Cannot transfer.");
        }

        withdraw(amount);

        double toNewBalance = toAccount.getBalance() + amount;
        toAccount.setBalance(toNewBalance);

        System.out.println("Transferred: " + amount + " to " + toAccount.getNumber());
    }

    public double getBankAccountBalance() {
        return bankAccount.getBalance();
    }
}
