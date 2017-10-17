package com.michael;

public class Fraction {

    private int num, denom;

    public Fraction()
    {
        this(0,1);

    }

    public Fraction(int num , int denom)
    {
        setNum(num);
        setDenom(denom);
    }

    public void setNum(int num){
        this.num = num;
    }

    public void setDenom(int denom){
        this.denom = denom;
    }

}
