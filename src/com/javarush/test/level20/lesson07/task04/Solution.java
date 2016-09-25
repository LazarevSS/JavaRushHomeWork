package com.javarush.test.level20.lesson07.task04;

import com.sun.corba.se.pept.encoding.InputObject;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* Serializable Solution
Сериализуйте класс Solution.
Подумайте, какие поля не нужно сериализовать, пометить ненужные поля — transient.
Объект всегда должен содержать актуальные итоговые данные.
Метод main не участвует в тестировании.
Написать код проверки самостоятельно в методе main:
1) создать файл, открыть поток на чтение (input stream) и на запись(output stream)
2) создать экземпляр класса Solution - savedObject
3) записать в поток на запись savedObject (убедитесь, что они там действительно есть)
4) создать другой экземпляр класса Solution с другим параметром
5) загрузить из потока на чтение объект - loadedObject
6) проверить, что savedObject.string равна loadedObject.string
7) обработать исключения
*/
public class Solution implements Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        System.out.println(new Solution(4));

        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("D:/234.out"));
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(new File("D:/234.out")));
        Solution savedObject = new Solution(21);
        try
        {
            outputStream.writeObject(savedObject);
            outputStream.close();
        }
        catch (Exception e){
            System.out.println("Не найден файл.");
        }
        Solution otherSolution = new Solution(15);
        Object loadedObject = inputStream.readObject();
        inputStream.close();

        System.out.println(savedObject.toString().equals(loadedObject.toString()));
        System.out.println(loadedObject.toString());



    }

    private transient final String pattern = "dd MMMM yyyy, EEEE";
    private transient Date currentDate;
    private transient int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
