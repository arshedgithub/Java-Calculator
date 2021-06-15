/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculator;

import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Arshed
 */
public class Calculator extends JFrame {
    
    JTextField display;
    JButton[] numBtns = new JButton[10];
    JButton decBtn,clBtn,ceBtn,backBtn,addBtn,subBtn,mulBtn,divBtn,eqBtn,conBtn;
    //    JButton[] funcBtns = { decBtn,clBtn,ceBtn,backBtn,addBtn,subBtn,mulBtn,divBtn,eqBtn,conBtn}
    JButton[] funcBtns = new JButton[10];
    JPanel panel;
    String firstOperand,secondOperand;
    
    Font displayFont = new Font("serif",Font.BOLD,30);
    Font btnFont = new Font("serif",Font.BOLD,25);
    
    Calculator(){
        
        setTitle("Calculator");
        setLocation(320,150);
        setSize(430,500);
        
        Container con = getContentPane();
        con.setLayout(null);
        
        display = new JTextField();
        display.setBounds(25, 20, 360, 80);
        display.setFont(displayFont);
        display.setEditable(false);
        
        panel = new JPanel();
        panel.setBounds(25, 120, 360, 300);
        panel.setLayout(new GridLayout(5,4,10,10));
        
        clBtn = new JButton("C");
        ceBtn = new JButton("CE");
        backBtn = new JButton("\u2190");
        subBtn = new JButton("-");
        addBtn = new JButton("+");
        mulBtn = new JButton("*");
        divBtn = new JButton("/");
        eqBtn = new JButton("=");
        decBtn = new JButton(".");
        conBtn = new JButton("-/+");
        
        funcBtns[0] = clBtn;
        funcBtns[1] = ceBtn;
        funcBtns[2] = backBtn;
        funcBtns[3] = subBtn;
        funcBtns[4] = addBtn;
        funcBtns[5] = mulBtn;
        funcBtns[6] = divBtn;
        funcBtns[7] = eqBtn;
        funcBtns[8] = decBtn;
        funcBtns[9] = conBtn;
        
        for (int i = 0; i < 10; i++) {
            funcBtns[i].setFont(btnFont);
            numBtns[i].setFocusable(false);
//            numBtns[i].addActionListener((ActionListener) this);
        }
        
        for (int i = 0; i < 10; i++) {
            numBtns[i] = new JButton(String.valueOf(i));
            numBtns[i].setFont(btnFont);
            numBtns[i].setFocusable(false);
//            numBtns[i].addActionListener((ActionListener) this);
        }

        con.add(display);
        con.add(panel);
        panel.add(conBtn);
        panel.add(clBtn);
        panel.add(ceBtn);
        panel.add(backBtn);
        panel.add(numBtns[7]);
        panel.add(numBtns[8]);
        panel.add(numBtns[9]);
        panel.add(divBtn);
        panel.add(numBtns[4]);
        panel.add(numBtns[5]);
        panel.add(numBtns[6]);
        panel.add(mulBtn);
        panel.add(numBtns[1]);
        panel.add(numBtns[2]);
        panel.add(numBtns[3]);
        panel.add(subBtn);
        panel.add(numBtns[0]);
        panel.add(decBtn);
        panel.add(eqBtn);
        panel.add(addBtn);
        
//        b1.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//            }
//        });
    }
    
    
}