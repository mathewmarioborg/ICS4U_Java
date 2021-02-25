package helloworld;
import javax.swing.*;
import java.awt.*;

/**
File Name:	HelloWorld
Programmer:	Mathew Borg
Date:		2021-02-12
Description:	This program demonstrates the
use of graphics.
 */
public class HelloWorld extends JFrame{
    public HelloWorld () {
        super ("Hello World!");
        setSize(550,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        JLabel pageLabel = new JLabel("All About Me!!");
        JLabel pageLabe2 = new JLabel("My Name Is Mathew Borg and I am Currently attending Banting Memeorial Highschool");
        JLabel pageLabe3 = new JLabel("I also realy enjoy programing!!!");
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        add(pageLabel);
        add(pageLabe2);
        add(pageLabe3);   
        setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HelloWorld hw = new HelloWorld();
    }
}