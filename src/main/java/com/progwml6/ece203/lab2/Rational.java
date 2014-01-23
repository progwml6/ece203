package com.progwml6.ece203.lab2;

public class Rational
{
    private int num; //NUMERATOR
    private int den; //DEMOMINATOR

    public Rational(int a, int b)
    {
        this.num = a;
        this.den = b;
    }

    public Rational(int a)
    {
        this.num = a;
        this.den = 1;
    }

    public void setRational (int a, int b)
    {
        this.num = a;
        this.den = b;
    }

    public void setRational (int a)
    {
        this.num = a;
        this.den = 1;
    }

    public int getNum ()
    {
        return num / gcd(num, den);
    }

    public int getDen ()
    {
        return den / gcd(num, den);
    }

    public void add (int c, int d)
    {
        int nt, dt, gc;
        nt = getNum() * d + c * getDen();
        dt = getDen() * d;
        gc = gcd(dt, nt);
        System.out.println("(" + nt + "/" + dt + ") GCD: " + gc);
        num = nt / gc;
        den = dt / gc;

    }

    private static int gcd (int m, int n)
    {
        int mx = Math.max(m, n);
        int mn = Math.min(m, n);
        int remainder = 1;
        while (remainder != 0)
        {
            remainder = mx % mn;
            mx = mn;
            mn = remainder;
        }
        return mx;
    }

}
