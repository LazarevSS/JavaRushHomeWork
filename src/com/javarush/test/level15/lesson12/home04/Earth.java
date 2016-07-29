package com.javarush.test.level15.lesson12.home04;

/**
 * Created by SS on 07.03.2016.
 */
public class Earth implements Planet
{
    private static Earth instance = new Earth();

    private Earth(){}

    public static Earth getInstance()
    {
        return instance;
    }
}
