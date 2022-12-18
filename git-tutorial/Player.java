import java.util.ArrayList;

public class Player {

    public ArrayList<Card> hand;
    public int score;
    public String name;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<Card>();
        this.score = 0;
    }
    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public void describe() {
        System.out.println(name + " has " + score + " points.");
        System.out.println("Their hand is: " + hand);

    }
    public void draw(Deck deck) {
        Card drawnCard = deck.draw();
        hand.add(drawnCard);
        score += drawnCard.getValue();
    }



    public Card flip() {
        Card card = null;
        if (hand.size() > 0) {
            card = hand.remove(0);
            System.out.println(name + " flipped " + card.getName());
            score += card.getValue();
        }
        return card;
    }

    public void incrementScore() {
        score++;
    }




}
