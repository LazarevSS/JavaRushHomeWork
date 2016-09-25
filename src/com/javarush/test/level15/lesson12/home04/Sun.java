package com.javarush.test.level15.lesson12.home04;

/**
 * Created by SS on 07.03.2016.
 */
public class Sun implements Planet
{
    private static Sun instance = new Sun();

    private Sun()
    {}

    public static Sun getInstance()
    {
        return instance;
    }
}
