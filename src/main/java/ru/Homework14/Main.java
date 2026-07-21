package ru.Homework14;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Movie> movies = new ArrayList<>();

        movies.add(new Movie("Интерстеллар", 8.7));
        movies.add(new Movie("Шрек", 8.1));
        movies.add(new Movie("Начало", 8.8));
        movies.add(new Movie("Веном", 6.6));


        //Выводим ДО сортировки
        System.out.println("ДО сортировки");
        for (Movie movie : movies) {
            System.out.println(movie);
        }

        // Сортируем с помощью компаратора
        movies.sort(new MovieRatingComparator());

        //Выводим ПОСЛЕ сортировки
        System.out.println("\nПОСЛЕ сортировки(от меньшего рейтинга к большему)");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
}
