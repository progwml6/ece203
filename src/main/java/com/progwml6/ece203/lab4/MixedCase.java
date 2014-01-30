package com.progwml6.ece203.lab4;

import java.util.Scanner;

public class MixedCase
{

    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter string: ");
        String in = scan.next();

        if (in.toUpperCase().equals(in) || in.toLowerCase().equals(in))
            System.out.println("one case");
        else
            System.out.println("both cases");

    }

}
