import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
    programmer: Mathew Borg
    Date: 2021-04-8
    Program Name: U2A4P1_Borg_TicTacToe
    Program Discription: This program is a virtual TicTacToe board Game
*/
public class TicTac extends JFrame {
    TicTacEvent tictac = new TicTacEvent(this); //joins the two programs to work with each other

    final JPanel row1 = new JPanel(); //creats outline box
    public static final JButton[][] boxes = new JButton[4][4]; //creates nine buttons in a 2D array that is 3 x 3.
    final JButton play = new JButton("Play"); //creats play btn
    final JButton reset = new JButton("Reset"); //creats reset btn
    public static JTextField displayXWin = new JTextField(); //creats jtextfeild displayXWin
    public static JTextField displayOWin = new JTextField(); //creats jtextfeild displayOWin
    public static JTextField displayCatWin = new JTextField(); //creats jtextfeild displayCatWin
    public static JTextField blank1 = new JTextField(); //creats jtextfeild blank1
    final JOptionPane win = new JOptionPane("Winner"); //creats joptionpane win
    final ImageIcon back = new ImageIcon("src//images//cardback.jpg"); //creats new image icon with cardback.jpg

    public TicTac() { //method to draw game borard
        super("Tic Tac Toe"); //creates the outer frame with the title
        setSize(700, 800); //sets the size of the outer frame.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //sets the program to quit running when the window is closed
        FlowLayout layout = new FlowLayout(); //arranges components from left to right, centering components horizontally with a five pixel gap between them.
        setLayout(layout);
        int name = 0; //creats int name
        String newname; //creats string newname

        GridLayout layout1 = new GridLayout(6, 4, 10, 10); //arranges the components in a rectangular grid, where all cells are of equal size.
        row1.setLayout(layout1);
        //creates and adds the buttons to the GridLayout's first three rows
        for (int x = 0; x < boxes.length; x++) {
            for (int y = 0; y < boxes[x].length; y++) {
                name = name + 1;
                newname = Integer.toString(name);
                boxes[x][y] = new JButton(newname);
                boxes[x][y].setIcon(back);
                row1.add(boxes[x][y]); 
            }
        }
        //adds remaining components to the GridLayout.
        row1.add(displayXWin);
        row1.add(play);
        row1.add(displayOWin);
        row1.add(displayCatWin);
        row1.add(reset);
        row1.add(blank1);
        add(row1); //adds the GridLayout to the FlowLayout.
        
        
        //makes the program ready to handle mouse clicks.
        play.addActionListener(tictac); 
        reset.addActionListener(tictac); 
        for (int x=0; x < boxes.length; x++){
            for (int y=0; y < boxes[x].length; y++){
                boxes[x][y].addActionListener(tictac);
            }
        }

        setVisible(true); // shows the FlowLayout on the screen
    }

    public static void main(String[] arguments) {
        TicTac frame = new TicTac(); // runs the screen layout class
    }

}