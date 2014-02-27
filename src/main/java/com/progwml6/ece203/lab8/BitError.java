package com.progwml6.ece203.lab8;

import java.util.Random;

public class BitError
{
    public static void main (String[] args)
    {
        boolean prev = true;
        Random r = new Random();
        int correct = 0;
        for (int i = 0; i < 1000000; i++)
        {
            if (transmitCorrectly(r, prev))
            {
                correct++;
                prev = true;
            }
            else
            {
                prev = false;
            }
        }
        System.out.println(100.0 - ((double) correct/1000000 *100));

    }

    public static boolean transmitCorrectly (Random r, boolean b)
    {
        if (b)
        {
            return r.nextDouble() > .1;
        }
        else
        {
            return r.nextDouble() > .3;
        }
    }

}
