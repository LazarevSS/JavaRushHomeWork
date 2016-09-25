package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static HashSet<Integer> createSet()
    {
        Set<Integer> set = new HashSet<>();
        set.add(25);
        set.add(2);
        set.add(0);
        set.add(5);
        set.add(20);
        set.add(15);
        set.add(9);
        set.add(10);
        set.add(22);
        set.add(7);
        set.add(3);
        set.add(29);
        set.add(28);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(60);
        set.add(70);
        set.add(80);
        set.add(90);
        return (HashSet<Integer>) set;

    }



        public static HashSet<Integer> removeAllNumbersMoreThan10 (HashSet < Integer > set)
        {
            Iterator<Integer> xz = set.iterator();
            while (xz.hasNext()){
                if (xz.next()>10) xz.remove();
            }
            return  set;
        }

}