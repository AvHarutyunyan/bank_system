package banking_system.code_usage;

import banking_system.models.address.Address;
import banking_system.models.card.Card;
import banking_system.models.card_holder.CardHolder;
import banking_system.enums.card_status.CardStatus;
import banking_system.enums.card_type.CardType;
import banking_system.enums.card_currency.Currency;

import java.time.YearMonth;

public class Main {
        public static void main(String[] args) {
            Address address1 = new Address("Armenia", "Armavair", "Armavair", "baghramyan", 15);
            CardHolder cardHolder1 = new CardHolder(1184564987, "Avet Harutyunyan ", address1);
            Card card1 = new Card(
                    "45234234234",
                    "234",
                    YearMonth.of(2017, 12),
                    CardType.VISA,
                    CardStatus.ACTIVE,
                    3400,
                    cardHolder1.getHolderId(),
                    Currency.USD
            );
            System.out.println(card1);
    }
}