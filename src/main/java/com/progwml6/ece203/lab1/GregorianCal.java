package com.progwml6.ece203.lab1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCal
{

    public static void main (String[] args)
    {
        GregorianCalendar progsBirthday = new GregorianCalendar(1994, Calendar.JANUARY, 9);
        System.out.println(progsBirthday.toString());
        progsBirthday.add(Calendar.SECOND, 1000000000);
        System.out.println(progsBirthday.toString());
    }

}
