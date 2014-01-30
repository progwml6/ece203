package com.progwml6.ece203.lab3;

import java.util.Scanner;

public class AntWalk
{
    private int l, w, h;

    public static void main (String[] args)
    {
        int input;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter length then width then height: ");
        AntWalk a = new AntWalk(scan.nextInt(), scan.nextInt(), scan.nextInt());
        

    }

    public AntWalk(int length, int width, int height)
    {
        this.l = length;
        this.h = height;
        this.w = width;
        getShortest();
    }

    public void getShortest ()
    {
        Double a = Math.sqrt((l + w) * (l + w) + h * h);
        Double b = Math.sqrt((h + w) * (h + w) + l * l);
        Double c = Math.sqrt((h + l) * (h + l) + w * w);
        Double ret;
        if (a < b)
            ret = a;
        else
            ret = b;
        if (c < ret)
            ret = c;
        System.out.println(ret);

    }
}
