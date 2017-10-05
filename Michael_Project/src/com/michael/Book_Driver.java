package com.michael;

import javax.swing.*;

public class Book_Driver {

    public static void main(String[] args) {

        Book book1 = new Book();
        Book book2 = new Book();

        book1.setTitle(JOptionPane.showInputDialog(null,"Enter the Name of Your Favourite Book","Books!",JOptionPane.QUESTION_MESSAGE));
        book1.setPrice(Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the Price of " + book1.getTitle(),"Books!",JOptionPane.QUESTION_MESSAGE)));
        book1.setIsbn(JOptionPane.showInputDialog(null,"Enter the ISBN of " + book1.getTitle(),"Books!",JOptionPane.QUESTION_MESSAGE));


    }
}
