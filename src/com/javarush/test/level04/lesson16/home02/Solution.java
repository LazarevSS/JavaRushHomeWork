package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        String q=reader.readLine();
        String w=reader.readLine();
        String e=reader.readLine();
        int a = Integer.parseInt(q);
        int b = Integer.parseInt(w);
        int c = Integer.parseInt(e);
        if (a>b&a<c) System.out.println(a);
        if (a<b&a>c) System.out.println(a);
        if (b>a&b<c) System.out.println(b);
        if (b<a&b>c) System.out.println(b);
        if (c<a&c>b) System.out.println(c);
        if (c>a&c<b) System.out.println(c);

    }
}
