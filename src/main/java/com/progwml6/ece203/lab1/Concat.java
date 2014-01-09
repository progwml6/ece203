package com.progwml6.ece203.lab1;

public class Concat
{

    public static void main (String[] args)
    {
        String s1 = new String("Hello");
        String s2 = new String(" World");
        System.out.println(s1 + " " + s2);
        String s3 = new String();
        s3 = s1.concat(s2);
        System.out.println(s3);
        s3 = s3.toLowerCase();
        System.out.println(s3);

    }

}
