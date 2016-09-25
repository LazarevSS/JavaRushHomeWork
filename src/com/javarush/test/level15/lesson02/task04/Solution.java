package com.javarush.test.level15.lesson02.task04;

/* ООП - книги
1. Создайте public static класс MarkTwainBook, который наследуется от Book. Имя автора [Mark Twain]. Параметр конструктора - имя книги.
2. В классе MarkTwainBook реализуйте все абстрактные методы.
3. Для метода getBook расширьте тип возвращаемого результата.
4. Создайте по аналогии AgathaChristieBook. Имя автора [Agatha Christie].
5. В классе Book реализуйте тело метода getOutputByBookType так, чтобы он возвращал:
5.1. agathaChristieOutput для книг Агаты Кристи;
5.2. markTwainOutput для книг Марка Твена.
*/

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Book> books = new LinkedList<>();
        books.add(new MarkTwainBook("Tom Sawyer"));
        books.add(new AgathaChristieBook("Hercule Poirot"));
        System.out.println(books);
    }

    public abstract static class Book
    {
        private String author;

        public Book(String author)
        {
            this.author = author;
        }

        public abstract Book getBook();

        public abstract String getName();

        private String getOutputByBookType()
        {
            String agathaChristieOutput = author + ", " + getBook().getName() + " is a detective";
            String markTwainOutput = getBook().getName() + " book was written by " + author;

            String output = "output";
            if (this instanceof AgathaChristieBook)
            {
                output = agathaChristieOutput;
            }
            else output = markTwainOutput;

            return output;
        }

        public String toString()
        {
            return getOutputByBookType();
        }
    }

    public static class MarkTwainBook extends Book
    {
        String author;
        public MarkTwainBook (String author)
        {
            super("Mark Twain");
            this.author = author;
        }

        public MarkTwainBook getBook()
        {
            return this;
        }

        public String getName()
        {
            return author;
        }
    }

    public static class AgathaChristieBook extends Book
    {
        String author;
        public AgathaChristieBook (String author)
        {
            super("Agatha Christie");
            this.author = author;
        }

        public AgathaChristieBook getBook()
        {
            return this;
        }

        public String getName()
        {
            return author;
        }
    }
}
