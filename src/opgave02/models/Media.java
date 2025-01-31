package opgave02.models;

import java.util.ArrayList;
import java.util.Arrays;

public class Media {
    @Override
    public String toString() {
        return "Media{" +
                "title='" + title + '\'' +
                ", genres=" + Arrays.toString(genres) +
                ", cast=" + cast +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Actor> getCast() {
        return cast;
    }

    public Genre[] getGenres() {
        return genres;
    }

    private String title;
    private Genre[] genres;
    private ArrayList<Actor> cast;

    public Media(String title, Genre[] genres, ArrayList<Actor> cast) {
        this.title = title;
        this.genres = genres;
        this.cast = cast;
    }
}
