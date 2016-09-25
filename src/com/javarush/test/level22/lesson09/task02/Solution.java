package com.javarush.test.level22.lesson09.task02;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* Формируем Where
Сформируйте часть запроса WHERE используя StringBuilder.
Если значение null, то параметр не должен попадать в запрос.
Пример:
{"name", "Ivanov", "country", "Ukraine", "city", "Kiev", "age", null}
Результат:
"name = 'Ivanov' and country = 'Ukraine' and city = 'Kiev'"
*/
public class Solution {
    public static void main(String[] args)
    {
        Map <String,String> test = new LinkedHashMap<>();
        test.put("name", "Ivanov");
        test.put("country", "Ukraine");
        test.put("city", "Kiev");
        test.put("age", null);
        System.out.println(getCondition(test));
    }

    public static StringBuilder getCondition(Map<String, String> params) {
        StringBuilder builder = new StringBuilder();
        int count = 0;
        for (Map.Entry<String, String> entry : params.entrySet()){
            if (entry.getValue() != null && count == 0){
                builder.append(entry.getKey() + " = " +  "'" + entry.getValue()+ "'");
                count++;
            }
            else if (entry.getValue() != null && count != 0) {
                builder.append(" and "  + entry.getKey() + " = " +  "'" + entry.getValue()+ "'");
                count++;
            }
        }
        return builder;
    }
}
