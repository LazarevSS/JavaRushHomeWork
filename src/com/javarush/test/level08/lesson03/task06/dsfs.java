package com.javarush.test.level08.lesson03.task06;

import java.util.Date;

/**
 * Created by SS on 07.02.2016.
 */
public class dsfs
{
    public static void main(String[] args) throws Exception
    {
        Date currentTime = new Date();
        int hours = currentTime.getHours();
        int mins = currentTime.getMinutes();
        int secs = currentTime.getSeconds();

        System.out.println("Time from midnight " + hours + ":" + mins + ":" + secs);
    }
}
