import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;

/*
    programmer: Mathew Borg
    Date: 2021-03-27
    Program Name: U2A3P1_Borg_MatchGame
    Program Discription: This profram uses arrays to simulate a matching game.
    A grid of cards will be displayed and the user is to select 2 cards at a time
    looking for a matching card. the goal of this game is to see how quickly
    the user can find all the matches. 
*/
public class CardDealer {
    //Creats String Array Lists
    static ArrayList <String> cards = new ArrayList();
    static ArrayList <String> set = new ArrayList();
    
    //assigns images to ImageIcon
    static ImageIcon a = new ImageIcon("src\\images\\AC.jpg");
    static ImageIcon b = new ImageIcon("src\\images\\DG.jpg");
    static ImageIcon c = new ImageIcon("src\\images\\GO.jpg");
    static ImageIcon d = new ImageIcon("src\\images\\IJ.jpg");
    static ImageIcon e = new ImageIcon("src\\images\\PC.jpg");
    static ImageIcon f = new ImageIcon("src\\images\\PS.jpg");
    static ImageIcon g = new ImageIcon("src\\images\\UP.jpg");
    static ImageIcon h = new ImageIcon("src\\images\\WS.jpg");
    static ImageIcon i = new ImageIcon("src\\images\\RM.jpg");
    static ImageIcon j = new ImageIcon("src\\images\\LOGO.jpg");
    static ImageIcon back = new ImageIcon("src\\images\\cardback.jpg");
    static ImageIcon done = new ImageIcon("src\\images\\done.jpg");
    
    //creats Ints and int array
    static int count, c1, c2, card1, card2;
    static int cardsLeft = 20;
    static int numberOfClicks = 0;
    static int[] change = new int [20];
    
    /*
    Function:   deckinit
    Purpose:    This method initalises all the forloops for the match game
    Parameters: int deckTotalNum to get the length of the deck
    Return:     void 
    */
    public static void deckinit(int deckTotalNum){
        int theDeckTotal, deckHalf; //creats int
        
        theDeckTotal =+ deckTotalNum; //adds deckTotalNum to theDeckTotal
        theDeckTotal -= 1; //takes 1 away from theDeckTotal
        
        deckHalf =+ theDeckTotal; //adds theDeckTotal to deckHalf
        deckHalf /= 2; //devides deckHalf by 2
        
        //Set the change array. This section sets up the array to check if a match has been made.
        for (int z = 0; z <= theDeckTotal; z++){
            change[z] = 1;
        }
        
        /*
        Assign cards at random.
        The outer loop puts the numbers zero to seven in the set arrayList.
        The inner loop puts the numbers in two consecutive array entries.
        The set.add(temp) line puts the entry in the next available position.
        The double index = Math.floor (Math.random() * (16-x)) creates a random 
        number and converts it to integer status.
        The next two lines add the card to the random arrayList cards, remove 
        them from the original array, then renumber the remaining cards. The 
        random number is then generated again, but for one less element.
        */
        
        String temp;
        for (int x = 0; x <= deckHalf; x++){
            for (int y = 1; y <= 2; y++){
                temp = Integer.toString(x);
                set.add(temp);
            }
        }
        
        for (int x = 0; x <= theDeckTotal; x++){
            double index = Math.floor(Math.random()*(deckTotalNum-x));
            int index1 = (int) index;
            cards.add(set.get(index1));
            set.remove(set.get(index1));
        }
    }
    
    /*
    Function:   cardClicked
    Purpose:    This method checks to see what random picture is placed in the box, 
                assigns the proper picture then sets the card to a one or two so 
                it can be determonded as a match or not
    Parameters: int cardNum for seting Card Number
                JTextField outputBox to give access to outputBox
                JButton[] jButtonArray to give access to jButtonArray
    Return:     void 
    */
    public static void cardClicked(int cardNum, JTextField outputBox, JButton[] jButtonArray){
        try{ //try to run method
        cardNum = cardNum -= 1; //takes 1 away from cardNum 
        numberOfClicks = numberOfClicks += 1;
        
        //checks to see what random picture is placed in the box.
        String temp = cards.get(cardNum); 
        
        // checks the card and assigns the proper picture.
        if (temp.equals("0")){
            //changes the button icon to the correct picture.
            jButtonArray[cardNum].setIcon(a);
        }else if (temp.equals("1")){
            jButtonArray[cardNum].setIcon(b);
        }else if (temp.equals("2")){
            jButtonArray[cardNum].setIcon(c);
        }else if (temp.equals("3")){
            jButtonArray[cardNum].setIcon(d);
        }else if (temp.equals("4")){
            jButtonArray[cardNum].setIcon(e);
        }else if (temp.equals("5")){
            jButtonArray[cardNum].setIcon(f);
        }else if (temp.equals("6")){
            jButtonArray[cardNum].setIcon(g);
        }else if (temp.equals("7")){
            jButtonArray[cardNum].setIcon(h);
        }else if (temp.equals("8")){
            jButtonArray[cardNum].setIcon(i);
        }else if (temp.equals("9")){
            jButtonArray[cardNum].setIcon(j);
        }
      
        /*
        The first line sets the card chosen to one or two so it can be checked 
        for a match. The if structure sets the appropriate card chosen, and 
        then sets the change array to show the card icon has been changed.
        */
        count ++;
        if (count == 1) {
            c1 = Integer.parseInt(temp);
            change[cardNum] = 0;
        } else if (count == 2) {
            c2 = Integer.parseInt(temp);
            change[cardNum] = 0;
        } 
        
        //if number of card clicks => 3 change icond back to back, display Please Only Click 2 Cards At A Time and reset number of clicks
        if(numberOfClicks >= 3){ 
            jButtonArray[cardNum].setIcon(back);
            checkPair(outputBox, jButtonArray);
            numberOfClicks = 0;
            outputBox.setText("Please Only Click 2 Cards At A Time");
        }
        }catch(IndexOutOfBoundsException e){ //catch IndexOutOfBoundsException
            outputBox.setText("Please Click Play To Start"); // display Please Click Play To Start
        }
    }
    
    /*
    Function:   checkPair
    Purpose:    This method checks to see if a pair has been made and sets the 
                paired cards to the done image. It also tells the player when
                all cards have been matched
    Parameters: JTextField outputBox to give access to outputBox
                JButton[] jButtonArray to give access to jButtonArray
    Return:     void 
    */
    public static void checkPair(JTextField outputBox, JButton[] jButtonArray){
        count = 0; //sets count to =
        numberOfClicks = 0; //sets numberOfClicks to 0
        if(c1 == c2){ //if c1 = c2
            numberOfClicks = 0; //sets numberOfClicks to 0
            //checks all cards to see if two cards are the same and will set the done image else they will set the cards back to back image
            for(int y = 1; y <= 2; y++){
                if(change[0] == 0){
                    jButtonArray[0].setIcon(done);
                    change[0] = 2;
                    cardsLeft -= 1;
                }else if(change[1] == 0){
                    jButtonArray[1].setIcon(done);
                    change[1] = 2;
                    cardsLeft -= 1;
                }else if(change[2] == 0){
                    jButtonArray[2].setIcon(done);
                    change[2] = 2;
                    cardsLeft -= 1;
                }else if(change[3] == 0){
                    jButtonArray[3].setIcon(done);
                    change[3] = 2;
                    cardsLeft -= 1;
                }else if(change[4] == 0){
                    jButtonArray[4].setIcon(done);
                    change[4] = 2;
                    cardsLeft -= 1;
                }else if(change[5] == 0){
                    jButtonArray[5].setIcon(done);
                    change[5] = 2;
                    cardsLeft -= 1;
                }else if(change[6] == 0){
                    jButtonArray[6].setIcon(done);
                    change[6] = 2;
                    cardsLeft -= 1;
                }else if(change[7] == 0){
                    jButtonArray[7].setIcon(done);
                    change[7] = 2;
                    cardsLeft -= 1;
                }else if(change[8] == 0){
                    jButtonArray[8].setIcon(done);
                    change[8] = 2;
                    cardsLeft -= 1;
                }else if(change[9] == 0){
                    jButtonArray[9].setIcon(done);
                    change[9] = 2;
                    cardsLeft -= 1;
                }else if(change[10] == 0){
                    jButtonArray[10].setIcon(done);
                    change[10] = 2;
                    cardsLeft -= 1;
                }else if(change[11] == 0){
                    jButtonArray[11].setIcon(done);
                    change[11] = 2;
                    cardsLeft -= 1;
                }else if(change[12] == 0){
                    jButtonArray[12].setIcon(done);
                    change[12] = 2;
                    cardsLeft -= 1;
                }else if(change[13] == 0){
                    jButtonArray[13].setIcon(done);
                    change[13] = 2;
                    cardsLeft -= 1;
                }else if(change[14] == 0){
                    jButtonArray[14].setIcon(done);
                    change[14] = 2;
                    cardsLeft -= 1;
                }else if(change[15] == 0){
                    jButtonArray[15].setIcon(done);
                    change[15] = 2;
                    cardsLeft -= 1;
                }else if(change[16] == 0){
                    jButtonArray[16].setIcon(done);
                    change[16] = 2;
                    cardsLeft -= 1;
                }else if(change[17] == 0){
                    jButtonArray[17].setIcon(done);
                    change[17] = 2;
                    cardsLeft -= 1;
                }else if(change[18] == 0){
                    jButtonArray[18].setIcon(done);
                    change[18] = 2;
                    cardsLeft -= 1;
                }else if(change[19] == 0){
                    jButtonArray[19].setIcon(done);
                    change[19] = 2;
                    cardsLeft -= 1;
                }
            }
        }else{
            for (int y = 1; y<=2; y++) {
                 if (change[0] == 0) {
                     jButtonArray[0].setIcon(back);
                     change[0] = 1;
                 }else if(change[1] == 0){
                     jButtonArray[1].setIcon(back);
                     change[1] = 1;
                 }else if(change[2] == 0){
                     jButtonArray[2].setIcon(back);
                     change[2] = 1;
                 }else if(change[3] == 0){
                     jButtonArray[3].setIcon(back);
                     change[3] = 1;
                 }else if(change[4] == 0){
                     jButtonArray[4].setIcon(back);
                     change[4] = 1;
                 }else if(change[5] == 0){
                     jButtonArray[5].setIcon(back);
                     change[5] = 1;
                 }else if(change[6] == 0){
                     jButtonArray[6].setIcon(back);
                     change[6] = 1;
                 }else if(change[7] == 0){
                     jButtonArray[7].setIcon(back);
                     change[7] = 1;
                 }else if(change[8] == 0){
                     jButtonArray[8].setIcon(back);
                     change[8] = 1;
                 }else if(change[9] == 0){
                     jButtonArray[9].setIcon(back);
                     change[9] = 1;
                 }else if(change[10] == 0){
                     jButtonArray[10].setIcon(back);
                     change[10] = 1;
                 }else if(change[11] == 0){
                     jButtonArray[11].setIcon(back);
                     change[11] = 1;
                 }else if(change[12] == 0){
                     jButtonArray[12].setIcon(back);
                     change[12] = 1;
                 }else if(change[13] == 0){
                     jButtonArray[13].setIcon(back);
                     change[13] = 1;
                 }else if(change[14] == 0){
                     jButtonArray[14].setIcon(back);
                     change[14] = 1;
                 }else if(change[15] == 0){
                     jButtonArray[15].setIcon(back);
                     change[15] = 1;
                 }else if(change[16] == 0){
                     jButtonArray[16].setIcon(back);
                     change[16] = 1;
                 }else if(change[17] == 0){
                     jButtonArray[17].setIcon(back);
                     change[17] = 1;
                 }else if(change[18] == 0){
                     jButtonArray[18].setIcon(back);
                     change[18] = 1;
                 }else if(change[19] == 0){
                     jButtonArray[19].setIcon(back);
                     change[19] = 1;
                 }
            }
        }
        //if cards left = 0 set output box to Congratulations You Have Beat The Game!! Please Exit The Game
        if(cardsLeft <= 0){ //if cards left = 0 set output box to Congratulations You Have Beat The Game!! Please Exit The Game
            outputBox.setText("Congratulations You Have Beat The Game!! Please Exit The Game");
        }
        //else set the outputBox to Click the Play button to start. Make sure to click Guess Again after each guess.
        else{
            outputBox.setText("Click the Play button to start. Make sure to click Guess Again after each guess.");
        }
    } 
}