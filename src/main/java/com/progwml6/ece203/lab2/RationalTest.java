package com.progwml6.ece203.lab2;

public class RationalTest
{

    public static void main (String[] args)
    {
        Rational r1 = new Rational(4, 8);
        System.out.println("(" + r1.getNum() + "/" + r1.getDen() + ")");
        Rational r2 = new Rational(9, 12);
        System.out.println("(" + r2.getNum() + "/" + r2.getDen() + ")");
        r1.add(r2.getNum(), r2.getDen());
        System.out.println("(" + r1.getNum() + "/" + r1.getDen() + ")");
        r2.add(4, 8);
        System.out.println("(" + r2.getNum() + "/" + r2.getDen() + ")");

    }

}
