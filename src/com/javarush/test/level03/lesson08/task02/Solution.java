package com.javarush.test.level03.lesson08.task02;

/* Зарплата через 5 лет
Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись:
«Имя» получает «число1» через «число2» лет.
Пример: Коля получает 3000 через 5 лет.
*/

        import java.io.*;


public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine(); //name
        String b = reader.readLine(); //chislo1
        String c = reader.readLine(); // chislo2
        System.out.println(a+" получает "+b+" через "+c+" лет.");


    }
}