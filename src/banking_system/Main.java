package banking_system;

import banking_system.models.Address;
import banking_system.models.BankAccount;
import banking_system.models.Card;
import banking_system.models.Holder;
import banking_system.enums.CardStatus;
import banking_system.enums.CardType;
import banking_system.enums.Currency;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Main {
        public static void main(String[] args) {
            Address address1 = new Address("Armenia", "Armavair", "Armavair", "baghramyan", 15);
            Card card1 = new Card(
                    "4567 1346 6754 1345",
                    "234",
                    LocalDate.of(2017 , Month.APRIL , 4),
                    CardType.VISA,
                    CardStatus.ACTIVE,
                    3400,
                    Currency.USD
            );

            Card card2 = new Card(
                    "8392 9745 2234 8224",
                    "544",
                    LocalDate.of(2009 , Month.AUGUST , 5),
                    CardType.AMERICAN_EXPRESS,
                    CardStatus.CLOSED,
                    76544,
                    Currency.AMD
            );

            List<Card> cards = new ArrayList<>(List.of(card1, card2));
            BankAccount bankAccount1 = new BankAccount(4000 , card1.getNumber() , card1.getCurrency());
            BankAccount bankAccount2 = new BankAccount(3435 , card2.getNumber(), card2.getCurrency());

            Holder cardHolder1 = new Holder(address1, 7777888, "Avet Harutyunyan"  , cards , bankAccount1);
            System.out.println(cardHolder1);

    }
}