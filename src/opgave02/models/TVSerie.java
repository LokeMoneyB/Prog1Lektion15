package opgave02.models;

import java.util.ArrayList;
import java.util.Arrays;

public class TVSerie extends Media{
    private int numberOfSeasons;

    public TVSerie(String title, int numberOfSeasons, Genre[] genres, ArrayList<Actor> cast) {
        super(title,genres,cast);
        this.numberOfSeasons = numberOfSeasons;
    }

    @Override
    public String toString() {
        return "TVSerie{" +
                ", numberOfSeasons=" + numberOfSeasons +
                '}';
    }
}