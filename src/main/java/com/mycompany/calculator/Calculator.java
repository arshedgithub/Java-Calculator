
package com.mycompany.calculator;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 * @author Arshed
 */
public class Calculator extends JFrame {
    
    JTextField display;   
    JButton[] numBtns = new JButton[10];
    JButton decBtn,clBtn,ceBtn,backBtn,addBtn,subBtn,mulBtn,divBtn,eqBtn,conBtn;
    //    JButton[] funcBtns = { decBtn,clBtn,ceBtn,backBtn,addBtn,subBtn,mulBtn,divBtn,eqBtn,conBtn}
    JButton[] funcBtns = new JButton[10];
    JPanel panel;
    double firstOperand,secondOperand,result;
    char operator;
    
    Font displayFont = new Font("serif",Font.PLAIN,30);
    Font btnFont = new Font("serif",Font.BOLD,25);
    
    Calculator(){
        
        setTitle("Calculator");
        setLocation(320,150);
        setSize(430,500);
        
        Container con = getContentPane();
        con.setLayout(null);
        
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        display = new JTextField();
        display.setBounds(25, 20, 360, 80);
        display.setFont(displayFont);
        display.setBorder(border);
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        
        panel = new JPanel();
        panel.setBounds(25, 120, 360, 300);
        panel.setLayout(new GridLayout(5,4,10,10));
        
        clBtn = new JButton("C");
        ceBtn = new JButton("CE");
        backBtn = new JButton("\u2190");
        subBtn = new JButton("-");
        addBtn = new JButton("+");
        mulBtn = new JButton("x");
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
            numBtns[i] = new JButton(String.valueOf(i));
            numBtns[i].setFont(btnFont);
            numBtns[i].setFocusable(false);
            numBtns[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {getInput(e);};
            });
        }
        
        for (int i = 0; i < 10; i++) {
            funcBtns[i].setFont(btnFont);
            funcBtns[i].setFocusable(false);
            funcBtns[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {getInput(e);};
            });
        };
        
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

    }
    
    public void getInput(ActionEvent e){
        char dec = '.';
        
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numBtns[i]) {
                display.setText(display.getText().concat(String.valueOf(i)));
            }
        }
        
        if ( e.getSource() == decBtn && !display.getText().contains(String.valueOf(dec))) {
                display.setText(display.getText().concat("."));
                if (display.getText().charAt(0) == '.') display.setText("0" + display.getText());
        }
        
        if (e.getSource() == addBtn) {
            firstOperand = Double.parseDouble(display.getText());
            operator = '+';
            display.setText("");
        }
        
        if (e.getSource() == subBtn) {
            firstOperand = Double.parseDouble(display.getText()); 
            operator = '-';
            display.setText("");
        }
        
        if (e.getSource() == mulBtn) {
            firstOperand = Double.parseDouble(display.getText());
            operator = '*';
            display.setText("");
        }
        
        if (e.getSource() == divBtn) {
            firstOperand = Double.parseDouble(display.getText());
            operator = '/';
            display.setText("");
        }
        
        if (e.getSource() == eqBtn) {
            secondOperand = Double.parseDouble(display.getText());
            switch(operator){
                case'+':
                    result=firstOperand+secondOperand;
                    break;
                case'-':
                    result=firstOperand-secondOperand;
                    break;
                case'*':
                    result=firstOperand*secondOperand;
                    break;
                case'/':
                    result=firstOperand/secondOperand;
                    break;
            }
            display.setText(String.valueOf(result));
            firstOperand = result;
        }
        
        if (e.getSource() == clBtn) {
            display.setText("");
        }
        
        if (e.getSource() == ceBtn) {
            display.setText("");
            firstOperand=0;
            secondOperand=0;
            operator=' ';
        }
        
        if (e.getSource() == backBtn) {
            display.setText(display.getText().substring(0,display.getText().length()-1));
        } 
        
        if (e.getSource() == conBtn){
            display.setText(String.valueOf(Double.parseDouble(display.getText())*(-1)));
        }
        
    }
        
}
