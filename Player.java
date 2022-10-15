package javaassignment3;

import java.util.ArrayList;
import java.util.List;

public class Player {
   /*
    * Player class:
    * attributes - name (String), score (int), list of Card objects
    * methods - getName, getScore, incrementScore, draw, flip, describe
    */
   
   // ATTRIBUTES
   
   private List<Card> hand = new ArrayList<Card>();
   private int score;
   private String name;
   
   // CONSTRUCTOR
   
   public Player(String name) {
      // instantiates a new Player object and takes name as argument
      score = 0;
      this.name = name;
   }
   
   // GETTERS
   
   public int getScore() {
      return score;
   }
   
   public String getName() {
      return name;
   }
   
   // OTHER METHODS
   
   public void incrementScore() {
      // increments a Player's score by 1
      score += 1;
   }
   
   public void draw(Deck cards) {
      // draws a card from the passed-in Deck object and adds it to a 
      // Player's hand (ArrayList of Card objects)
      hand.add(cards.draw());
   }
   
   public Card flip() {
      // removes the top Card from a Player's hand and returns it
      return hand.remove(hand.size() - 1);
   }
   
   public void describe() {
      // Prints information (name, score, hand) about a Player to the console
      System.out.println("Player name: " + name);
      System.out.println("Score = " + score);
      for (Card card : hand) {
         card.describe();
      }
      System.out.println("");
   }

}
