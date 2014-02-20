package com.progwml6.ece203.lab7;

public class NewFib
{

    public NewFib(int n)
    {
        int f[] = new int[n + 11];
        int i;
        for (int q = 0; q <= 9; q++)
        {
            f[q] = 1;
        }
        for (i = 10; i <= n + 10; i++)
        {
            f[i] = f[i - 3] + f[i - 10];
        }
        System.out.println(f[n]);
    }

    public static void main (String[] args)
    {
        NewFib f = new NewFib(20);
    }

}
