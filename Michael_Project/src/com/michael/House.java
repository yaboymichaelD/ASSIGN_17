package com.michael;

public class House extends Person {

    private String address , type;
    private double price;
    Person Owner;




    public House(){
        this("No Address Specified","No Type Specified",0.00,"No Name",0,0);
    }

    public House(String address,String type,double price,String name,float number,int age)
    {
        setAddress(address);
        setType(type);
        setPrice(price);
        new Person(name,number,age);

    }

    public String getAddress() {
        return address;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public Person getOwner() {
        return Owner;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setOwner(Person Owner) {
        Owner = Owner;
    }

    @Override
    public String toString() {
        return "House{" +
                "address='" + address + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", Owner=" + Owner +
                '}';
    }
}
