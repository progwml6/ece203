package com.progwml6.ece203.lab3;

import java.util.Scanner;

public class Reverse
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 4 char string: ");
        String in = scan.next();
        System.out.println(new StringBuilder(in).reverse().toString());

    }
}
