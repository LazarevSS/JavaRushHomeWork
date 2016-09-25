package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;


public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream file1 = new FileOutputStream(new File(reader.readLine()));
        FileInputStream file2 = new FileInputStream(new File(reader.readLine()));
        FileInputStream file3 = new FileInputStream(new File(reader.readLine()));
        while (file2.available() > 0) {
            byte[] buffer = new byte[file2.available()];
            int data = file2.read(buffer);
            file1.write(buffer, 0, data);
        }
        while (file3.available() > 0) {
            byte[] buffer = new byte[file3.available()];
            int data = file3.read(buffer);
            file1.write(buffer, 0, data);
        }
        reader.close();
        file1.close();
        file2.close();
        file3.close();


    }
}
