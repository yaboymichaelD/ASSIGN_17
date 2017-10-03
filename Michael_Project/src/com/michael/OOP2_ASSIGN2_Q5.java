package com.michael;

public class OOP2_ASSIGN2_Q5 {

    public static void main(String[] args) {

        final int c = -16;
        int b = 6 , a = 1 ;
        double x = 0;
        double plusanswer =0 , minusanswer =0;


        minusanswer = -b-Math.sqrt((b*b)-4*(a*c))/(2*a);
        plusanswer =  -b+Math.sqrt((b*b)-4*(a*c))/(2*a);

        System.out.print("With Minus X = " + minusanswer);
        System.out.print("\nWith Plus X = " + plusanswer);
    }
}
