package com.michael;
import javax.swing.*;

public class BicycleDriver {



    public static void main(String[] args) {

        String name = "";
        Double value = 0.00 , totalvalue;

        Bicycle b1 = new Bicycle(name,value);
        Bicycle b2 = new Bicycle();



        name = JOptionPane.showInputDialog(null,"Please Enter Your Name","Bike Store (Arg Method)", JOptionPane.QUESTION_MESSAGE);
        value = (Double.parseDouble(JOptionPane.showInputDialog(null,"Please Enter Your Bikes Value","Bike Store (Arg Method)", JOptionPane.QUESTION_MESSAGE)));

        b2.setName(JOptionPane.showInputDialog(null,"Please Enter Your Name","Bike Store", JOptionPane.QUESTION_MESSAGE));
        b2.setValue(Double.parseDouble(JOptionPane.showInputDialog(null,"Please Enter Your Bikes Value","Bike Store", JOptionPane.QUESTION_MESSAGE)));

        b1.setValue(value);
        b1.setValue(b1.getValue()+10);
        b1.setName(name);

        totalvalue = b1.getValue()+b2.getValue();

        JOptionPane.showMessageDialog(null,"Bike 1 Name: " + b1.getName() + "\nBike 1 Value: " + b1.getValue() +"\n\nBike 2 Name: " + b2.getName() + "\nBike 2 Value: " + b2.getValue()
        + "\n\nBikes Overall Value: " + totalvalue);


    }
}
