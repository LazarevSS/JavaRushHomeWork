package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{

    public static void main(String[] args)
    {

        Man man1=new Man("name1",19,"green1");
        Man man2=new Man("name2",20,"green2");
        Woman woman1=new Woman("name3",21,"yellow");
        Woman woman2=new Woman("name4",22,"yellow2");

        System.out.println(man1);
        System.out.println(man2);
        System.out.println(woman1);
        System.out.println(woman2);
        //выведи их на экран тут
    }

    public static class Man
    {
        String name, address;
        int age;

        public Man(String name, int age, String address)
        {
            this.name = name;
            this.address = address;
            this.age = age;
        }


    }
    public static class Woman{
        String name, address;
        int age;
        Woman (String name, int age, String address){
            this.name = name;
            this.address = address;
            this.age = age;
        }
    }



    //добавьте тут ваши классы
}
