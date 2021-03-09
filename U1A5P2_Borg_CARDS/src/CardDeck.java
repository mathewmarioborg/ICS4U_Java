/**
    File Name:	U1A5P2_Borg_CARDS
    Programmer:	Mathew Borg
    Date:	2021-3-4
    Description:This program determine the suit and card number from a deck of cards.
 */
public class CardDeck {
    /*
    Function:  cardDeck
    Purpose:  This method determine the suit and card number from a deck of cards.
    Parameters:  2D string input for card number and for value, suit or colour data
    Return: String 
    */
    public static String[][] cardDeck(){
        //creats strings with values for colour, suit, and value
        String[] colour = {"BLACK", "RED"};
        String[] suit = {"CLUBS", "SPADES", "HEARTS", "DIAMONDS"};
        String[] value = {"ACE", "2", "3", "4", "5", "6", "7", "8", "9", "10", "JOKER", "QUEEN", "KING"};
        String[][] deck = new String[52][]; //creats a 2D string for deck
        
        for (int i = 0; i < deck.length; i++){ //creats a loop from 0 to deck length
            // uses interger division to calculate colour and sute of the card. uses modulo operator to calculate the value of the card
            deck[i] = new String[]{value[i%13], suit[i/13], colour[i/26]};
        }
        return deck; // returns deck to the method
    }
}
