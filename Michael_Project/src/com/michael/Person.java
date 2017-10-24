package com.michael;

public class Person {

    private String name;
    private int age;
    private float number;

    public Person(){
        this("No Name",0,0);
    }

    public Person(String name, float number,int age)
    {
        setName(name);
        setNumber(number);
        setAge(age);

    }

    public String getName(){
        return name;
    }

    public float getNumber(){
        return number;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setNumber(float number)
    {
        this.number = number;
    }

    public void setAge(int age){
        this.age = age;
    }
}
