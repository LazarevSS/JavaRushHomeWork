package com.javarush.test.level04.lesson13.task02;

import java.io.*;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String q =reader.readLine();
        String w =reader.readLine();
        int a =Integer.parseInt(q);
        int b =Integer.parseInt(w);
        int m,n;
        for (m=0; m<a; m++){
            for (n=0; n<b; n++){
                System.out.print(8);
            }
            System.out.println();
        }
    }
}