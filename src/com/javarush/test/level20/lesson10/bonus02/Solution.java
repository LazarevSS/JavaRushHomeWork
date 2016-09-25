package com.javarush.test.level20.lesson10.bonus02;

/* Алгоритмы-прямоугольники
1. Дан двумерный массив N*N, который содержит несколько прямоугольников.
2. Различные прямоугольники не соприкасаются и не накладываются.
3. Внутри прямоугольник весь заполнен 1.
4. В массиве:
4.1) a[i, j] = 1, если элемент (i, j) принадлежит какому-либо прямоугольнику
4.2) a[i, j] = 0, в противном случае
5. getRectangleCount должен возвращать количество прямоугольников.
6. Метод main не участвует в тестировании
*/
public class Solution {
    static String coord = "";
    public static void main(String[] args) {
        byte[][] a = new byte[][]{
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 1}
        };
        int count = getRectangleCount(a);
        System.out.println(coord);
        System.out.println(count);
        System.out.println("count = " + count + ". Должно быть 2");
    }

    public static int getRectangleCount(byte[][] a) {
        int count = 0;
        byte b [][] = a.clone(); // создаем копию многомерного массива
        for (int i = 0; i < a.length; i++){
            b[i] = a[i].clone();
        }
        for (int i = 0; i < b.length; i++){
            for (int j = 0; j < b.length; j++){
                if (b[i][j] == 1) {
                    count++;
                    for (int g = i; g < b.length; g++){
                        if (b[g][j] == 0) break;
                        for (int c = j; c < b.length; c++){
                            if (b[g][c] == 1) b [g][c] = 0;
                            else  break;
                        }
                    }
                }
            }
        }
        return count;
    }
}
