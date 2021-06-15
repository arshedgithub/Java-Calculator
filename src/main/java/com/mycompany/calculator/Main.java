/*
 * calculator with java
 */
package com.mycompany.calculator;

import javax.swing.JFrame;

/**
 *
 * @author Arshed
 */
public class Main {
    public static void main(String[] args) {
        
        Calculator frame = new Calculator();
        
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
