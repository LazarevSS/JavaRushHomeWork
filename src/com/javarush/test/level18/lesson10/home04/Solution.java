package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();
        FileInputStream stream1 = new FileInputStream(file1);
        byte[] buffer1 = new byte[stream1.available()];
        stream1.read(buffer1);
        stream1.close();

        FileInputStream stream2 = new FileInputStream(file2);
        byte[] buffer2 = new byte[stream2.available()];
        stream2.read(buffer2);
        stream2.close();

        FileOutputStream outstream = new FileOutputStream(file1);
        outstream.write(buffer2);
        outstream.write(buffer1);
        outstream.close();
    }
}
