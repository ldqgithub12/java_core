import controller.MovieController;
import model.Movie;
import services.MovieService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MovieController movieController = new MovieController();
        movieController.run();
    }
}
