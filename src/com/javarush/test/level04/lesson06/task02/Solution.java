package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String q = reader.readLine();
        String w = reader.readLine();
        String e = reader.readLine();
        String r = reader.readLine();
        int a = Integer.parseInt(q);
        int b = Integer.parseInt(w);
        int c = Integer.parseInt(e);
        int d = Integer.parseInt(r);
        if ((a>b)&(a>c)&(a>d)) System.out.println(a);
        else if ((b>a)&(b>c)&(b>d)) System.out.println(b);
        else if ((c>a)&(c>b)&(c>d)) System.out.println(c);
        else if ((d>a)&(d>c)&(d>b)) System.out.println(d);

    }
}
