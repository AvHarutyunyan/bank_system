package simple_banking_system;

import java.time.YearMonth;

public class CardTransaction {
    public static void main(String[] args) {
        Date date;
        Address address1 = new Address("Armenia", "Armavair", "Armavair", "baghramyan", 15);
        CardHolder cardHolder1 = new CardHolder(1184564987, "Avet Harutyunyan ", address1);
        Card card1 = new Card(
                "45234234234",
                "234", // CVV
                YearMonth.of(2026, 12),
                CardType.VISA,
                CardStatus.ACTIVE,
                3400,
                cardHolder1.getHolderId(),
                Currency.USD
        );
        System.out.println(card1);
    }
}

