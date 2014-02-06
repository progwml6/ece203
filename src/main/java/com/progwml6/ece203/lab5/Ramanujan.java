package com.progwml6.ece203.lab5;

import java.util.Scanner;

public class Ramanujan
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number");
        int n = input.nextInt();
        for (int a = 1; a <= n; a++)
        {
            int aCubed =(int) Math.pow(a,3);
            if (aCubed > n)
                break;

            // a -- no dupes welcome
            for (int b = a; b <= n; b++)
            {
                int bCubed = (int) Math.pow(b,3);
                if (aCubed + bCubed > n)
                    break;

                // a+1 -- no dupes welcome
                for (int c = a + 1; c <= n; c++)
                {
                    int cCubed = (int) Math.pow(c,3);
                    if (cCubed > aCubed + bCubed)
                        break;

                    //c - no dupes welcome
                    for (int d = c; d <= n; d++)
                    {
                        int d3 = d * d * d;
                        if (cCubed + d3 > aCubed + bCubed)
                            break;

                        if (cCubed + d3 == aCubed + bCubed)
                        {
                            System.out.print((aCubed + bCubed) + " = ");
                            System.out.print(a + "^3 + " + b + "^3 = ");
                            System.out.print(c + "^3 + " + d + "^3");
                            System.out.println();
                        }
                    }
                }
            }
        }
    }
}
