package banking_system;

import banking_system.enums.BankAccountType;
import banking_system.models.*;
import banking_system.enums.CardStatus;
import banking_system.enums.CardType;
import banking_system.enums.Currency;
import banking_system.operations.BankAccountTransaction;
import banking_system.operations.CardTransaction;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        Address address1 = new Address("Armenia", "Armavair", "Armavair", "baghramyan", 15);
        CardAccount card1 = new CardAccount(
                "4567 1346 6754 1345",
                "234",
                LocalDate.of(2017, Month.APRIL, 4),
                CardType.VISA,
                CardStatus.ACTIVE,
                3400,
                Currency.USD
        );

        CardAccount card2 = new CardAccount(
                "7324 3467 3433 8777",
                "544",
                LocalDate.of(2009, Month.AUGUST, 5),
                CardType.AMERICAN_EXPRESS,
                CardStatus.ACTIVE,
                76544,
                Currency.AMD
        );

        CardAccount card3 = new CardAccount(
                "8392 9745 2234 8224",
                "544",
                LocalDate.of(2011, Month.FEBRUARY, 3),
                CardType.MASTERCARD,
                CardStatus.BLOCKED,
                200000,
                Currency.RUB
        );

//        Card card4 = new Card(
//                "8333 9445 2264 3224",
//                "544",
//                LocalDate.of(2011, Month.FEBRUARY, 3),
//                CardType.MASTERCARD,
//                CardStatus.BLOCKED,
//                200000,
//                Currency.RUB
//        );

        List<CardAccount> cards = new ArrayList<>(List.of(card1, card2));
        for (CardAccount card : cards) {
            System.out.println(card);
        }

        BankAccount bankAccount1 = new BankAccount(4000, card1.getNumber(), card1.getCurrency(), BankAccountType.DEBIT);
        BankAccount bankAccount2 = new BankAccount(3435, card2.getNumber(), card2.getCurrency(), BankAccountType.CREDIT);


        Holder cardHolder1 = new Holder(address1, 7777888, "Avet Harutyunyan", 88899998, cards, bankAccount1);
        System.out.println(cardHolder1);
        CardTransaction cardTransaction = new CardTransaction();

        cardTransaction.deposit(card1, 4500);

        cardTransaction.withDraw(card1, 4000);

        cardTransaction.transfer(card1, card2, 3000);

        System.out.println(cardTransaction.cardLimit(cards));

        BankAccount acc1 = new BankAccount(1000, "ACC123", Currency.USD, BankAccountType.DEBIT);
        BankAccount acc2 = new BankAccount(500, "ACC456", Currency.USD, BankAccountType.CREDIT);

        BankAccountTransaction transaction = new BankAccountTransaction();

        transaction.deposit(440, acc1);
        transaction.withdraw(100, acc1);
        transaction.transfer(300, acc2, acc1);

        System.out.println("acc1:\n" + acc1);
        System.out.println("acc2:\n" + acc2);
        
    }

}