package com.progwml6.ece203.lab2;

public class BugTester
{

    public static void main (String[] args)
    {
        Bug b = new Bug(5);
        b.move();
        b.move();
        System.out.println(b.getPosition());
        b.turn();
        b.move();
        b.move();
        b.move();
        System.out.println(b.getPosition());
        b.turn();
        b.move();
        System.out.println(b.getPosition());        
    }

}
