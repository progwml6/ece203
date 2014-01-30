package com.progwml6.ece203.lab4;

import java.util.Scanner;

public class Palendrome
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter string: ");
        String in = scan.next();

    }
    public void IsPalendrome (String s)
    {
        if(new StringBuilder(s).reverse().toString().replace(" ", "").equals(s.replace(" ", "")))
            System.out.println("String is a palendrome");
    }
}
