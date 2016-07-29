package com.javarush.test.level03.lesson06.task03;

/* Семь цветов радуги
Создать 7 объектов, чтобы на экран вывелись 7 цветов радуги (ROYGBIV).
Каждый объект при создании выводит на экран определенный цвет.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Red q = new Red();
        Orange w = new Orange();
        Yellow e = new Yellow();
        Green r = new Green();
        Blue t = new Blue();
        Indigo y = new Indigo();
        Violet u = new Violet();//напишите тут ваш код

    }

    public static class Red
    {
        public Red() {
            System.out.println("Red");
        }
    }

    public static class Orange
    {
        public Orange() {
            System.out.println("Orange");
        }
    }

    public static class Yellow
    {
        public Yellow() {
            System.out.println("Yellow");
        }
    }

    public static class Green
    {
        public Green() {
            System.out.println("Green");
        }
    }

    public static class Blue
    {
        public Blue() {
            System.out.println("Blue");
        }
    }

    public static class Indigo
    {
        public Indigo() {
            System.out.println("Indigo");
        }
    }

    public static class Violet
    {
        public Violet() {
            System.out.println("Violet");
        }
    }
}