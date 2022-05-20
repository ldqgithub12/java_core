package controller;

import exception.NotFoundException;
import models.Book;
import services.BookServices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookController {
    BookServices bookServices = new BookServices();
    private void printMenu(){
        System.out.println("===_-MENU-_===");
        System.out.println("1. Hien thi danh sach sach");
        System.out.println("2. Tim sach theo ten");
        System.out.println("3. Tim sach theo the loai");
        System.out.println("4. Sap xep theo so trang");
        System.out.println("5. Sap xep theo nam xuat ban");
        System.out.println("6. Thoat");
    }
    public void run(){
        Scanner sc = new Scanner(System.in);
        boolean isContinue =true;
        int option;
        while (isContinue){
            printMenu();
            try {

                System.out.print("Nhap lua chon cua ban: ");
                option = Integer.parseInt(sc.nextLine());
            }
            catch (RuntimeException ex){
                throw new NotFoundException("Vui long nhap lua chon tu 1->6 bang so");
            }
            switch (option){
                case 1:{
                    System.out.println("Hien thi danh sach sach");
                    List<Book> bookList = new ArrayList<>();
                    bookList = bookServices.getObjectFromJsonFile("book.json");
                    for (Book b: bookList){
                        System.out.println(b);
                    }
                    break;
                }
                case 2:{
                    System.out.println("Tim sach theo ten !!");
                    List<Book> result = bookServices.findByName();
                    System.out.println("Ket qua tim kiem");
                    for (Book b:result){
                        System.out.println(b);
                    }
                    break;
                }
                case 3:{
                    System.out.println("Tim sach theo danh muc");
                    List<Book> result = bookServices.findByCategory();
                    System.out.println("Ket qua tim kiem");
                    for (Book b:result){
                        System.out.println(b);
                    }
                    break;
                }
                case 4:{
                    System.out.println("Sap xep theo so trang");
                    bookServices.sortByPageNumber();
                    break;
                }
                case 5:{
                    System.out.println("Sap xep theo nam xuat ban");
                    bookServices.sortByReleaseYear();
                    break;
                }
                case 6:{
                    isContinue = false;
                    System.out.println("Thoat khoi chuong trinh");
                    break;
                }
                default:{
                    System.out.println("Nhap lua chon khong phu hop");
                    break;
                }
            }
        }
    }
}
