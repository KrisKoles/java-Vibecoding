package ru.Homework14;


import java.util.Comparator;

public class MovieRatingComparator implements Comparator<Movie> {


    @Override
    public int compare(Movie m1, Movie m2) {
        // Сортировка от меньшего рейтинга к большему
        return Double.compare(m1.getRating(), m2.getRating());
    }


}
