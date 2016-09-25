package com.javarush.test.level19.lesson03.task04;

import java.io.IOException;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* И еще один адаптер
Адаптировать Scanner к PersonScanner.
Классом-адаптером является PersonScannerAdapter.
Данные в файле хранятся в следующем виде:
Иванов Иван Иванович 31 12 1950

В файле хранится большое количество людей, данные одного человека находятся в одной строке. Метод read() должен читать данные одного человека.
*/

public class Solution {
    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner scanner;
        public PersonScannerAdapter(Scanner scanner){
            this.scanner = scanner;
        }

        @Override
        public Person read() throws IOException
        {
            String s = scanner.nextLine();
            String[] massiv = s.split(" ");
            Date date = (new GregorianCalendar(Integer.parseInt(massiv[5]), Integer.parseInt(massiv[4]) - 1, Integer.parseInt(massiv[3]))).getTime();
            Person person = new Person(massiv[1], massiv[2], massiv[0], date);
            return person;
        }

        @Override
        public void close() throws IOException
        {
            this.scanner.close();
        }
    }
}
