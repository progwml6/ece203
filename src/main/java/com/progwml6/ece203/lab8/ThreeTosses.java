package com.progwml6.ece203.lab8;

import java.util.Random;

public class ThreeTosses
{
    public static void main (String[] args)
    {
        threeToss();
        biasedCoin();
    }

    public static void threeToss ()
    {
        Random r = new Random();
        int t = 0;
        for (int i = 0; i < 3; i++)
        {
            boolean b1 = r.nextBoolean();
            if (b1)
                t++;
        }
        System.out.println((double) t / 3.0);
    }

    public static void biasedCoin ()
    {
        Random r = new Random();
        boolean prev = getBiasedAnswer(r);
        boolean current = getBiasedAnswer(r);
        int tosses = 2;
        boolean quit = false;
        while (!quit)
        {
            if (prev && !current)
            {
                System.out.println("HEADS");
                quit=true;
            }
            else if (!prev && current)
            {
                System.out.println("TAILS");
                quit=true;
            }
            prev = current;
            current = getBiasedAnswer(r);
            tosses++;
        }
    }

    public static boolean getBiasedAnswer (Random r)
    {
        if (r.nextDouble() > .7)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
