package primeiroaplicativojava;

import javax.swing.*;

public class PrimeiroJFrame {
    
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        JButton button = new JButton("Click me!");
        button.setSize(20,20);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.getContentPane().add(button);
        
        frame.setSize(300,300);
        
        frame.setVisible(true);
    }
}
