package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        String q = reader.readLine();
        String w = reader.readLine();
        int a = Integer.parseInt(q);
        int b = Integer.parseInt(w);
        if (a<b) System.out.println(a);
        else System.out.println(b);

    }
}