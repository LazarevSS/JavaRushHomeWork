package com.javarush.test.level22.lesson05.task01;

/* Найти подстроку
Метод getPartOfString должен возвращать подстроку начиная с символа после 1-го пробела и до конца слова,
которое следует после 4-го пробела.
Пример: "JavaRush - лучший сервис обучения Java."
Результат: "- лучший сервис обучения"
На некорректные данные бросить исключение TooShortStringException (сделать исключением).
Сигнатуру метода getPartOfString не менять.
Метод main не участвует в тестировании.
*/
public class Solution {
    public static void main(String[] args) throws TooShortStringException
    {
        String s = "JavaRush-лучший сервис обучения Java.";
        System.out.println(getPartOfString(s));
    }
    public static String getPartOfString(String string) throws TooShortStringException
    {
        if (string == null || string.isEmpty()) throw new TooShortStringException();
        int startStr = 0;
        int endStr = 0;
        int count = 0;
        for (int i = 0; i < string.length(); i++){
            String s = string.substring(i, i+1);
            if (s.equals(" ")){
                count++;
            }
            if (count == 1) {
                startStr = i + 1;
                count++;
            }
            if (count == 5) endStr = i + 1;

        }
        if (count < 5) throw new TooShortStringException();

            return string.substring(startStr, endStr);
    }

    public static class TooShortStringException extends Throwable
    {
    }
}
