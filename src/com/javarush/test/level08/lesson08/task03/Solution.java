package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        Map<String, String> map = new HashMap<>();
        map.put("Снегирев", "Сергей");
        map.put("Лазарев", "Сергей");
        map.put("Касимов", "Денис");
        map.put("Кулешов", "Павел");
        map.put("Ильинский", "Роман");
        map.put("Антонов", "Денис");
        map.put("Иванов", "Максим");
        map.put("Петров", "Евгений");
        map.put("Ермолаев", "Петр");
        map.put("Давыдов", "Владимир");
        return (HashMap<String, String>) map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int count=0;
        for (Map.Entry<String,String> pair : map.entrySet())
        {
            String value = pair.getValue();
            if (name.equals(value))
            {
                count++;
            }
        }
        return count;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet()){
            String key = pair.getKey();
            if (lastName.equals(key)){
                count++;
            }
        }
        return count;
    }
}
