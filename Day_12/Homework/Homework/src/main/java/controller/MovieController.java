package controller;

import model.Movie;
import services.MovieService;

import java.util.List;
import java.util.Scanner;

public class MovieController {
    MovieService movieService = new MovieService();
    private void printMenu(){
        System.out.println("===== MENU =====");
        System.out.println("1. Hien thi danh sach phim");
        System.out.println("2. Sap xep phim theo ten");
        System.out.println("3. Sap xep phim theo thoi luong");
        System.out.println("4. Sap xep phim theo luot xem");
        System.out.println("5. Xem so luong phim cua the loai");
        System.out.println("6: Thoat");
    }
    public void run(){
        Scanner sc = new Scanner(System.in);
        Boolean isContinue = true;
        int option;
        while (isContinue){
            printMenu();
            System.out.print("Nhap lua chon: ");
            option = Integer.parseInt(sc.nextLine());
            switch (option){
                case 1: {
                    List<Movie> result = movieService.getAllMovie();
                    System.out.println("Danh sach phim");
                    for (Movie movie:result) {
                        System.out.println(movie);
                    }
                    break;
                }
                case 2:{
                    System.out.println("Sap xep phim theo ten ");
                    movieService.sortByName();
                    break;
                }
                case 3:{
                    System.out.println("Sap xep phim theo thoi luong");
                    movieService.sortByTime();
                    break;
                }
                case 4:{
                    System.out.println("Sap xep theo luot xem");
                    movieService.sortByView();
                    break;
                }
                case 5: {
                    System.out.println("Xem so phim cua the loai");
                    movieService.countMovieByCategory();
                    break;
                }
                case 6:{
                    isContinue = false;
                    System.out.println("Thoat khoi chuong trinh");
                    break;
                }
                default:{
                    System.out.println("Lua chon khong phu hop");
                    break;
                }
            }
        }
    }
}
