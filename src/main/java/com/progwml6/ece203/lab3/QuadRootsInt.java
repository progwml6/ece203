package com.progwml6.ece203.lab3;

import java.util.Scanner;

public class QuadRootsInt
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a then b then c: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int toSqrt = b * b - 4 * a * c;
        if (toSqrt < 0)
        {
            int real = (int) -1 * b / 2 * a;
            int imag = (int) Math.sqrt(-1 * toSqrt) / 2 * a;
            System.out.println(real + " + " + imag + "i" + ", " + real + " - " + imag + "i");

        }
        else if (toSqrt > 0)
        {
            System.out.println((int) ((-1 * b + Math.sqrt(toSqrt)) / 2 * a) + "0i" + ", " + ((int) (-1 * b - Math.sqrt(toSqrt)) / 2 * a) + "0i");
        }

    }
}
