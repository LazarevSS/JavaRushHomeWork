package com.javarush.test.level16.lesson10.task05;

/**
 * Created by lazarevss on 23.03.2016.
 */
public class test
{
    public static void main(String[] args) throws InterruptedException
    {
        for (int i = 0; i < 3; i++)
        {
            new Thread(new LiftOff()).start();
            System.out.println("ss");
        }
    }
    public static class LiftOff implements Runnable {
        protected int countDown = 10; // Значение по умолчанию
        private static int taskCount = 0;
        private final int id = taskCount++;
        public LiftOff() {}
        public LiftOff(int countDown) {
            this.countDown = countDown;
        }
        public String status() {
            return "#" + id + "(" +
                    (countDown > 0 ? countDown : "Liftoff!") + "), ";
        }
        public void run() {
            while(countDown-- > 0) {
                System.out.print(status());
                Thread.yield();
            }
        }
    }
}
