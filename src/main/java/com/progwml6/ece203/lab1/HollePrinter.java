package com.progwml6.ece203.lab1;

public class HollePrinter
{

    public static void main (String[] args)
    {
        String s = new String("Hello, World").replace("e","|").replace("o","e").replace("|","o");
        System.out.println(s);
    }

}
