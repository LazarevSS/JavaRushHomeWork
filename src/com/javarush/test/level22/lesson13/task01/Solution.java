package com.javarush.test.level22.lesson13.task01;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.StringTokenizer;

/* StringTokenizer
Используя StringTokenizer разделить query на части по разделителю delimiter.
Пример,
getTokens("level22.lesson13.task01", ".") == {"level22", "lesson13", "task01"}
*/
public class Solution {
    public static void main(String[] args)
    {

    }
    public static String [] getTokens(String query, String delimiter) {
        ArrayList<String> list = new ArrayList<>();
        StringTokenizer tokenizer = new StringTokenizer(query, delimiter);
        while (tokenizer.hasMoreTokens()){
            String a = tokenizer.nextToken();
            list.add(a);
        }
        String[] maasiv = new String[list.size()];
        for (int i = 0; i < list.size(); i++){
            maasiv[i] = list.get(i);
        }
        return maasiv;
    }
}
