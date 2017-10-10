package com.michael;

public class Animal {

    private String type;
    private String [] continents;
    private double weight;
    private int age;

    public Animal()
    {
        this("No Type Specified",null,0.00,0);
    }

    public Animal(String type,String [] continents,Double weight,int age)
    {
       setType(type);
       setContinents(continents);
       setWeight(weight);
       setAge(age);

    }

    public void setType(String type){
        this.type=type;
    }

    public void setContinents(String [] continents)
    {
        this.continents = continents;
    }

    public void setWeight (Double weight)
    {
        this.weight=weight;
    }

    public void setAge(int age)
    {
        this.age=age;
    }

    public String getType(){
        return type;
    }

    public String [] getContinents()
    {
        return continents;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public String toString()
    {
        return "Animal Type: " + getType() + "\nContinent: " + getContinents() + "\nWeight: " + getWeight() + "\nAge: " + getAge();
    }
}
