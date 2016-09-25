package com.javarush.test.level15.lesson12.home05;

/**
 * Created by SS on 08.03.2016.
 */
public class SubSolution extends Solution
{
    public SubSolution(String a)
    {
        super(a);
    }

    public SubSolution(int a)
    {
        super(a);
    }

    public SubSolution(double a)
    {
        super(a);
    }

    protected SubSolution(String a, int b)
    {
        super(a, b);
    }

    protected SubSolution(int a, double b)
    {
        super(a, b);
    }

    protected SubSolution(double a, String b)
    {
        super(a, b);
    }

    SubSolution(Character a)
    {
        super(a);
    }

    SubSolution(Byte a)
    {
        super(a);
    }

    SubSolution(Character a, Byte b)
    {
        super(a, b);
    }

    private SubSolution (Short a, Character b)
    {
        super(a, b);
    }

    private SubSolution (Short a)
    {
        super(a);
    }

    private SubSolution (Short a, Byte b)
    {
        super (a, b);
    }
}
