package com.progwml6.ece203.lab2;

public class Complex
{
    private int real = 0, imag = 0;

    public static void main (String[] args)
    {
       new Complex(2,4).printNum();
       new Complex(6,7).addNum(new Complex(4,6)).printNum();
       new Complex(6,7).multiplyNum(new Complex(4,6)).printNum();
       Complex c = new Complex(4,7);
       c.setImag(6);
       c.setReal(3);
       c.printNum();

    }

    public Complex(int real, int imag)
    {
        this.real = real;
        this.imag = imag;
        if (this.real == 0 || this.imag == 0)
            System.exit(0);
    }

    public void setReal (int a)
    {
        this.real = a;
    }

    public void setImag (int a)
    {
        this.imag = a;
    }

    public int getReal ()
    {
        return this.real;
    }

    public int getImag ()
    {
        return this.imag;
    }

    public void printNum ()
    {
        System.out.println(real + "+" + imag + "i");
    }

    public Complex addNum (Complex a)
    {
        return (Complex) new Complex(this.real + a.getReal(), this.imag + a.getImag());
    }

    public Complex multiplyNum (Complex a)
    {
        return new Complex(this.real * a.getReal(), this.imag * a.getImag());

    }
}
