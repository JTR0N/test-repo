public class App {

    public static void main(String[] args){

        // Create a new deck
        Deck deck = new Deck();
        // Shuffle the deck
        deck.shuffle();
        // Create two players
      Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");



      //each player draws 26 cards
          for(int i = 0; i < 52;i++){
            if(i % 2 == 0){
                player1.draw(deck);
            }else{
                player2.draw(deck);
            }
        }

          //play War the game
            for(int i = 0; i < 26; i++){
                Card player1Card = player1.flip();
                Card player2Card = player2.flip();

                if(player1Card.getValue() > player2Card.getValue()){
                    player1.incrementScore();
                }else if(player2Card.getValue() > player1Card.getValue()){
                    player2.incrementScore();
                }
            }

        // Print out the description of each player
        player1.describe();
        player2.describe();

        // Print out the winner
        if(player1.getScore() > player2.getScore()){
            System.out.println(player1.getName() + " wins!");
        }else if(player2.getScore() > player1.getScore()){
            System.out.println(player2.getName() + " wins!");
        }else{
            System.out.println("It's a tie!");
        }




    }



}
