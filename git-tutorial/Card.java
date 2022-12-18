public class Card {

    int value;
    String name;

    public Card(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public String describe() {
        return  name + " Value: " + value;
    }




}
