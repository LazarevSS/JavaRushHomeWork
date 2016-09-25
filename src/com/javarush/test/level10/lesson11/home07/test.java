package com.javarush.test.level10.lesson11.home07;

/**
 * Created by SS on 27.02.2016.
 */
public class test
{
    public static void main(String[] args)
    {
        String a = "sss";
        String b = "s";
        int count = 0;
        for (int i = 0; i < 3; i++){
            String c = a.substring(i,i+1);
            if (c.equals(b)) count++;
        }
        System.out.println(count);
    }
}
