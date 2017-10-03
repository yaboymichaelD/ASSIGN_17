package com.michael;

import javax.swing.*;
import java.awt.*;

public class OOP2_ASSIGN2_Q4 {

    public static void main(String[] args) {

        String fullname;
        int stringlength;
        char firstletter;

        //Creating JText Area and Setting Font
        JTextArea jtx = new JTextArea();
        Font fnt = new Font("Courier",Font.PLAIN,14);
        jtx.setFont(fnt);

        //Output String used to format but I did not use formatting
        String outputString;

        //Taking in full name from user
        fullname = JOptionPane.showInputDialog(null,"Please Enter Your Full Name","Name Reader",JOptionPane.QUESTION_MESSAGE);

        //setting variables for length , first letter , and seperating firstname , middlename and lastname
        stringlength = fullname.length();
        firstletter = fullname.charAt(0);
        int index = fullname.indexOf(' ');
        String firstname = fullname.substring(0,index);
        //get the initial in the middle using charAt and adding 1 to the index
        char middlename = fullname.charAt(index + 1);
        String lastname = fullname.substring(index + 2);

        //add elements to JTextArea
        jtx.setText("Welcome, Heres the Details of the name Entered\n\n");
        jtx.append("Full Name: " + fullname + "\nLength of name: " + stringlength + "\nThe Initial of your First Name: " + firstletter + "\n Full name in Capitals: "  + fullname.toUpperCase() + "\nFirst Name: " + firstname + "\nMiddle Name: " + middlename + "\nLastname: " + lastname);

        //Add JTextArea to JOptionPane
        JOptionPane.showMessageDialog(null,jtx,"Name Reader",JOptionPane.INFORMATION_MESSAGE);


    }

}
