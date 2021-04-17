/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mathew Borg
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TicTacEvent implements ItemListener, ActionListener, Runnable { //creates a class that responds to mouse and keyboard input by “listening.”
    TicTac gui; //associates the game board with the event.
    Thread playing;
    ImageIcon a = new ImageIcon("src//images//X.jpg"); //creats imageicon
    ImageIcon b = new ImageIcon("src//images//O.jpg"); //creats imageicon
    //created to check for a winner.
    int clicks = 0;
    int win = 0;
    int[][] check = new int[3][3];

    public TicTacEvent (TicTac in){ //associates the two files to be used together.
        gui = in;
        //for loops initiates the winner check array.
        for (int row=0; row<=2; row++){
           for (int col=0; col<=2; col++){
               check[row][col]=0;
           }
       }
    }

    public void actionPerformed (ActionEvent event) { //tells the program what to do when a button is clicked.
       String command = event.getActionCommand(); //takes the button name as input from the button that is clicked.
       
       //checks the command variable and calls the appropriate method.
       if (command.equals("Play")) {
           startPlaying();
       }
       if (command.equals("1")) {
           b1();
       }
       if (command.equals("2")) {
           b2();
       }
       if (command.equals("3")) {
           b3();
       }
       if (command.equals("4")) {
           b4();
       }
       if (command.equals("5")) {
           b5();
       }
       if (command.equals("6")) {
           b6();
       }
       if (command.equals("7")) {
           b7();
       }
       if (command.equals("8")) {
           b8();
       }
       if (command.equals("9")) {
           b9();
       }
    }
     void b1() {
        clicks = clicks + 1; //keeps track of the number of boxes chosen
        if ((clicks%2)==1){ //puts an X on the board and declares that square to be taken.
            gui.boxes[0][0].setIcon(a);
            check[0][0] = 1;
        } else { //puts an O on the board and declares that square to be taken.
            gui.boxes[0][0].setIcon(b);
            check[0][0] = 2;
        }
        winner();

    }
    void b2() {
        clicks = clicks + 1;
        if ((clicks%2)==1){
            gui.boxes[0][1].setIcon(a);
            check[0][1] = 1;
        } else {
            gui.boxes[0][1].setIcon(b);
            check[0][1] = 2;
        }
        winner();
    }
    void b3() {
        clicks = clicks + 1;
        if ((clicks%2)==1){
            gui.boxes[0][2].setIcon(a);
            check[0][2] = 1;
        } else {
            gui.boxes[0][2].setIcon(b);
            check[0][2] = 2;
        }
        winner();
    }
    void b4() {
        clicks = clicks + 1;
        if ((clicks%2)==1){
            gui.boxes[1][0].setIcon(a);
            check[1][0] = 1;
        } else {
            gui.boxes[1][0].setIcon(b);
            check[1][0] = 2;
        }
        winner();
    }
    void b5() {
        clicks = clicks + 1;
        if ((clicks%2)==1){
            gui.boxes[1][1].setIcon(a);
            check[1][1] = 1;
        } else {
            gui.boxes[1][1].setIcon(b);
            check[1][1] = 2;
        }
        winner();
    }
    void b6() {
        clicks = clicks + 1;
        if ((clicks%2)==1){
            gui.boxes[1][2].setIcon(a);
            check[1][2] = 1;
        } else {
            gui.boxes[1][2].setIcon(b);
            check[1][2] = 2;
        }
        winner();
    }
    void b7() {
        clicks = clicks + 1;
        if ((clicks%2)==1){
            gui.boxes[2][0].setIcon(a);
            check[2][0] = 1;
        } else {
            gui.boxes[2][0].setIcon(b);
            check[2][0] = 2;
        }
        winner();
    }
    void b8() {
        clicks = clicks + 1;
        if ((clicks%2)==1){
            gui.boxes[2][1].setIcon(a);
            check[2][1] = 1;
        } else {
            gui.boxes[2][1].setIcon(b);
            check[2][1] = 2;
        }
        winner();
    }
    void b9() {
        clicks = clicks + 1;
        if ((clicks%2)==1){
            gui.boxes[2][2].setIcon(a);
            check[2][2] = 1;
        } else {
            gui.boxes[2][2].setIcon(b);
            check[2][2] = 2;
        }
        winner();
    }
    
    void startPlaying() {
        playing = new Thread(this); //the execution of the program. (this – within an instance method or a constructor, this is a reference to the current object.)
        playing.start(); //starts the game
        gui.play.setEnabled(false); //disables the play button
    }
    
    void winner() {
        /** Check rows for winner */
        
        for (int x=0; x<=2; x++){ //for loop checks eatch row
            //if statements  checks to see if all entries are X, or all entries are O
            if ((check[x][0]==check[x][1])&&(check[x][0]==check[x][2])) {
                if (check[x][0]==1) {
                    JOptionPane.showMessageDialog(null, "X is the winner"); // creates a pop up box declaring a winner
                    win = 1;
                } else if (check[x][0]==2){
                    JOptionPane.showMessageDialog(null, "O is the winner"); //  creates a pop up box declaring a winner.
                    win = 1;
                }
            }
        }

        /** Check columns for winner */
        for (int x=0; x<=2; x++){ //for loop checks each row
            //if statements  checks to see if all entries are X, or all entries are O
            if ((check[0][x]==check[1][x])&&(check[0][x]==check[2][x])) {
                if (check[0][x]==1) {
                    JOptionPane.showMessageDialog(null, "X is the winner"); // creates a pop up box declaring a winner
                    win = 1;
                } else if (check[0][x]==2) {
                    JOptionPane.showMessageDialog(null, "O is the winner"); //  creates a pop up box declaring a winner.
                    win = 1;
                }
            }
        }

        /** Check diagonals for winner */
        if (((check[0][0]==check[1][1])&&(check[0][0]==check[2][2]))|| 
                ((check[2][0]==check[1][1])&&(check[1][1]==check[0][2]))){ // checks for diagonal matches
            if (check[1][1]==1) { //checks for X or O winner.
                JOptionPane.showMessageDialog(null, "X is the winner"); //creates a pop up box declaring a winner.
                win = 1;
            } else if (check[1][1]==2) {
                JOptionPane.showMessageDialog(null, "O is the winner"); //creates a pop up box declaring a winner.
                win = 1;
            }

        }

        /** 
         * Checks if the game is a tie 
         * This structure checks to see if nine boxes have been 
         * chosen (clicks) and that a winner has not been declared (win == 0).
         */
        if ((clicks==9) && (win==0)) {
            JOptionPane.showMessageDialog(null, "The game is a tie");
        }
    }
    
    public void itemStateChanged(ItemEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void run() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
