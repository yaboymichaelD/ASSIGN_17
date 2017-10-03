package com.michael;

import javax.swing.*;
import java.awt.*;

/**
 * Created by t00186801 on 21/09/2017.
 */
public class OOP2_ASSIGN2_Q3 {

    public static void main(String[] args)
    {
        String name;

        double length,breadth,cost,area,totalcost;

        JTextArea output = new JTextArea();

        //Setting font details
        Font monoFont = new Font("Courier",Font.PLAIN,14);
        output.setFont(monoFont);

        //String used to hold the STRING FORMAT
        String outputLine;


        //Taking User Input
        name = JOptionPane.showInputDialog(null,"Please Enter Your Name","Magic Carpet",JOptionPane.QUESTION_MESSAGE);
        length = Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter the Length of your room","Magic Carpet",JOptionPane.QUESTION_MESSAGE));
        breadth = Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter the Breadth of your room","Magic Carpet",JOptionPane.QUESTION_MESSAGE));
        cost = Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter the Cost per Squared Meter of Carpet","Magic Carpet",JOptionPane.QUESTION_MESSAGE));

        //Creating Formula to calculate area and total cost for carpet
        area = length*breadth;
        totalcost = area*cost;

        //Setting output to JTEXTAREA
        output.setText("Hello " +name+ "\n" + "This is your Quotation\n");
        outputLine = String.format("\n %-20s%.2f m.\n %-20s%.2f m.\n %-20s%.2f m.\n %-20s%.2f Euros.\n %-20s%.2f Euros.\n","Length",length,"Breadth", breadth,"Area",area,"Cost Per SQ M",cost,"Total Cost",totalcost);
        output.append(outputLine);

        JOptionPane.showMessageDialog(null,output,"Your Magic Carpet",JOptionPane.INFORMATION_MESSAGE);




        //This was a old way to display in console and make sure formatting was correct
        //System.out.printf("\n %-20s%.2f m.\n %-20s%.2f m.\n %-20s%.2f m.\n %-20s%.2f m.\n %-20s%.2f m.\n","length",length,"breadth", breadth,"area",area,"cost per SQ M",cost,"total cost",totalcost);


    }



}
