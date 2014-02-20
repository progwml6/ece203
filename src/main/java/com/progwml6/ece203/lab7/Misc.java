package com.progwml6.ece203.lab7;

import java.util.List;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.primitives.Ints;

public class Misc
{
    public static int spread (int[] x)
    {
        int low = 0;
        int high = -1;
        for (int i : x)
        {
            if (high == -1)
            {
                high = i;
            }
            if (i > high)
            {
                high = i;
            }
            if (i < low)
            {
                low = i;
            }
        }
        return high - low;
    }

    public static int[] distinct (int[] inp)
    {
        List<Integer> list = Lists.newArrayList();
        for (int i : inp)
        {
            if (!list.contains(i))
            {
                list.add(i);
            }
        }
        return Ints.toArray(list);

    }

    public static int primes (int n)
    {
        if (n < 2)
        {
            System.err.println("y u give me short #");
            System.exit(0);
        }
        List<Integer> list = Lists.newArrayList();

        boolean[] isCrossed = new boolean[n + 1]; // using 0 based is not fun here
        isCrossed[1] = true;

        for (int i = 2; i <= n; i++)
        {
            if (!isCrossed[i])
            {
                list.add(i);
                int multiple = 2;
                while (i * multiple <= n)
                {
                    isCrossed[i * multiple] = true;
                    multiple++;
                }
            }
        }

        return list.size();
    }

    public static void main (String[] args)
    {
        int[] send = { 0, 1, 3, 5, 7, 8, 99, 1234 };
        System.out.println(spread(send));
        int[] di = { 2, 3, 2, 4, 4, 3, 1, 3 };
        int[] distO = distinct(di);
        for (int i : distO)
        {
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println(primes(12345));
    }
}
