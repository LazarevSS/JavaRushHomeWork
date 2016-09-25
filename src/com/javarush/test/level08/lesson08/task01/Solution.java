package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        Set<String> set = new HashSet<>();
        set.add("Лак");
        set.add("Лейла");
        set.add("Люций");
        set.add("Лена");
        set.add("Лен");
        set.add("Лида");
        set.add("Ложа");
        set.add("Лоза");
        set.add("Любовь");
        set.add("Лом");
        set.add("Лара");
        set.add("Лык");
        set.add("Лем");
        set.add("Люк");
        set.add("Лора");
        set.add("Лиза");
        set.add("Лихо");
        set.add("Лазарет");
        set.add("Лепра");
        set.add("Лиманск");

        return (HashSet<String>) set;
    }
}
