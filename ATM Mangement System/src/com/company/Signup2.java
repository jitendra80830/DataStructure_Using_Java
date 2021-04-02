package com.company;

import java.awt.*;
import  java.awt.event.*;
import java.net.*;
import java.sql.*;
import  javax.swing.*;


public class Signup2 extends JFrame {
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
    JButton b;
    JRadioButton r1,r2,r3,r4;
    JTextField t1,t2,t3;
    JComboBox c1,c2,c3,c4,c5;




    Signup2(){


        setFont(new Font("System",Font.BOLD,22));
        Font f = getFont();
        FontMetrics fm = getFontMetrics(f);
        int x = fm.stringWidth("NEW ACCOUNT APPLICATION FORM PAGE-2");
        int y = fm.stringWidth(" ");
        int z = getWidth() - x;
        int w = z/y;
        String pad = "";
        pad = String.format("%"+w+"s",pad);
        setTitle(pad+"NEW ACCOUNT APPLICATION FORM PAGE-2");


        l1 = new JLabel("page-2: Addition Details");
        l1.setFont(new Font("Raleway",Font.BOLD,22));

        l2 = new JLabel("Religion:");
        l2.setFont(new Font("Raleway",Font.BOLD,18));

        l3 = new JLabel("Category:");
        l3.setFont(new Font("Raleway",Font.BOLD,18));

        l4 = new JLabel("Income:");
        l4.setFont(new Font("Raleway",Font.BOLD,18));

        l5 = new JLabel("Educational:");
        l5.setFont(new Font("Raleway",Font.BOLD,18));

        l6 = new JLabel("Occupation:");
        l6.setFont(new Font("Raleway",Font.BOLD,18));

        l7 = new JLabel("Pane Number:");
        l7.setFont(new Font("Raleway",Font.BOLD,18));

        l8 = new JLabel("Aadhar Number:");
        l8.setFont(new Font("Raleway",Font.BOLD,18));

        l9 = new JLabel("Senior Citizen:");
        l9.setFont(new Font("Raleway",Font.BOLD,18));

        l10 = new JLabel("Existing Account:");
        l10.setFont(new Font("Raleway",Font.BOLD,18));

        l12 = new JLabel("Form No:");
        l12.setFont(new Font("Raleway",Font.BOLD,13));

        l11 = new JLabel("Qualification:");
        l11.setFont(new Font("Raleway",Font.BOLD,18));

        b = new JButton("Next");
        b.setFont(new Font("Raleway",Font.BOLD,14));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);

        t1 = new JTextField();
        t1.setFont(new Font("Raleway",Font.BOLD,14));

        t2 = new JTextField();
        t2.setFont(new Font("Raleway",Font.BOLD,14));

        t3 = new JTextField();
        t3.setFont(new Font("Raleway",Font.BOLD,14));


        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(Color.WHITE);

        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(Color.WHITE);

        r3 = new JRadioButton("Yes");
        r3.setFont(new Font("Raleway",Font.BOLD,14));
        r3.setBackground(Color.WHITE);

        r4 = new JRadioButton("No");
        r4.setFont(new Font("Raleway",Font.BOLD,14));
        r4.setBackground(Color.WHITE);


        String religion[] ={"Hindu","Muslim","Sikh","Christian","Other"};
        c1 = new JComboBox(religion);
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Relaway",Font.BOLD,14));

        String category[] = {"General","OBC","SC","ST","Other"};
        c2 = new JComboBox(category);
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway",Font.BOLD,14));

        String income[] = {"Nul","<1,50,000","2,50,000","5,00,000","Up to 10,00,000","Above 10,00,000"};
        c3 = new JComboBox(income);
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway",Font.BOLD,14));

        String education[] = {"Non Graduate","Graduate","Post-Graduate","Doctrate","Other"};
        c4 = new JComboBox(education);
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway",Font.BOLD,14));

        String occupation[] = {"Salaried","Self-employee","Student","Others"};
        c5 = new JComboBox(occupation);
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway",Font.BOLD,14));

        setLayout(null);
        








    }
}
