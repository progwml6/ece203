package com.progwml6.ece203.lab4;

import java.util.Scanner;

public class LetterClass
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter char: ");
        char in = scan.next().charAt(0);
        System.out.println(letterClass(in));

    }

    public static String letterClass (char in)
    {
        switch (in)
        {
        case 'a':
            return "vowel";
        case 'e':
            return "vowel";
        case 'i':
            return "vowel";
        case 'o':
            return "vowel";
        case 'u':
            return "vowel";
        case 'w':
            return "semi-vowel";
        case 'y':
            return "semi-vowel";
        default:
            return "consonant";

        }
    }
}
