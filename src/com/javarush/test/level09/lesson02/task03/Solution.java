package com.javarush.test.level09.lesson02.task03;

/* Метод должен вернуть номер строки кода, из которого вызвали этот метод
Написать пять методов, которые вызывают друг друга. Метод должен вернуть номер строки кода, из которого вызвали этот метод. Воспользуйся функцией: element.getLineNumber().
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        method1();
    }

    public static int method1()
    {
        method2();
        StackTraceElement[] main = Thread.currentThread().getStackTrace(); // получаем стэк трейс (набор вызовов методов из последнего к первому)
        int vyzov1 = main[2].getLineNumber();  //вводим переменную, которая выводит номер строки вызова данного метода (тк снизу вверх и вызывается из предыдущего метода, то индекс равен 2)
        System.out.println(vyzov1);
        return vyzov1;
    }

    public static int method2()
    {
        method3();
        StackTraceElement[] main = Thread.currentThread().getStackTrace();
        int vyzov2 = main[2].getLineNumber();
        System.out.println(vyzov2);
        return vyzov2;
    }

    public static int method3()
    {
        method4();
        StackTraceElement[] main = Thread.currentThread().getStackTrace();
        int vyzov3 = main[2].getLineNumber();
        System.out.println(vyzov3);
        return vyzov3;
    }

    public static int method4()
    {
        method5();
        StackTraceElement[] main = Thread.currentThread().getStackTrace();
        int vyzov4 = main[2].getLineNumber();
        System.out.println(vyzov4);
        return vyzov4;
    }

    public static int method5()
    {
        StackTraceElement[] main = Thread.currentThread().getStackTrace();
        int vyzov5 = main[2].getLineNumber();
        System.out.println(vyzov5);
        return vyzov5;
    }
}
