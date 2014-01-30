package com.progwml6.ece203.lab3;

import java.util.Scanner;

public class QuadRootsDouble
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a then b then c: ");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double toSqrt = b * b - 4 * a * c;
        if (toSqrt < 0)
        {
            double real =  -1 * b / 2 * a;
            double imag =  Math.sqrt(-1 * toSqrt) / 2 * a;
            System.out.println(real + " + " + imag + "i" + ", " + real + " - " + imag + "i");

        }
        else if (toSqrt > 0)
        {
            System.out.println(((-1 * b + Math.sqrt(toSqrt)) / 2 * a) + "0i" + ", " + ((-1 * b - Math.sqrt(toSqrt)) / 2 * a) + "0i");
        }

    }
}
