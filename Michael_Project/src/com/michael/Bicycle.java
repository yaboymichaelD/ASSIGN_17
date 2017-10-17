package com.michael;

public class Bicycle {

    String name;
    double value;

    public void setName (String name)
    {
        this.name = name;
    }

    public void setValue (Double value)
    {
        this.value = value;
    }

    public String getName(){
        return name;
    }

    public double getValue(){
        return value;
    }

    public Bicycle(){
        this("Unknown Name",0.00);
    }

    public Bicycle(String name , double value)
    {
        setName(name);
        setValue(value);
    }

    public String toString()
    {
        return "Name: " + name + "\nValue: " + value;
    }
}
