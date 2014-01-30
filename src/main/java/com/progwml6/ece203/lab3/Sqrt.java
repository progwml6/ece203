package com.progwml6.ece203.lab3;

import java.util.Scanner;

public class Sqrt
{

    public static void main (String[] args)
    {
        int input;
        Scanner scan = new Scanner(System.in);
        System.out.print("Number to square root: ");
        input = scan.nextInt();
        System.out.println(sqrt(input));
    }

    public static String sqrt (int i)
    {
        boolean negative;
        if (i < 0)
            negative = true;
        else
            negative = false;
        return Math.ceil(100 *Math.sqrt(Math.abs(i))) /100 + (negative?"i":" ");
    }

}
