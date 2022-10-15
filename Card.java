package javaassignment3;

public class Card {
   /*
    * Card class:
    * attributes - value (int), name (String)
    * methods - setters, getters, and describe
    */
   
   // ATTRIBUTES
   
   private int value;
   private String name;
   
   // GETTERS & SETTERS
   
   public int getValue() {
      return value;
   }
   
   public void setValue(int value) {
      this.value = value;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
   
   // OTHER METHODS
   
   public void describe() {
      // Prints the name and value of a given card to the console.
      System.out.println("Card name: " + name + "; card value = " + value);
   }

}
