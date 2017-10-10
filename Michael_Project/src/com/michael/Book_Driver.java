package com.michael;

import javax.swing.*;

public class Book_Driver {

    public static void main(String[] args) {

        Book book1 = new Book();
        Book book2 = new Book();





            //Set Title and attributes to first book
            book1.setTitle(JOptionPane.showInputDialog(null, "Enter the Name of Your Favourite Book", "Books!", JOptionPane.QUESTION_MESSAGE));
            book1.setPrice(Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the Price of " + book1.getTitle(), "Books!", JOptionPane.QUESTION_MESSAGE)));
            book1.setIsbn(JOptionPane.showInputDialog(null, "Enter the ISBN of " + book1.getTitle(), "Books!", JOptionPane.QUESTION_MESSAGE));
            book1.setNumofpages(Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the Number of Pages in " + book1.getTitle(), "Books!", JOptionPane.QUESTION_MESSAGE)));
            //Set Title and attributes to Second Book
            book2.setTitle(JOptionPane.showInputDialog(null, "Enter the Name of Your Second Favourite Book", "Books!", JOptionPane.QUESTION_MESSAGE));
            book2.setPrice(Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the Price of " + book2.getTitle(), "Books!", JOptionPane.QUESTION_MESSAGE)));
            book2.setIsbn(JOptionPane.showInputDialog(null, "Enter the ISBN of " + book2.getTitle(), "Books!", JOptionPane.QUESTION_MESSAGE));
            book2.setNumofpages(Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the Number of Pages in " + book2.getTitle(), "Books!", JOptionPane.QUESTION_MESSAGE)));
            //System.out.println("Book1 Name:" + book1.getTitle() + "\nBook1 Price: " + book1.getPrice() + "\nBook1 ISBN: " + book1.getISBN());
            //System.out.println("Book2 Name:" + book2.getTitle() + "\nBook2 Price: " + book2.getPrice() + "\nBook2 ISBN: " + book2.getISBN());

                System.out.print(book1.toString());
                System.out.print(book2.toString());
    }
}
