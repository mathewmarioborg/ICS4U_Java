
/*
    programmer: Mathew Borg
    Date: 2021-06-10
    Program Name: U4A1P2_Borg_BlackJack
    Program Discription: This program lets you play black jack against the dealer 
 */
public class CardDeck {
    public static boolean acePresent = false;
    
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
    
    /*
        Function: generateCard
        Purpose:  to create a random card 
        Parameters: n/a
        Return: String[]
     */
    public static String[] generateCard(){
        int cardNum = (int)(Math.random() * 52); //creats random number
        String[][] cardData = cardDeck(); //creats a card deck 
        String[] returnCard = new String[4]; //creats string array
        
        //gets card data
        String value = cardData[cardNum][0];
        String suit = cardData[cardNum][1];
        String colour = cardData[cardNum][2];
        
        //sets return cardData
        returnCard[0] = value;
        returnCard[1] = suit;
        returnCard[2] = colour;
        returnCard[3] = Integer.toString(cardNum);
        
        
        return returnCard; //return card
    }
    
    /*
        Function: cardValue
        Purpose:  to get the value of a card 
        Parameters: String cardValue to get the card values 
        Return: int 
     */
    public static int cardValue(String cardValue){
        int cardNumValue = 0; //creats int 
        acePresent = false; //sets boolean to falsae
        
        if(null == cardValue){ //if null = cardValue
            acePresent = false; //sets boolean to false 
            cardNumValue = 0; //sets cardNumValue to 0
            return -1; //return -1
        } else switch (cardValue) { //else switch cardValue
            case "ACE": //if cace string 
                acePresent = true; //set boolean to true 
                cardNumValue = 0; //set cardNumValue value 
                break;
            case "2":
                cardNumValue = 2; 
                break;
            case "3":
                cardNumValue = 3; 
                break;
            case "4":
                cardNumValue = 4;
                break;
            case "5":
                cardNumValue = 5;
                break;
            case "6":
                cardNumValue = 6;
                break;
            case "7":
                cardNumValue = 7;
                break;
            case "8":
                cardNumValue = 8;
                break;
            case "9":
                cardNumValue = 9;
                break;
            case "10":
                cardNumValue = 10;
                break;
            case "JOKER":
                cardNumValue = 10;
                break;
            case "QUEEN":
                cardNumValue = 10;
                break;
            case "KING":
                cardNumValue = 10;
                break;
            default:
                acePresent = false; //sets boolean to false 
                return -1; //return -1
        }
        return cardNumValue; //return cardNumValue
    }
    
    /*
        Function: handValue
        Purpose:  to get the total values of the cards in the hand 
        Parameters: int[] cards to get the values of all cards in the hand
                    boolean isAcePresent to know if there is a ace present
        Return: int 
     */
    public static int handValue(int[] cards, boolean isAcePresent) {
        int handValue = 0; //creats int 
        
        if (!isAcePresent) { //if boolean is false
            for (int num : cards) { //creats advanced for loop 
                handValue = handValue + num; //handValue plus num
            }
        }else{ //else
            int handWithoutAce = 0; //creats int 
            
            for (int num : cards) { //creats advanced for loop 
                handWithoutAce = handWithoutAce + num; //handWithoutAce plus num
            }
            
            if(handWithoutAce + 11 <= 21){ //if handWithoutAce plus 11 < or equal to 21 
               handValue = handWithoutAce + 10; //handValue = handWithoutAce plus 10
            }else{ //else
                handValue = handWithoutAce + 1; //handValue equals handWithoutAce + 1
            }
        }
        return handValue; //return handValue
    } 
}
