package com.michael;

import javax.swing.*;

public class ConvertCurrency {

    public static void main(String[]args)
    {
        int GBP=1;
        double exchangerate=0.88,Euro;

        while(GBP != 0)
        {

            GBP = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter the amount you would like to be exhanged","Current Sterling to Euro Exchange is " + Double.toString(exchangerate),JOptionPane.QUESTION_MESSAGE));

            Euro = (GBP/exchangerate);

            JOptionPane.showMessageDialog(null,"GBP Entered: " + GBP + "\nEuros Recieved: " + Euro,"Exchange Rate Today is " + Double.toString(exchangerate),JOptionPane.INFORMATION_MESSAGE);

        }


    }
}
