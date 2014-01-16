package com.progwml6.ece203.lab2;

public class SqRoot
{

    public static void main (String[] args)
    {
        SqRoot s = new SqRoot();
        System.out.println(s.sqRoot(4));
        s.printSqRoot(69);

    }

    public double sqRoot (int input)
    {
        return Math.sqrt(input);
    }

    public void printSqRoot (int in)
    {
        System.out.println(in + " " + sqRoot(in));
    }

}
