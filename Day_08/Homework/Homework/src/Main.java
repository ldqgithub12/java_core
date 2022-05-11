import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Movie[] movies = {
                new Movie(1,"Doctor Stange","Super hero","Kevin Feige","04/05/2022",137),
                new Movie(2,"Endgame and Loki","Super hero","Kevin Feige","05/05/2022",147),
                new Movie(3,"Infinity war","Super hero","Kevin Feige","06/05/2022",157),
                new Movie(4,"Civil war","Super hero","Kevin Feige","07/05/2022",167)
        };

        Serial[] serials = {
                new Serial(1,"Falcon","Super hero","Kevin Feige","05/05/2021",10,40),
                new Serial(2,"Wanda Vision","Super hero","Kevin Feige","05/05/2021",8,40),
                new Serial(3,"Loki","Super hero","Kevin Feige","05/05/2021",8,40),
                new Serial(4,"Moon Knight","Super hero","Kevin Feige","05/05/2021",10,40),

        };
        System.out.println("Movie !!");
        System.out.printf("%-5s %-15s %-15s %-15s %-15s %-10s \n","Id","Title","Type","Author","Release date","Time");
        for (Movie movie : movies){
            movie.printInfor();
        }
        System.out.println("Serials !!");
        System.out.printf("%-5s %-15s %-15s %-15s %-15s %-10s %-20s \n","Id","Title","Type","Author","Release date","Episode","Average Time");
        for (Serial serial : serials){
            serial.printInfor();
        }
        System.out.print("nhap ten phim can tim: ");
        String name = sc.nextLine();
        System.out.println("Phim can tim");
        for (Movie movie : movies){
            if (movie.getTitle().contains(name)){
                movie.printInfor();
            }
        }
        for (Serial serial : serials){
            if (serial.getTitle().contains(name)){
                serial.printInfor();
            }
        }
    }
}
