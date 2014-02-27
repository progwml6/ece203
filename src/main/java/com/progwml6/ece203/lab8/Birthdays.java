package com.progwml6.ece203.lab8;

import java.util.Random;

public class Birthdays
{

    public static void main (String[] args)
    {
        int p = 0;
        int cnt = 2;
        while (p <= 5)
        {
            p = (int) (100 * sameBirthday(cnt));
            cnt++;
        }
        System.out.println(cnt - 1);
    }

    public static double sameBirthday (int n)
    {
        Random r = new Random();
        int[] a = new int[366];
        int temp;
        int prob = 0;
        for (int i = 0; i < n; i++)
        {
            temp = r.nextInt(365);
            a[temp]++;
            if (a[temp] == 2)
            {
                prob++;
            }
        }
        System.out.println((double) prob / n + " " + prob + "/" + n);
        return (double) prob / n;
    }

}
