package com.progwml6.ece203.lab3;

import java.util.Scanner;

public class DampedOsc
{
    public static void main (String[] args)
    {
        int input;
        Scanner scan = new Scanner(System.in);
        System.out.print("Time: ");
        input = scan.nextInt();
        calcV(input);
    }

    public static void calcV (int t)
    {
        System.out.println(5* Math.pow(Math.E,-.1*t) * Math.cos(.01 * t));
    }
}
