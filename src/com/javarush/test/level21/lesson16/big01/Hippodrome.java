package com.javarush.test.level21.lesson16.big01;

import java.util.ArrayList;

/**
 * Created by lazarevss on 05.07.2016.
 */
public class Hippodrome
{
    public static Hippodrome game;

    ArrayList<Horse> horses = new ArrayList<>();

    public ArrayList<Horse> getHorses()
    {
        return horses;
    }
    public void run() throws InterruptedException
    {
        for (int i = 0; i < 100; i++){
            move();
            print();
            Thread.sleep(200);
        }
    }
    public void move(){
        for (Horse horse : getHorses() ){
            horse.move();
        }
    }
    public void print(){
        for (Horse horse : getHorses()){
            horse.print();
        }
        System.out.println();
        System.out.println();
    }
    public Horse getWinner(){
        Horse win = horses.get(0);
        for (int i = 1; i < horses.size(); i++){
            if (horses.get(i).getDistance() > win.getDistance())
                win = horses.get(i);
        }
        return win;
    }
    public void printWinner(){
        System.out.println("Winner is " + getWinner().getName() + "!");
    }


    public static void main(String[] args) throws InterruptedException
    {
        game = new Hippodrome();
        Horse pavel = new Horse("Pavel", 3, 0);
        Horse andrey = new Horse("Andrey", 3, 0);
        Horse sergey = new Horse("Sergey", 3, 0);
        game.getHorses().add(pavel);
        game.getHorses().add(andrey);
        game.getHorses().add(sergey);
        game.run();
        game.printWinner();
    }
}
