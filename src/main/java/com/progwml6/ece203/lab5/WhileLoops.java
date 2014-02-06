package com.progwml6.ece203.lab5;

import java.util.Scanner;

public class WhileLoops
{

    public static void main (String[] args)
    {
        uno();
        two();
    }

    public static void uno ()
    {
        int day = -1;
        Scanner input = new Scanner(System.in);
        while ((day < 0) || (day > 6))
        {
            System.out.print("Enter a day ( Sun = 0, Mon = 1,..., Sat = 6 ): ");
            day = input.nextInt();
            System.out.println();
        }
    }

    public static void two ()
    {
        Scanner input = new Scanner(System.in);
        int start = input.nextInt();
        int end = input.nextInt();
        int i = start;
        //  for ( int i = start; i < end; i++ )
        do
        {
            System.out.printf("Integer = %d, Squared = %d%n", i, i * i);
            if (start <= end)
                i++;
            else
                i--;
        } while ((start < end) ? i < end : i > end);
    }
}
