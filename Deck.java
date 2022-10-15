package javaassignment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
   /*
    * Deck class:
    * attributes - list of card objects
    * methods - draw, shuffle, createDeck
    * helper methods -  valueToSuit, valueToText
    */
   
   // ATTRIBUTES
   
   private List<Card> cards = new ArrayList<Card>();
   
   // CONSTRUCTOR  
   
   public Deck() {
      // calls createDeck() method to create standard 52-card deck
      createDeck();      
   }
   
   // METHODS
   
   public Card draw() {
      // returns the top card by removing it from the deck
      return cards.remove(cards.size() - 1);
   }
   
   public void shuffle() {
      // puts Card objects in ArrayList 'cards' in random order
      Collections.shuffle(cards);
   }
   
   private void createDeck() {
      // sets distinct value and name pairs of new Card objects and
      // adds them to the ArrayList 'cards' to create a 52-card deck
      for (int i = 0; i <= 3; i++) {
         for (int j = 2; j <= 14; j++) {
            Card card = new Card();
            String name = valueToText(j) + " of " + valueToSuit(i);
            card.setValue(j);
            card.setName(name);
            cards.add(card);     
         }
      }
   }
   
   // HELPER METHODS
   
   private String valueToSuit(int suitValue) {
      // Converts numerical value to suit and returns it.
      String suitText;      
      switch (suitValue) {
      case 0:
         suitText = "Clubs";
         break;
      case 1:
         suitText = "Diamonds";
         break;
      case 2:
         suitText = "Hearts";
         break;
      case 3:
         suitText = "Spades";
         break;
         default:
            suitText = "";
      }
      return suitText;
   }
   
   private String valueToText(int value) {
      // Converts numerical value to text and returns it.
      String valueText;      
      switch (value) {
      case 2:
         valueText = "Two";
         break;
      case 3:
         valueText = "Three";
         break;
      case 4:
         valueText = "Four";
         break;
      case 5:
         valueText = "Five";
         break;
      case 6:
         valueText = "Six";
         break;
      case 7:
         valueText = "Seven";
         break;
      case 8:
         valueText = "Eight";
         break;
      case 9:
         valueText = "Nine";
         break;
      case 10:
         valueText = "Ten";
         break;
      case 11:
         valueText = "Jack";
         break;
      case 12:
         valueText = "Queen";
         break;
      case 13:
         valueText = "King";
         break;
      case 14:
         valueText = "Ace";
         break;
         default:
            valueText = "";
      }
      return valueText;
   }
   
}
