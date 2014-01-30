package com.progwml6.ece203.lab4;

import java.util.Scanner;

public class Quadrant
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter x1 then y1 then x2 then y2: ");
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        if (x1 == 0 || x2 == 0 || y1 == 0 || y2 == 0)
        {
            System.err.println("Don't give values on an axis!!");
            System.exit(0);
        }
        int q1 = getQuadrant(x1, y1);
        int q2 = getQuadrant(x2, y2);

        if (q1 == q2)
        
            System.out.println("Same Quadrant");
        
        if (q1 == q2 + 1 || q1 == q2 -1)
            System.out.println("adjacent");
        else
            System.out.println("opposite");
    }

    public static int getQuadrant (int x, int y)
    {
        if (x > 0 && y > 0)
            return 1;
        if (x > 0 && y < 0)
            return 2;
        if (x < 0 && y < 0)
            return 3;
        else
            return 4;
    }
}
