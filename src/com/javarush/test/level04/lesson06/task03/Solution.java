package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String q = reader.readLine();
        String w = reader.readLine();
        String e = reader.readLine();
        int a = Integer.parseInt(q);
        int b = Integer.parseInt(w);
        int c = Integer.parseInt(e);
        System.out.println(max(a, b, c));
        System.out.println(mid(a, b, c));
        System.out.println(min(a, b, c));
    }
        static int min(int x,int y,int z){
          if (x<=y&x<=z)
              return  x;
            else if (y<=z)
              return y;
            else return z;
    }
     static int mid(int x1, int y2, int z2){
         if (x1<=y2&x1>=z2)
             return x1;
         else if ((y2>=z2&z2<=x1)||(y2<=z2&y2>=x1))
             return y2;
         else return z2;
     }
    static int max(int x3, int y3, int z3){
        if (x3>=y3&x3>=z3)
            return x3;
        else if (y3>=z3)
            return y3;
        else return z3;
    }
}
