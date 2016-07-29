package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human gfather1 = new Human("Дед1", true, 81, null, null);
        Human gfather2 = new Human("Дед2", true, 67, null, null);
        Human gmother1 = new Human("Бабка1", false, 73, null, null);
        Human gmother2 = new Human("Бабка2", false, 70, null, null);
        Human father = new Human("Отец", true, 51, gfather1, gmother1);
        Human mother = new Human("Мать", false, 49, gfather2, gmother2);
        Human kids1 = new Human("Ребенок1", false, 20, father, mother);
        Human kids2 = new Human("Ребенок2", false, 10, father, mother);
        Human kids3 = new Human("Ребенок3", true, 16, father, mother);

        System.out.println(gfather1);
        System.out.println(gmother1);
        System.out.println(gfather2);
        System.out.println(gmother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(kids1);
        System.out.println(kids2);
        System.out.println(kids3);
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;
        Human (String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }


        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
