package com.javarush.test.level15.lesson09.task01;

import java.util.HashMap;
import java.util.Map;

/* Статики 1
В статическом блоке инициализировать labels 5 различными парами.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static
    {
      labels.put(2.0, "Пара1");
      labels.put(2.1, "Пара2");
      labels.put(5.6, "Пара3");
      labels.put(8.0, "Пара4");
      labels.put(2.6, "Пара5");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
