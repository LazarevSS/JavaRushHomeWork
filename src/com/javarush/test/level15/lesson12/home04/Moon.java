package com.javarush.test.level15.lesson12.home04;

/**
 * Created by SS on 07.03.2016.
 */
public class Moon implements Planet
{
    private static Moon instance = new Moon();

    private Moon()
    {}

    public static Moon getInstance()
    {
        return instance;
    }
}
