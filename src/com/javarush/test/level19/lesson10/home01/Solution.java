package com.javarush.test.level19.lesson10.home01;

/* Считаем зарплаты
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Все данные вывести в консоль, предварительно отсортировав в возрастающем порядке по имени
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 2
Сидоров 6
Иванов 1.35
Петров 3.1

Пример вывода:
Иванов 1.35
Петров 5.1
Сидоров 6.0
*/



import java.io.*;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        TreeMap<String, Double> map = new TreeMap<>();

        FileReader file = new FileReader(args[0]);
        BufferedReader reader = new BufferedReader(file);
        String lineFile;
        String [] massiv;
        Double d ;
        while ((lineFile = reader.readLine()) != null ) {
            massiv = lineFile.split(" ");

            if (map.containsKey(massiv[0])){
                d = map.get(massiv[0]);
                map.put(massiv[0], Double.valueOf(massiv[1]) + d);
            }
            else {
                map.put(massiv[0], Double.valueOf(massiv[1]));
            }
        }
        file.close();
        reader.close();
        for (String key : map.keySet()){
            System.out.println(key + " " + map.get(key));
        }

    }
}
