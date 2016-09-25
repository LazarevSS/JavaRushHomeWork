package com.javarush.test.level14.lesson08.home09;

/**
 * Created by SS on 05.03.2016.
 */
public class Hrivna extends Money
{
    public Hrivna (double Amount)
    {
        super(Amount);
    }
    public String getCurrencyName()
    {
        return "HRN";
    }
}
