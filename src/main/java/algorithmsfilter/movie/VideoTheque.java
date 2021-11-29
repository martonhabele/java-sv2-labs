package algorithmsfilter.movie;

import java.util.ArrayList;
import java.util.List;

public class VideoTheque {
    private List<Movie> movies = new ArrayList<>();

    public List<Movie> getMovies() {
        return movies;
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public List<Movie> getGoodMoviesWithCategoryGiven(Category category) {
        List<Movie> result = new ArrayList<>();
        for (Movie scopedMovie : movies) {
            if (scopedMovie.getCategory() == category && scopedMovie.getRating() > 3) {
                result.add(scopedMovie);
            }
        }
        return result;
    }
}