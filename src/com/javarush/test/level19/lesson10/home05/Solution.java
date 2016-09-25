package com.javarush.test.level19.lesson10.home05;

/* Слова с цифрами
В метод main первым параметром приходит имя файла1, вторым - файла2.
Файл1 содержит строки со слов, разделенные пробелом.
Записать через пробел в Файл2 все слова, которые содержат цифры, например, а1 или abc3d
Закрыть потоки. Не использовать try-with-resources
*/


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        FileReader file1 = new FileReader(args[0]);
        FileWriter file2 = new FileWriter(args[1]);
        BufferedReader reader = new BufferedReader(file1);
        String lineFile;
        String[] words;

        while (reader.ready() ){
            lineFile = reader.readLine();
            words = lineFile.split(" ");
            for (String str : words){
                if (str.contains("0"))
                file2.write(str + " ");
                else if (str.contains("1"))
                    file2.write(str + " ");
                else if (str.contains("2"))
                    file2.write(str + " ");
                else if (str.contains("3"))
                    file2.write(str + " ");
                else if (str.contains("4"))
                    file2.write(str + " ");
                else if (str.contains("5"))
                    file2.write(str + " ");
                else if (str.contains("6"))
                    file2.write(str + " ");
                else if (str.contains("7"))
                    file2.write(str + " ");
                else if (str.contains("8"))
                    file2.write(str + " ");
                else if (str.contains("9"))
                    file2.write(str + " ");

            }


        }
        reader.close();
        file1.close();
        file2.close();
    }
}
