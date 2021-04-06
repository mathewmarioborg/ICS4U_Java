
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

    public static void deckinit(){
        //Set the change array. This section sets up the array to check if a match has been made.
        for (int z = 0; z <= 19; z++){
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
        for (int x = 0; x <= 9; x++){
            for (int y = 1; y <= 2; y++){
                temp = Integer.toString(x);
                set.add(temp);
            }
        }
        
        for (int x = 0; x <= 19; x++){
            double index = Math.floor(Math.random()*(20-x));
            int index1 = (int) index;
            cards.add(set.get(index1));
            set.remove(set.get(index1));
        }
    }
    
    public static void cardClicked(javax.swing.JButton button, int cardNum){
        cardNum = cardNum -= 1; //takes one away frim 
        
        //checks to see what random picture is placed in the box.
        String temp = cards.get(cardNum); 
        
        // checks the card and assigns the proper picture.
        if (temp.equals("0")){
            //changes the button icon to the correct picture.
            button.setIcon(a);
        }else if (temp.equals("1")){
            button.setIcon(b);
        }else if (temp.equals("2")){
            button.setIcon(c);
        }else if (temp.equals("3")){
            button.setIcon(d);
        }else if (temp.equals("4")){
            button.setIcon(e);
        }else if (temp.equals("5")){
            button.setIcon(f);
        }else if (temp.equals("6")){
            button.setIcon(g);
        }else if (temp.equals("7")){
            button.setIcon(h);
        }else if (temp.equals("8")){
            button.setIcon(i);
        }else if (temp.equals("9")){
            button.setIcon(j);
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
        
    }
    
    public static void checkPair(JTextField outPutBox, JButton btn1, JButton btn2, JButton btn3, JButton btn4, JButton btn5, JButton btn6, JButton btn7, JButton btn8, JButton btn9, JButton btn10, JButton btn11, JButton btn12, JButton btn13, JButton btn14, JButton btn15, JButton btn16, JButton btn17, JButton btn18, JButton btn19, JButton btn20){
        count = 0;
        if(c1 == c2){
            numberOfClicks = 0; //resets number of clicks 
            for(int y = 1; y <= 2; y++){
                if(change[0] == 0){
                    btn1.setIcon(done);
                    change[0] = 2;
                    cardsLeft -= 1;
                }else if(change[1] == 0){
                    btn2.setIcon(done);
                    change[1] = 2;
                    cardsLeft -= 1;
                }else if(change[2] == 0){
                    btn3.setIcon(done);
                    change[2] = 2;
                    cardsLeft -= 1;
                }else if(change[3] == 0){
                    btn4.setIcon(done);
                    change[3] = 2;
                    cardsLeft -= 1;
                }else if(change[4] == 0){
                    btn5.setIcon(done);
                    change[4] = 2;
                    cardsLeft -= 1;
                }else if(change[5] == 0){
                    btn6.setIcon(done);
                    change[5] = 2;
                    cardsLeft -= 1;
                }else if(change[6] == 0){
                    btn7.setIcon(done);
                    change[6] = 2;
                    cardsLeft -= 1;
                }else if(change[7] == 0){
                    btn8.setIcon(done);
                    change[7] = 2;
                    cardsLeft -= 1;
                }else if(change[8] == 0){
                    btn9.setIcon(done);
                    change[8] = 2;
                    cardsLeft -= 1;
                }else if(change[9] == 0){
                    btn10.setIcon(done);
                    change[9] = 2;
                    cardsLeft -= 1;
                }else if(change[10] == 0){
                    btn11.setIcon(done);
                    change[10] = 2;
                    cardsLeft -= 1;
                }else if(change[11] == 0){
                    btn12.setIcon(done);
                    change[11] = 2;
                    cardsLeft -= 1;
                }else if(change[12] == 0){
                    btn13.setIcon(done);
                    change[12] = 2;
                    cardsLeft -= 1;
                }else if(change[13] == 0){
                    btn14.setIcon(done);
                    change[13] = 2;
                    cardsLeft -= 1;
                }else if(change[14] == 0){
                    btn15.setIcon(done);
                    change[14] = 2;
                    cardsLeft -= 1;
                }else if(change[15] == 0){
                    btn16.setIcon(done);
                    change[15] = 2;
                    cardsLeft -= 1;
                }else if(change[16] == 0){
                    btn17.setIcon(done);
                    change[16] = 2;
                    cardsLeft -= 1;
                }else if(change[17] == 0){
                    btn18.setIcon(done);
                    change[17] = 2;
                    cardsLeft -= 1;
                }else if(change[18] == 0){
                    btn19.setIcon(done);
                    change[18] = 2;
                    cardsLeft -= 1;
                }else if(change[19] == 0){
                    btn20.setIcon(done);
                    change[19] = 2;
                    cardsLeft -= 1;
                }
            }
        }else{
            for (int y = 1; y<=2; y++) {
                 if (change[0] == 0) {
                     btn1.setIcon(back);
                     change[0] = 1;
                 }else if(change[1] == 0){
                     btn2.setIcon(back);
                     change[1] = 1;
                 }else if(change[2] == 0){
                     btn3.setIcon(back);
                     change[2] = 1;
                 }else if(change[3] == 0){
                     btn4.setIcon(back);
                     change[3] = 1;
                 }else if(change[4] == 0){
                     btn5.setIcon(back);
                     change[4] = 1;
                 }else if(change[5] == 0){
                     btn6.setIcon(back);
                     change[5] = 1;
                 }else if(change[6] == 0){
                     btn7.setIcon(back);
                     change[6] = 1;
                 }else if(change[7] == 0){
                     btn8.setIcon(back);
                     change[7] = 1;
                 }else if(change[8] == 0){
                     btn9.setIcon(back);
                     change[8] = 1;
                 }else if(change[9] == 0){
                     btn10.setIcon(back);
                     change[9] = 1;
                 }else if(change[10] == 0){
                     btn11.setIcon(back);
                     change[10] = 1;
                 }else if(change[11] == 0){
                     btn12.setIcon(back);
                     change[11] = 1;
                 }else if(change[12] == 0){
                     btn13.setIcon(back);
                     change[12] = 1;
                 }else if(change[13] == 0){
                     btn14.setIcon(back);
                     change[13] = 1;
                 }else if(change[14] == 0){
                     btn15.setIcon(back);
                     change[14] = 1;
                 }else if(change[15] == 0){
                     btn16.setIcon(back);
                     change[15] = 1;
                 }else if(change[16] == 0){
                     btn17.setIcon(back);
                     change[16] = 1;
                 }else if(change[17] == 0){
                     btn18.setIcon(back);
                     change[17] = 1;
                 }else if(change[18] == 0){
                     btn19.setIcon(back);
                     change[18] = 1;
                 }else if(change[19] == 0){
                     btn20.setIcon(back);
                     change[19] = 1;
                 }
            }
        }
        if(cardsLeft <= 0){
            outPutBox.setText("Congratulations You Have Beat The Game!! Please Exit The Game");
        }else{
            outPutBox.setText("Click the Play button to start. Make sure to click Guess Again after each guess.");
        }
    } 
}
