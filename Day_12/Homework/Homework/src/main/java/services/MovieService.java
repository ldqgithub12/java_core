package services;

import com.google.gson.Gson;
import model.Movie;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class MovieService {
    List<Movie> movieList = new ArrayList<>();

    public MovieService() {
        movieList = getObjectFromJsonFile("movie.json");
    }
    public List<Movie> getAllMovie(){
        return movieList;
    }

    public List<Movie> getObjectFromJsonFile(String filename){
        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get(filename));
            List<Movie> books = Arrays.asList(gson.fromJson(reader,Movie[].class));
            reader.close();
            return books;
        }
        catch (IOException e){
            e.printStackTrace();
        }

        return null;
    }
    public void sortByName(){
        movieList.sort(new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getTitle().toLowerCase().compareTo(o2.getTitle().toLowerCase());
            }
        });
        for (Movie movie:movieList){
            System.out.println(movie);
        }
    }
    public void sortByTime(){
        movieList.sort(new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getLength() - o2.getLength();
            }
        });
        for (Movie movie:movieList){
            System.out.println(movie);
        }
    }
    public void sortByView(){
        movieList.sort(new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getView() - o2.getView();
            }
        });
        for (Movie movie:movieList){
            System.out.println(movie);
        }
    }
    public void countMovieByCategory(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten the loai: ");
        String theloai = sc.nextLine();
        int count = 0;
        for (Movie movie:movieList) {
            for (String name:movie.getCategory()){
                if (name.toLowerCase().equals(theloai.toLowerCase())){
                    count++;
                }
            }
        }
        System.out.println("So phim cua the loai "+theloai+" :"+count);
    }
}
