package ru.Homework14;

public class Movie {

    private String movieName;
    private double rating;

    public Movie(String movieName, double rating){
        this.movieName = movieName;
        this.rating = rating;
    };

    public String getMovieName(){ return movieName; }
    public double getRating() { return rating; }

    @Override
    public String toString() {
        return String.format("%s (%.1f)", movieName, rating);
    }
}
