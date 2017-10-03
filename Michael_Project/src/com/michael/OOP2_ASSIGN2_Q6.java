package com.michael;

import javax.swing.*;


public class OOP2_ASSIGN2_Q6 {





    public static void main(String[] args) {

        {
            JTextArea output = new JTextArea();

            int count = 1;
            float inches = 0;
            //output.setText("Yards to Inches Converter");
            output.setText("Number Cube\n------          ----");

            for (count=1; count <16; count++)
            {

                output.append("\n" +count + "                 " + OOP2_ASSIGN2_Q6_2.cube(count));


            }

            JOptionPane.showMessageDialog(null,output,"Yards to Inches",JOptionPane.INFORMATION_MESSAGE);
        }
    }

}
