//Flappy bird game making.....
package aaa;

//for using the buit in components
import aaa.FlappyBird;
import javax.swing.*;
import java.awt.*;
import java.util.*;

public class AAA {

    //main class of the game
    public static void main(String[] args) throws Exception {
        int boardWidth = 360;
        int boardHeight = 640;
        
        //jframe window object
        JFrame frame = new JFrame("Flappy Bird");
        //to be window visible
        // frame.setVisible(true);
        // for the size of the window
        frame.setSize(boardWidth, boardHeight);
        //for set the window center
        frame.setLocationRelativeTo(null);
        //for not resize the window
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        FlappyBird flappyBird = new FlappyBird();
        frame.add(flappyBird);
        frame.pack();
        flappyBird.requestFocus();
        frame.setVisible(true);
    }
    
}

