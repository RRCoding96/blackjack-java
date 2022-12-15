import java.util.List;

public class Gamer {
    private List<Card> cards;

    public void receiveCard(Card card) {
        this.cards.add(card);
        showCards();
    }

    public void showCards() {
        StringBuilder sb = new StringBuilder();
        sb.append("현재 보유 카드 목록 \n");

        for (Card card : cards) {
            sb.append(card.toString());
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    public List<Card> openCards() {
        return this.cards;
    }
}
