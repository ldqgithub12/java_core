import Model.Book;
import Services.BookServices;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        boolean check = true;
        BookServices bookServices = new BookServices();
        while (check){
            printMenu();
            System.out.print("Nhap lua chon: ");
            int option = sc.nextInt();
            switch (option){
                case 1: {
                    System.out.println("Danh sach sach !!! ");
                    for (Book book : bookServices.getBooks()){
                        System.out.println(book);
                    }
                    break;
                }
                case 2: {
                    System.out.println("Tim sach theo ten");
                    String name ="";
                    System.out.print("Nhap ten sach can tim: ");
                    sc.nextLine();
                    name = sc.nextLine();
                    bookServices.findByTitle(name);
                    break;
                }
                case 3:{
                    System.out.println("Tim sach theo the loai");
                    String name ="";
                    System.out.print("Nhap ten the loai can tim: ");
                    sc.nextLine();
                    name = sc.nextLine();
                    bookServices.findByCategory(name);
                    break;
                }
                case 4:{
                    System.out.println("Sach duoc xuat ban trong nam nay !!");
                    bookServices.findByPublishingOfThisYear();
                    break;
                }
                case 5:{
                    System.out.println("Thoat khoi chuong trinh");
                    check = false;
                    break;
                }
                default:{
                    System.out.println("Lua chon khong phu hop. Vui long nhap lai !!!");
                    break;
                }
            }
        }

    }
    public static void printMenu(){
        System.out.println("===== MENU =====");
        System.out.println("Option 1. In danh sach sach");
        System.out.println("Option 2. Tim sach theo ten");
        System.out.println("Option 3. Tim sach theo the loai");
        System.out.println("Option 4. Cac sach xuat ban trong nam");
        System.out.println("Option 5. Thoat");

    }
}
