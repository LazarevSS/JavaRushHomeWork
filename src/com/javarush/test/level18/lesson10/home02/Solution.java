package com.javarush.test.level18.lesson10.home02;

/* Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой
4. Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        int count1 = 0;
        int count2 = 0;
        double summ = 0;
        if (args.length > 0)
        {
            FileInputStream stream = new FileInputStream(args[0]);


            while (stream.available() > 0)
            {
                count1++;
                int data = stream.read();
                if (data == Integer.valueOf(' ')) count2++;
            }
            stream.close();
            summ = (double)count2 / count1 * 100;

        }
        System.out.printf("%.2f", summ);
    }
}
