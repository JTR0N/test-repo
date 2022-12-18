import java.util.ArrayList;

public class Deck {

   public ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<Card>();

        cards.add(new Card(2, "Two"));
        cards.add(new Card(2, "Two"));
        cards.add(new Card(2, "Two"));
        cards.add(new Card(2, "Two"));

        cards.add(new Card(3, "Three"));
        cards.add(new Card(3, "Three"));
        cards.add(new Card(3, "Three"));
        cards.add(new Card(3, "Three"));

        cards.add(new Card(4, "Four"));
        cards.add(new Card(4, "Four"));
        cards.add(new Card(4, "Four"));
        cards.add(new Card(4, "Four"));

        cards.add(new Card(5, "Five"));
        cards.add(new Card(5, "Five"));
        cards.add(new Card(5, "Five"));
        cards.add(new Card(5, "Five"));

        cards.add(new Card(6, "Six"));
        cards.add(new Card(6, "Six"));
        cards.add(new Card(6, "Six"));
        cards.add(new Card(6, "Six"));

        cards.add(new Card(7, "Seven"));
        cards.add(new Card(7, "Seven"));
        cards.add(new Card(7, "Seven"));
        cards.add(new Card(7, "Seven"));

        cards.add(new Card(8, "Eight"));
        cards.add(new Card(8, "Eight"));
        cards.add(new Card(8, "Eight"));
        cards.add(new Card(8, "Eight"));

        cards.add(new Card(9, "Nine"));
        cards.add(new Card(9, "Nine"));
        cards.add(new Card(9, "Nine"));
        cards.add(new Card(9, "Nine"));


        cards.add(new Card(11, "Ten"));
        cards.add(new Card(11, "Ten"));
        cards.add(new Card(11, "Ten"));
        cards.add(new Card(11, "Ten"));

        cards.add(new Card(12, "Jack"));
        cards.add(new Card(12, "Jack"));
        cards.add(new Card(12, "Jack"));
        cards.add(new Card(12, "Jack"));

        cards.add(new Card(13, "Queen"));
        cards.add(new Card(13, "Queen"));
        cards.add(new Card(13, "Queen"));
        cards.add(new Card(13, "Queen"));

        cards.add(new Card(14, "King"));
        cards.add(new Card(14, "King"));
        cards.add(new Card(14, "King"));
        cards.add(new Card(14, "King"));

        cards.add(new Card(15, "Ace"));
        cards.add(new Card(15, "Ace"));
        cards.add(new Card(15, "Ace"));
        cards.add(new Card(15, "Ace"));

    }

    public void shuffle() {
        ArrayList<Card> shuffledCards = new ArrayList<Card>();
        while (cards.size() > 0) {
            int index = (int) (Math.random() * cards.size());
            shuffledCards.add(cards.get(index));
            cards.remove(index);
        }
        cards = shuffledCards;
    }

    public Card draw() {
        return cards.remove(0);
    }









}
