package cc.xpbootcamp.code_smell_kit.$03_long_method;

public class Card {

    private String color;
    private String number;

    public Card(String color, String number) {
        this.color = color;
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public String getNumber() {
        return number;
    }
}
