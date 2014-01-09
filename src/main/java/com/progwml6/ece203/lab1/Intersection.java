package com.progwml6.ece203.lab1;

import java.awt.Rectangle;

public class Intersection
{
    public static void main (String args[])
    {
        Rectangle r1 = new Rectangle(1,5,2,4);
        Rectangle r2 = new Rectangle(2,6,3,7);
        System.out.println("r1: " + r1.toString());
        System.out.println("r2: " + r2.toString());
        System.out.println(r1.intersection(r2).toString());
        
        Rectangle r3 = new Rectangle(10,50,2,4);
        Rectangle r4 = new Rectangle(2,6,3,7);
        System.out.println("r3: " + r3.toString());
        System.out.println("r4: " + r4.toString());
        System.out.println(r3.intersection(r4).toString());


    }

}
