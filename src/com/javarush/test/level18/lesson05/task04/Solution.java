package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        reader.close();
        FileInputStream file = new FileInputStream(name1);
        FileOutputStream file2 = new FileOutputStream(name2);
        byte[] buffer = new byte[file.available()];
        System.out.println(file.read(buffer));

        for(int i = file.read(buffer); i > 0; i--)
            file2.write(buffer[i-1]);
        file.close();
        file2.close();

    }
}
