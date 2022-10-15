package javaassignment3;

public class App {
   /*
    * Automated version of the classic card game WAR
    */

   public static void main(String[] args) {
      
      // Instantiating a Deck, 2 Players, and shuffling the Deck      
      Deck deck = new Deck();
      Player player1 = new Player("Holger");
      Player player2 = new Player("Perla");
      deck.shuffle();
      
      // Drawing a hand of 26 Cards from the Deck for each Player
      for (int i = 0; i < 52; i++) {
         if (i % 2 == 0) {
            player1.draw(deck);
         } else {
            player2.draw(deck);
         }
      }
      
      // Playing the game
      for (int i = 0; i < 26; i++) {
         
         Card cardPlayer1 = player1.flip();
         cardPlayer1.describe();
         
         Card cardPlayer2 = player2.flip();
         cardPlayer2.describe();
         
         if (cardPlayer1.getValue() > cardPlayer2.getValue()) {
            player1.incrementScore();
            System.out.println("Winner: " + player1.getName());
         } else if (cardPlayer2.getValue() > cardPlayer1.getValue()) {
            player2.incrementScore();
            System.out.println("Winner: " + player2.getName());
         }
         System.out.println("Current Score: " + player1.getScore() + " - " +
         player2.getScore());
         System.out.println("");
      }
      
      // Comparing the final scores of each Player and declaring a winner
      System.out.println("*** Final Score: ***");
      System.out.println(player1.getName() + " score = " + player1.getScore());
      System.out.println(player2.getName() + " score = " + player2.getScore());
      if (player1.getScore() > player2.getScore()) {
         System.out.println("WINNER: " + player1.getName());
      } else if (player2.getScore() > player1.getScore()) {
         System.out.println("WINNER: " + player2.getName());
      } else {
         System.out.println("DRAW");
      }
   }

}
