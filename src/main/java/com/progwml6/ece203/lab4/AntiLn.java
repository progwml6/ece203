package com.progwml6.ece203.lab4;

import java.util.Scanner;

public class AntiLn
{

    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number: ");
        double a = scan.nextDouble();
        AntiLn anti = new AntiLn(a);

    }

    public AntiLn(Double d)
    {
        Double out = 1.0;
        for (int x = 2; x <= 10; x++)
        {
            out += Math.pow(d, x) / fac(d);
        }
        System.out.println(out);
    }

    public Double fac (Double in)
    {
        Double rove = in;
        Double out = 1.0;
        while (rove != 0)
        {
            out *= rove;
            rove -= 1;
        }
        return out;
    }
}
