package com.progwml6.ece203.lab2;

public class Triangle
{
    private int a = 0, b = 0, c = 0;

    public static void main (String[] args)
    {
        Triangle t = new Triangle(3,4,5);
        System.out.println(t.getPerimeter() + " " + t.getArea() + " " + t.isObtuse());

    }

    public Triangle(int sa, int sb, int sc)
    {
        this.a = sa;
        this.b = sb;
        this.c = sc;
        if (sa == 0 || sb == 0 || sc == 0 || ((sa*sa)+(sb*sb)) != sc * sc )
            System.exit(0);
    }

    public int getPerimeter ()
    {
        return (this.a + this.b + this.c);
    }

    public int getArea ()
    {
        int p = getPerimeter();
        Double halfP = (double) (p/2.0);
        int a =   (int) Math.sqrt(halfP * (halfP - this.a) * (halfP - this.b) * (halfP - this.c));
        return a;
    }

    public int isObtuse ()
    {
        if (Math.sin(this.a / this.c) > Math.PI / 2 || Math.cos(this.b / this.c) > Math.PI / 2 || Math.tan(this.a / this.b) > Math.PI / 2)
            return 1;
        return 0;
    }

}
