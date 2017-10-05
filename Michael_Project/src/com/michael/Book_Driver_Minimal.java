package com.michael;

public class Book_Driver_Minimal  {

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setTitle("Jungle Book");
        book1.setPrice(10.99);
        book1.setIsbn("AEIOU12345678");
        book1.setNumofpages(500);

        Book book2 = new Book();
        book2.setTitle("The Adventures of the big old doints in amish country");
        book2.setPrice(12.99);
        book2.setIsbn("doints123456789");
        book2.setNumofpages(1000);

        System.out.println(book1.toString());
        System.out.println(book2.toString());



    }


}
