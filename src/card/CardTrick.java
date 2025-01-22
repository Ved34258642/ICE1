/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

public class CardTrick {
    
    public static void main(String[] args)
    {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        Card[] magicHand = new Card[7];
        
       for (int i = 0; i < magicHand.length; i++) {
            int value = (int) (Math.random() * 13) + 1; // Card value 1-13
            String suit = suits[(int) (Math.random() * 4)]; // Random suit
            magicHand[i] = new Card(value, suit);
            System.out.println(suit + " " + value); // Display the magic hand
        }
        Card luckyCard = new Card(7, "Hearts");

       
        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == luckyCard.getValue() && card.getSuit().equals(luckyCard.getSuit())) {
                found = true;
                break;
            }
        }

       
        if (found) {
            System.out.println("Congratulations! The lucky card is in the magic hand!");
        } else {
            System.out.println("Sorry, the lucky card is not in the magic hand.");
        }
       
    
} 
}
