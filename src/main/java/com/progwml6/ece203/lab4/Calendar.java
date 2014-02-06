package com.progwml6.ece203.lab4;

import java.util.Scanner;

public class Calendar
{

    public final static String[] DAYS_OF_WEEK = { "1basedindex", "Su", "Mo", "Tu", "We", "Th", "Fr", "Sa" };
    public final static String[] MONTHS_OF_YEAR = { "1basedindex", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };

    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Year[YYYY]: ");
        int year = scan.nextInt();
        System.out.println("Enter Month[MM]: ");
        int month = scan.nextInt();
        System.out.println(numDaysInMonth(month, year));
        System.out.println(firstDayOfMonth(month, year));
        System.out.println(MONTHS_OF_YEAR[month] + " " + year);

        for (int i = 1; i < DAYS_OF_WEEK.length; i++)
        {
            System.out.print(DAYS_OF_WEEK[i] + " ");
        }
        System.out.println("");
        int days = 0;
        for (int k = 1; k <= firstDayOfMonth(month, year); k++)
        {
            System.out.print("   ");
            days += 1;
        }
        for (int i = 1; i <= numDaysInMonth(month, year); i++)
        {
            
            if (i < 10)
            {
                days += 1;
                System.out.print("  " + i);
            }
            else
            {
                days += 1;
                System.out.print(" " + i);
            }
            if (days == 7)
            {
                System.out.println("");
                days = 0;
            }

        }

    }

    public static boolean leap (int year)
    {
        return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
    }

    public static int firstDayOfYear (int year)
    {
        return firstDayOfMonth(1, year);
    }

    public static int firstDayOfMonth (int month, int year)
    {
        //treated as being at the end of the previous year
        year -= 1;
        month += 12;
        //calendar's use this formula see http://en.wikipedia.org/wiki/Zeller's_congruence
        return ((1 + ((month + 1) * 26 / 10) + year + year / 4 + year / 100 + year / 400) % 7);
    }

    public static int numDaysInMonth (int month, int year)
    {
        switch (month)
        {
        case 4:
            return 30;
        case 6:
            return 30;
        case 11:
            return 30;
        case 2:
            if (leap(year))
                return 29;
            return 30;
        default:
            return 31;
        }
    }
}
