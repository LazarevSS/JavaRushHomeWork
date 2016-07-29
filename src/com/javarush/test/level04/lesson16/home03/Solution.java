package com.javarush.test.level04.lesson16.home03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //Напишите тут ваш код
        int sum;
        sum = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true)
        {
            String num = reader.readLine();
            int n = Integer.parseInt(num);
            sum += n;
            if (n == -1)
            {
                System.out.print(sum);
                break;
            }

        }

    }
}
