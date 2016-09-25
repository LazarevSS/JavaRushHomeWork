package com.javarush.test.level19.lesson10.home02;

/* Самый богатый
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Вывести в консоль имена, у которых максимальная сумма
Имена разделять пробелом либо выводить с новой строки
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 0.501
Иванов 1.35
Петров 0.85

Пример вывода:
Петров
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        TreeMap<String, Double> map = new TreeMap<>();
        FileReader file = new FileReader(args[0]);
        BufferedReader reader = new BufferedReader(file);
        String lineFile;
        String[] massiv;
        Double d;
        double max = 0;
        while ((lineFile = reader.readLine()) != null) {
            massiv = lineFile.split(" ");
              if (map.containsKey(massiv[0])){
                  d = map.get(massiv[0]);
                  map.put(massiv[0], Double.valueOf(massiv[1]) + d);
              }
            else map.put(massiv[0], Double.valueOf(massiv[1]));
        }


        for (String s : map.keySet()) {
            double xz = map.get(s);
            if (xz > max) max = xz;
        }

        for (String s : map.keySet()){
            double xz2 = map.get(s);
            if (xz2 == max) System.out.println(s);
        }
        file.close();
        reader.close();

    }
}
