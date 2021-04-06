package com.company;

import javax.swing.*;
import java.awt.*;

public class Signup3 extends JFrame {
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
    JRadioButton r1,r2,r3,r4;
    JButton b1,b2;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;


    Signup3(){


        setFont(new Font("System",Font.BOLD,22));
        Font f = getFont();
        FontMetrics fm = getFontMetrics(f);
        int x = fm.stringWidth("NEW ACCOUNT APPLICATION FORM PAGE-2");
        int y = fm.stringWidth(" ");
        int z = getWidth() - x;
        int w = z/y;
        String pad = "";
        pad = String.format("%"+w+"s",pad);
        setTitle(pad+"NEW ACCOUNT APPLICATION FORM PAGE-3");

        l1 = new JLabel("Page-3: Account Details");
        l1.setFont(new Font("Raleway",Font.BOLD,22));

        l2 = new JLabel("Account Types:");
        l2.setFont(new Font("Raleway",Font.BOLD,18));

        l3 = new JLabel("Card Number:");
        l3.setFont(new Font("Raleway",Font.BOLD,18));

        l4 = new JLabel("XXXX-XXXX-XXXX-4184:");
        l4.setFont(new Font("Raleway",Font.BOLD,18));

        l5 = new JLabel("Your 16-digits Card Number:");
        l5.setFont(new Font("Raleway",Font.BOLD,12));

        l6 = new JLabel("It would Appear on ATM Card/cheque Book and statements:");
        l6.setFont(new Font("Raleway",Font.BOLD,12));

        l7 = new JLabel("Pine:");
        l7.setFont(new Font("Raleway",Font.BOLD,18));

        l8 = new JLabel("XXXX:");
        l8.setFont(new Font("Raleway",Font.BOLD,18));

        l9 = new JLabel("4-digit password:");
        l9.setFont(new Font("Raleway",Font.BOLD,12));

        l10 = new JLabel("Service Required:");
        l10.setFont(new Font("Raleway",Font.BOLD,18));

        l11 = new JLabel("Form No:");
        l11.setFont(new Font("Raleway",Font.BOLD,14));

        b1 = new JButton("Submit");
        b1.setFont(new Font("Raleway",Font.BOLD,14));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);

        b2 = new JButton("Cancel");
        b2.setFont(new Font("Raleway",Font.BOLD,14));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);

        c1 = new JCheckBox("ATM Card");
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBackground(Color.WHITE);

        c2 = new JCheckBox("Internet Backing");
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBackground(Color.WHITE);

        c3 = new JCheckBox("Mobile Backing");
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBackground(Color.WHITE);

        c4 = new JCheckBox("Email Alert");
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBackground(Color.WHITE);

        c5 = new JCheckBox("Cheque Book");
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBackground(Color.WHITE);

        c6 = new JCheckBox("E-Statements");
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBackground(Color.WHITE);

        c7 = new JCheckBox("I hereby declare that above entered details correct to the best of my knowledge.",true);
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBackground(Color.WHITE);


    }
    public static void main(String[] args){
        new Signup3().setVisible(true);
    }
}

