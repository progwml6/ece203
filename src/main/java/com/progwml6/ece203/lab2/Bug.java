package com.progwml6.ece203.lab2;

public class Bug
{
    private int pos = 0;
    private boolean movingRt = true;

    public Bug(int initialPos)
    {
        this.pos = initialPos;
    }

    public void turn ()
    {
        if (movingRt ==true)
            movingRt = false;
        movingRt = true;
    }

    public void move ()
    {
        if (movingRt)
            pos += 1;
        else
            pos -= 1;
    }

    public int getPosition ()
    {
        return pos;
    }
}
