package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        Map<String, Integer> list = new HashMap<>();
        list.put("January", 1);
        list.put("February", 2);
        list.put("March", 3);
        list.put("April", 4);
        list.put("May", 5);
        list.put("June", 6);
        list.put("Jule", 7);
        list.put("August", 8);
        list.put("September", 9);
        list.put("October", 10);
        list.put("November", 11);
        list.put("December", 12);

        if (list.containsKey(s))
            System.out.println(s + " is " + list.get(s) + " month");


    }
}




