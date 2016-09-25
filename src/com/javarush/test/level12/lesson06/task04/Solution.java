package com.javarush.test.level12.lesson06.task04;

/* Класс Cow от Animal
Унаследуй класс Cow от Animal.
Реализуй все недостающие методы в классе Cow.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Animal cow1 = new Cow();
        System.out.println(cow1);
    }

    public static abstract class Animal
    {
        public abstract String getName();
    }

    public static class Cow extends Animal
    {
        public String getName(){
            return "Я - корова, а не абстрактный класс";
        }
    }

}
