import java.util.List;

public class Gamer {
    private List<Card> cards;

    public void receiveCard(Card card){
        this.cards.add(card);
    }

    public List<Card> openCards() {
        return null;
    }
}
