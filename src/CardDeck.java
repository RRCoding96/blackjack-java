import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CardDeck {
    private static final String[] PATTERNS = {"spade", "heart", "diamond", "club"};
    private static final int CARD_COUNT = 13;

    private List<Card> cards;

    public CardDeck() {
        cards = this.generateCards();
    }

    private List<Card> generateCards() {
        List<Card> cards = new LinkedList<>();

        for(String pattern : PATTERNS) {
            for(int i=1; i<=CARD_COUNT; i++) {
                Card card = new Card();
                String denomination = this.numberToDenomination(i);

                card.setDenomination(denomination);
                card.setPattern(pattern);

                cards.add(card);
            }
        }

        return cards;
    }

    private String numberToDenomination(int number) {
        switch (number) {
            case 1 : return "A";
            case 11 : return "J";
            case 12 : return "Q";
            case 13 : return "K";
            default: return String.valueOf(number);
        }
    }

    public Card getCard() {
        return null;
    }
}
