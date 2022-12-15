public class Card {
    private String pattern; // 무늬
    private String denomination; // 끗수
    private int point; // 점수

    public Card(String pattern, int index) {
        this.pattern = pattern;
        this.denomination = this.numberToDenomination(index);
        this.point = this.numberToPoint(index);
    }

    private String numberToDenomination(int number) {
        switch (number) {
            case 1:
                return "A";
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";
            default:
                return String.valueOf(number);
        }
    }

    private int numberToPoint(int number) {
        if(number >= 11) {
            return 10;
        }

        return number;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getDenomination() {
        return denomination;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

    public int getPoint() {
        return point;
    }

    @Override
    public String toString() {
        return "Card{" +
                "pattern='" + pattern +
                ", denomination='" + denomination +
                '}';
    }
}
