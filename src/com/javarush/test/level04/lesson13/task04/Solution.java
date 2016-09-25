package com.javarush.test.level04.lesson13.task04;

import java.io.*;

/* Рисуем линии
Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        for(int a=0;a<11;a++){
            for (int b=0;b<10;b++){
                if (a==0||b==0)
                System.out.print("8");
            }
            System.out.println();
        }

    }
}
