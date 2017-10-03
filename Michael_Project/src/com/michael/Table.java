package com.michael;

import javax.swing.*;

public class Table {

        public static void main (String[] args)
        {
                JTextArea output = new JTextArea();

                int yards = 1;
                float inches = 0;
                //output.setText("Yards to Inches Converter");
                output.setText("Yards  Inches\n----  -----");

                for (yards=1; yards<11; yards++)
                {

                  inches = yards*36;

                  output.append("\n"+yards + "   " + inches);

                }

                JOptionPane.showMessageDialog(null,output,"Yards to Inches",JOptionPane.INFORMATION_MESSAGE);
        }
}
