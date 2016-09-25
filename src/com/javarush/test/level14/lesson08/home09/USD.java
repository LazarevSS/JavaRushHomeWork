package com.javarush.test.level14.lesson08.home09;

/**
 * Created by SS on 05.03.2016.
 */
public class USD extends Money
{
    public USD (double Amount)
    {
        super (Amount);
    }
    public String getCurrencyName()
    {
        return "USD";
    }
}
