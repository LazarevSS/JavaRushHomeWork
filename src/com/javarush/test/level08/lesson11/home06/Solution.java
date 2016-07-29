package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        Human kid1 = new Human("Катя", false, 15, null);
        Human kid2 = new Human("Катя2", false, 16, null);
        Human kid3 = new Human("Катя3", false, 17, null);

        Human father = new Human("Папа", true, 36, kid1);
        Human mother = new Human(" Мама", true, 35, kid2);

        Human grandfather = new Human("дед1", true, 61, father);
        Human grandfather2 = new Human("дед2", true, 65, mother);

        Human grandmother = new Human("бабка1", false, 60, father);
        Human grandmother2 = new Human("бабка2", false, 66, mother);
        ArrayList<Human> family = new ArrayList<>();
        family.add(kid1);
        family.add(kid2);
        family.add(kid3);
        family.add(father);
        family.add(mother);
        family.add(grandfather);
        family.add(grandfather2);
        family.add(grandmother);
        family.add(grandmother2);
        for (Human humy : family)
        {
            System.out.println(humy.toString());
        }

    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public  Human(String name,boolean sex,int age,Human human )
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            if (human != null)
                children.add(human);
            else this.children = new ArrayList<>();



        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
