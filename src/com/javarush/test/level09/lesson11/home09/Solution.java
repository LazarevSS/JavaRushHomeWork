package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        Map<String, Cat> catsmap = new HashMap<>();
        catsmap.put("Барсик", new Cat("Cat1"));
        catsmap.put("Мурка", new Cat("Cat2"));
        catsmap.put("Рыжик", new Cat("Cat3"));
        catsmap.put("Барсик2", new Cat("Cat4"));
        catsmap.put("Барсик3", new Cat("Cat5"));
        catsmap.put("Барсик4", new Cat("Cat6"));
        catsmap.put("Барсик5", new Cat("Cat7"));
        catsmap.put("Барсик6", new Cat("Cat8"));
        catsmap.put("Барсик7", new Cat("Cat9"));
        catsmap.put("Барсик8", new Cat("Cat10"));
        return catsmap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        Set<Cat> setname = new HashSet<>();
        for (Map.Entry<String,Cat> pair: map.entrySet() ) {
            Cat a = pair.getValue();
            setname.add(a);
        }
        return setname;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
