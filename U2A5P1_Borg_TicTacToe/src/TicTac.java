/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mathew Borg
 */
import java.awt.*;
import javax.swing.*;

public class TicTac extends JFrame {

    JPanel row1 = new JPanel(); //creats outline box
    JButton[][] boxes = new JButton[3][3]; // creates nine buttons in a 2D array that is 3 x 3.
    JButton play = new JButton("Play"); //creats play btn
    JTextField blank1 = new JTextField(); //creats jtextfeild blank1
    JTextField blank2 = new JTextField(); //creats jtextfeild blank2
    JOptionPane win = new JOptionPane("Winner"); //creats joptionpane win
    ImageIcon back = new ImageIcon("cardback.jpg "); //creats new image icon with cardback.jpg

}
