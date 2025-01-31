package opgave02.models;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie extends Media{
    private int productionYear;
    private Director director;
    private double rating;

    public Movie(String title, int productionYear, Director director, Genre[] genres,
                 double rating, ArrayList<Actor> cast) {
        super(title,genres,cast);

        this.productionYear = productionYear;
        this.director = director;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + getTitle() + '\'' +
                ", productionYear=" + productionYear +
                ", director=" + director +
                ", genres=" + Arrays.toString(getGenres()) +
                ", rating=" + rating +
                ", cast=" + getCast() +
                '}';
    }
}