package javaassignment3;

import java.util.ArrayList;
import java.util.List;

public class Player {
   
   private List<Card> hand = new ArrayList<Card>();
   private int score;
   private String name;
   
   public Player(String name) {
      score = 0;
      this.name = name;
   }
   
   public int getScore() {
      return score;
   }
   
   public String getName() {
      return name;
   }
   
   public void incrementScore() {
      score += 1;
   }
   
   public void draw(Deck cards) {
      hand.add(cards.draw());
   }
   
   public Card flip() {
      return hand.remove(hand.size() - 1);
   }
   
   public void describe() {
      System.out.println("Player name: " + name);
      System.out.println("Score = " + score);
      for (Card card : hand) {
         card.describe();
      }
      System.out.println("");
   }

}
