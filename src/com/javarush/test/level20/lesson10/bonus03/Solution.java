package com.javarush.test.level20.lesson10.bonus03;

import java.util.ArrayList;
import java.util.List;

/* Кроссворд
1. Дан двумерный массив, который содержит буквы английского алфавита в нижнем регистре.
2. Метод detectAllWords должен найти все слова из words в массиве crossword.
3. Элемент(startX, startY) должен соответствовать первой букве слова, элемент(endX, endY) - последней.
text - это само слово, располагается между начальным и конечным элементами
4. Все слова есть в массиве.
5. Слова могут быть расположены горизонтально, вертикально и по диагонали как в нормальном, так и в обратном порядке.
6. Метод main не участвует в тестировании
*/
public class Solution {
    public static void main(String[] args) {
        int[][] crossword = new int[][]{
                {'f', 'd', 'e', 'r', 'l', 'k'},
                {'u', 's', 'a', 'm', 'e', 'o'},
                {'l', 'n', 'g', 'r', 'o', 'v'},
                {'m', 'l', 'p', 'r', 'r', 'h'},
                {'p', 'o', 'e', 'e', 'j', 'j'}
        };
        detectAllWords(crossword, "home", "same");
        /*
Ожидаемый результат
home - (5, 3) - (2, 0)
same - (1, 1) - (4, 1)
         */
    }

    public static List<Word> detectAllWords(int[][] crossword, String... words) {
        List<Word> test = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String same = words[i];
            char start = same.substring(0, 1).charAt(0);
            char end = same.substring(same.length() - 1, same.length()).charAt(0);
            int startX = 0;
            int startY = 99;
            int endX = 0;
            int endY = 99;
            int xz = same.length() - 1;
            for (int length = 0; length < crossword.length + 1; length++) {
                for (int height = 0; height < crossword.length; height++) {
                    if (start == crossword[height][length]) {
                        startX = height;
                        endX = length;
                        try {
                            if (end == crossword[startX + xz][endX]) {
                                startY = startX + xz;
                                endY = endX;
                            }
                        } catch (Exception e) {
                        }
                        try {
                            if (end == crossword[startX][endX + xz]) {
                                startY = startX;
                                endY = endX + xz;
                            }
                        } catch (Exception e) {
                        }
                        try {
                            if (end == crossword[startX - xz][endX]) {
                                startY = startX - xz;
                                endY = endX;
                            }
                        } catch (Exception e) {
                        }
                        try {
                            if (end == crossword[startX][endX - xz]) {
                                startY = startX;
                                endY = endX - xz;
                            }
                        } catch (Exception e) {
                        }
                        try {
                            if (end == crossword[startX + xz][endX + xz]) {
                                startY = startX + xz;
                                endY = endX + xz;
                            }
                        } catch (Exception e) {
                        }
                        try {
                            if (end == crossword[startX - xz][endX - xz]) {
                                startY = startX - xz;
                                endY = endX - xz;
                            }
                        } catch (Exception e) {
                        }
                        try {
                            if (end == crossword[startX + xz][endX - xz]) {
                                startY = startX + xz;
                                endY = endX - xz;
                            }
                        } catch (Exception e) {
                        }try {
                            if (end == crossword[startX - xz][endX + xz]) {
                                startY = startX - xz;
                                endY = endX + xz;
                            }
                        } catch (Exception e) {
                        }
                        if (startY != 99 && endY != 99) {
                            Word a = new Word(words[i]);
                            a.setStartPoint(endX, startX);
                            a.setEndPoint(endY, startY);
                            test.add(a);
                        }



                    }
                }

            }
        }

        for (int i = 0; i < words.length; i++)
        {
            System.out.println(test.get(i).toString());
        }

        return test;
    }


    public static class Word {
        private String text;
        private int startX;
        private int startY;
        private int endX;
        private int endY;

        public Word(String text) {
            this.text = text;
        }

        public void setStartPoint(int i, int j) {
            startX = i;
            startY = j;
        }

        public void setEndPoint(int i, int j) {
            endX = i;
            endY = j;
        }

        @Override
        public String toString() {
            return String.format("%s - (%d, %d) - (%d, %d)", text, startX, startY, endX, endY);
        }
    }
}
