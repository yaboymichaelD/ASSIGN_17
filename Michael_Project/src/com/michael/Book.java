package com.michael;

public class Book {

    String title , ISBN;
    double price;
    int numofpages;

    public Book()
    {
      this(" ",0,"", 0);
    }

    public Book (String title, double price, String isbn, int numofpages)
    {
        setTitle(title);
        setPrice(price);
        setIsbn(isbn);
        setNumofpages(numofpages);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(Double price)
    {
        this.price = price;
    }

    public void setIsbn(String isbn)
    {
      this.ISBN = isbn;
    }

    public void setNumofpages(int numofpages)
    {
        this.numofpages = numofpages;
    }

    public String getTitle() {
        return title;
    }

    public Double getPrice(){
        return price;
    }

    public String getISBN(){
        return ISBN;
    }

    public int getNumofpages(){
        return numofpages;
    }

    public String toString(){
        return "Book Title: " + title + "\nBook Price: " + price + "\nBooks ISBN: " + ISBN + "\nPages: " + numofpages;
    }


}

