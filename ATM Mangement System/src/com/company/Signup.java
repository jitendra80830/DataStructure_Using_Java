package com.company;

import  java.awt.*;
import  java.awt.event.*;
import  javax.swing.*;
import  java.net.*;
import  java.sql.*;
import java.util.*;


public class Signup extends JFrame{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JRadioButton r1,r2,r3,r4,r5;
    JButton b;
    JComboBox c1,c2,c3;


    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    long first = Math.abs(first4);


    Signup(){


        //move the text into center
        setFont(new Font("System",Font.BOLD,22));
        Font f = getFont();
        FontMetrics fm = getFontMetrics(f);
        int x = fm.stringWidth("NEW ACCOUNT APPLICATION FORM");
        int y = fm.stringWidth(" ");
        int z = getWidth() - x;
        int w = z/y;
        String pad = "";
        pad = String.format("%"+w+"s",pad);
        setTitle(pad+"NEW ACCOUNT APPLICATION FORM");

        l1 = new JLabel("APPLICATOPN FORM NO. "+first);
        l1.setFont(new Font("Raleway",Font.BOLD,38));


        l2 = new JLabel("Page 1: Personal Detail");
        l2.setFont(new Font("Raleway",Font.BOLD,22));

        l3 = new JLabel("Name:");
        l3.setFont(new Font("Raleway",Font.BOLD,20));

        l4 = new JLabel("Father's Name:");
        l4.setFont(new Font("Raleway",Font.BOLD,20));

        l5 = new JLabel("Date Of Birth:");
        l5.setFont(new Font("Raleway",Font.BOLD,20));

        l6 = new JLabel("Gender:");
        l6.setFont(new Font("Raleway",Font.BOLD,20));

        l7 = new JLabel("Email Address:");
        l7.setFont(new Font("Raleway",Font.BOLD,20));

        l8 = new JLabel("Merital Status:");
        l8.setFont(new Font("Raleway",Font.BOLD,20));

        l9 = new JLabel("Address:");
        l9.setFont(new Font("Raleway",Font.BOLD,20));

        l10 = new JLabel("City:");
        l10.setFont(new Font("Raleway",Font.BOLD,20));

        l11 = new JLabel("Pin Code:");
        l11.setFont(new Font("Raleway",Font.BOLD,20));

        l12 = new JLabel("State:");
        l12.setFont(new Font("Raleway",Font.BOLD,20));

        l13 = new JLabel("Date:");
        l13.setFont(new Font("Raleway",Font.BOLD,14));

        l4 = new JLabel("Month:");
        l4.setFont(new Font("Raleway",Font.BOLD,14));

        l5 = new JLabel("Year:");
        l5.setFont(new Font("Raleway",Font.BOLD,14));


        t1 = new JTextField();
        t1.setFont(new Font("Raleway",Font.BOLD,14));

        t2 = new JTextField();
        t2.setFont(new Font("Raleway",Font.BOLD,14));

        t3 = new JTextField();
        t3.setFont(new Font("Raleway",Font.BOLD,14));

        t4 = new JTextField();
        t4.setFont(new Font("Raleway",Font.BOLD,14));

        t5 = new JTextField();
        t5.setFont(new Font("Raleway",Font.BOLD,14));


        b = new JButton("Next");
        b.setFont(new Font("Raleway",Font.BOLD,14));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(Color.WHITE);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(Color.WHITE);

        r3 = new JRadioButton("Married");
        r3.setFont(new Font("Raleway",Font.BOLD,14));
        r3.setBackground(Color.WHITE);

        r4 = new JRadioButton("UnMarried");
        r4.setFont(new Font("Raleway",Font.BOLD,14));
        r4.setBackground(Color.WHITE);

        r5 = new JRadioButton("Other");
        r5.setFont(new Font("Raleway",Font.BOLD,14));
        r5.setBackground(Color.WHITE);





















    }



}
