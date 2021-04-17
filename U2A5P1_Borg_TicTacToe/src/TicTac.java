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
    final JButton[][] boxes = new JButton[3][3]; // creates nine buttons in a 2D array that is 3 x 3.
    final JButton play = new JButton("Play"); //creats play btn
    final JTextField blank1 = new JTextField(); //creats jtextfeild blank1
    final JTextField blank2 = new JTextField(); //creats jtextfeild blank2
    final JOptionPane win = new JOptionPane("Winner"); //creats joptionpane win
    final ImageIcon back = new ImageIcon("src//images//cardback.jpg"); //creats new image icon with cardback.jpg

    public TicTac() { //method to draw game borard
        super("Tic Tac Toe"); //creates the outer frame with the title
        setSize(500, 600); //sets the size of the outer frame.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //sets the program to quit running when the window is closed
        FlowLayout layout = new FlowLayout(); //arranges components from left to right, centering components horizontally with a five pixel gap between them.
        setLayout(layout);
        int name = 0; //creats int name
        String newname; //creats string newname

        GridLayout layout1 = new GridLayout(4, 3, 10, 10); //arranges the components in a rectangular grid, where all cells are of equal size.
        row1.setLayout(layout1);
        //creates and adds the buttons to the GridLayout's first three rows
        for (int x = 0; x <= 2; x++) {
            for (int y = 0; y <= 2; y++) {
                name = name + 1;
                newname = Integer.toString(name);
                boxes[x][y] = new JButton(newname);
                boxes[x][y].setIcon(back);
                row1.add(boxes[x][y]); 
            }
        }
        //adds remaining components to the GridLayout.
        row1.add(blank1);
        row1.add(play);
        row1.add(blank2);
        add(row1); //adds the GridLayout to the FlowLayout.
        
        //makes the program ready to handle mouse clicks.
        play.addActionListener(tictac); 
        for (int x=0; x<=2; x++){
            for (int y=0; y<=2; y++){
                boxes[x][y].addActionListener(tictac);
            }
        }

        setVisible(true); // shows the FlowLayout on the screen
    }

    public static void main(String[] arguments) {
        TicTac frame = new TicTac(); // runs the screen layout class
    }

}
