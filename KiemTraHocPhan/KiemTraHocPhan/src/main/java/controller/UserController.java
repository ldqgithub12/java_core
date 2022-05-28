package controller;

import models.TransactionHistory;
import models.User;
import services.UserService;

import java.util.Scanner;

public class UserController {
    private void printMenu(){
        System.out.println("=== MENU ===");
        System.out.println("1. Truy van so du tai khoan");
        System.out.println("2. Chuyen tien");
        System.out.println("3. Xem lich su giao dich");
        System.out.println("4. Thoat");
    }
    public void run(){
        UserService userService = new UserService();
        Scanner sc = new Scanner(System.in);
        int option;
        System.out.println("Dang nhap vao he thong");
        boolean isContinue =true;
        User user = userService.login();
        while (isContinue){
            printMenu();
            System.out.println("Nhap lua chon cua ban: ");
            option = Integer.parseInt(sc.nextLine());
            switch (option){
                case 1: {
                    System.out.println("View Balance");
                    userService.viewBalance(user);
                    break;
                }
                case 2:{
                    System.out.println("Chuyen tien");
                    TransactionHistory transactionHistory = new TransactionHistory();
                    transactionHistory = userService.transferMoney(user);
                    System.out.println("Giao dich thuc hien thanh cong");
                    System.out.println(transactionHistory);
                    break;
                }
                case 3:{
                    userService.viewTransactionHistory(user);
                    break;
                }
                case 4:{
                    isContinue = false;
                    System.out.println("Thoat khoi he thong ");
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
