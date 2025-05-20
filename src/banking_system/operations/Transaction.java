package banking_system.operations;

import banking_system.models.BankAccount;
import banking_system.models.CardAccount;

public abstract class Transaction {
    //Card Transaction
    public void deposit(CardAccount card, int amount) {}
    public void withDraw(CardAccount card, int takeMoney){}
    public void transfer( CardAccount senderCard, CardAccount receiverCard, int amount){}

    //Bank Transaction
    public void deposit(double amount , BankAccount bankAccount){}
    public void withdraw(double amount , BankAccount bankAccount){}
    public void transfer(double amount, BankAccount bankAccount , BankAccount toAccount){}
}
