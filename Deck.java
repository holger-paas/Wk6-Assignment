package javaassignment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
   
   private List<Card> cards = new ArrayList<Card>();
   
   public Deck() {
      createDeck();      
   }
   
   public Card draw() {
      return cards.remove(cards.size() - 1);
   }
   
   public void shuffle() {
      Collections.shuffle(cards);
      
   }
   
   
   private void createDeck() {
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
   
   private String valueToSuit(int suitValue) {
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
