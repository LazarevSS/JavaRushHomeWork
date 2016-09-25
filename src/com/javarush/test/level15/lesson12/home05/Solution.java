package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution {
    public Solution (String a)
    {}
    public Solution (int a)
    {}
    public Solution (double a)
    {}

    protected Solution (String a, int b)
    {}
    protected Solution (int a, double b)
    {}
    protected Solution (double a, String b)
    {}

    Solution (Character a)
    {}
    Solution (Byte a)
    {}
    Solution (Character a, Byte b)
    {}

    private Solution (Short a, Character b)
    {}
    private Solution (Short a)
    {}
    private Solution (Short a, Byte b)
    {}

}

