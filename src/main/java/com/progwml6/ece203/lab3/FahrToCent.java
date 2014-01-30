package com.progwml6.ece203.lab3;

import java.util.Scanner;

public class FahrToCent
{
    public static void main (String args[])
    {
        int fahr = 0;
        int cent = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Temperature in Fahrenheit: ");
        fahr = input.nextInt();
        cent = (fahr - 32) * 5 / 9;
        System.out.println("Temperature in Centigrade: " + cent);
    }
}