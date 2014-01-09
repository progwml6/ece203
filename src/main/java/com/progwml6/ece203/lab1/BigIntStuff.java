package com.progwml6.ece203.lab1;

import java.math.BigInteger;

public class BigIntStuff
{

    public static void main (String[] args)
    {
        BigInteger a = new BigInteger("98765432109876543210");
        BigInteger b = new BigInteger("12345678901234567890");
        System.out.println(a.add(b));
        System.out.println(a.subtract(b));
        System.out.println(a.multiply(b));
        System.out.println(a.mod(b));

    }

}
