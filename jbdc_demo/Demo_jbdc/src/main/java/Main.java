import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User_service userService = new User_service();
        ArrayList<User> result = userService.getAllUsers();
        userService.showUser(result);

        User u = userService.getUserById("asd");
        System.out.println(u);

        Date date = Date.valueOf(LocalDate.now());

        User newUser = new User(Ulti.randomId(5),"Quy2","quy2@gmail.com","1243565",date);
        userService.addNewUser(newUser);
//        userService.changePassword(u,"987654321");
//        userService.deleteUser(u);
//        User u1 = null;
//        while (u1 == null){
//            System.out.println("Nhap email");
//            String email = sc.nextLine();
//            System.out.println("Nhap mat khau: ");
//            String password = sc.nextLine();
//            u1 = userService.login(email,password);
//            if (u1 != null){
//                System.out.println("Login successfully");
//                System.out.println("Hello "+u1.getUserName());
//            }
//            else {
//                System.out.println("login fail. Login again !!!");
//            }
//        }
    }
}
