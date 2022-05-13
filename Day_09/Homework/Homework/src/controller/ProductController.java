package controller;

import models.Product;
import services.ProductServices;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductController {
    ProductServices productServices = new ProductServices();
    private void printMenu(){
        System.out.println("=====_-MENU-_=====");
        System.out.println("1. Xem danh sach san pham");
        System.out.println("2. Tim san pham theo ten");
        System.out.println("3. Tim san pham theo id");
        System.out.println("4. Tim san pham co so luong duoi 5");
        System.out.println("5. Tim san pham theo muc gia");
        System.out.println("6. Thoat !!!");
    }
    public void run(){
        Scanner sc = new Scanner(System.in);
        boolean isContinue = true;
        int option ;
        while (isContinue){
            printMenu();
            System.out.println("Enter your option: ");
            option = Integer.parseInt(sc.nextLine());
            switch (option){
                case 1:{
                    System.out.println("Danh sach san pham: ");
                    ArrayList<Product> list = productServices.getAllProducts();
                    productServices.printProductList(list);
                    break;
                }
                case 2:{
                    System.out.println("Tim san pham theo ten");
                    System.out.print("Nhap ten san pham muon tim: ");
                    String name = sc.nextLine();
                    ArrayList list =  productServices.findByName(name);
                    if (list != null){
                        productServices.printProductList(list);
                    }
                    else {
                        System.out.println("Khong tim thay san pham phu hop !!");
                    }
                    break;
                }
                case 3:{
                    System.out.println("Tim san pham theo id");
                    System.out.print("Nhap id san pham can tim: ");
                    int id = Integer.parseInt(sc.nextLine());
                    Product product = productServices.findById(id);
                    if (product == null){
                        System.out.println("Khong tim thay san pham phu hop ");
                    }
                    else {
                        System.out.println(product);
                        boolean isContinueSub = true;
                        int luachon;
                        while (isContinueSub){
                            System.out.println("1. Xoa san pham !! ");
                            System.out.println("2. Cap nhat so luong san pham ");
                            System.out.println("3. Thoat");
                            System.out.print("Nhap lua chon: ");
                            luachon = Integer.parseInt(sc.nextLine());
                            switch (luachon){
                                case 1:{
                                    productServices.deleteProduct(product.getId());
                                    System.out.println("Xoa san pham thanh cong ");
                                    isContinueSub = false;
                                    break;
                                }
                                case 2:{
                                    System.out.println("Cap nhat so luong san pham ");
                                    Product product1 = productServices.updateQuality(product);
                                    System.out.println("San pham da duoc cap nhat so luong ");
                                    System.out.println(product1);
                                    break;
                                }
                                case 3:{
                                    isContinueSub = false;
                                    break;
                                }
                                default:{
                                    System.out.println("Lua chon khong phu hop !!! ");
                                    break;
                                }
                            }
                        }
                    }
                    break;
                }
                case 4:{
                    System.out.println("Danh sach san pham it hon 5");
                    ArrayList<Product> list = productServices.findQuantityUnderFive();
                    productServices.printProductList(list);
                    break;
                }
                case 5:{
                    System.out.println("Tim san pham theo muc gia ");
                    boolean isContinueSub = true;
                    int luachon;
                    while (isContinueSub){
                        System.out.println("1. Tim san pham duoi 50.000");
                        System.out.println("2. Tim san pham trong khoang 50.000 den 100.000");
                        System.out.println("3. Tim san pham tu 100.000");
                        System.out.println("4. Thoat");
                        System.out.print("Nhap lua chon: ");
                        luachon = Integer.parseInt(sc.nextLine());
                        switch (luachon){
                            case 1: {
                                System.out.println("Danh sach san pham gia duoi 50.000");
                                ArrayList<Product> list = productServices.findCostUnder50();
                                productServices.printProductList(list);
                                break;
                            }
                            case 2:{
                                System.out.println("Danh sach san pham gia tu 50.000 den 100.000");
                                ArrayList<Product> list = productServices.findCostFrom50to100();
                                if (list.isEmpty()){
                                    System.out.println("Khong tim thay san pham phu hop");
                                }
                                else {
                                    productServices.printProductList(list);
                                }
                                break;
                            }
                            case 3:{
                                System.out.println("Danh sach san pham gia tren 100.000");
                                ArrayList<Product> list = productServices.findCostFrom100();
                                if (list.isEmpty()){
                                    System.out.println("Khong tim thay san pham phu hop");
                                }
                                else {
                                    productServices.printProductList(list);
                                }
                                break;
                            }
                            case 4:{
                                isContinueSub = false;
                                System.out.println("Thoat khoi submenu");
                                break;
                            }
                            default:{
                                System.out.println("Lua chon khong phu hop. Vui long nhap lai");
                                break;
                            }
                        }
                    }
                    break;
                }
                case 6:{
                    isContinue = false;
                    System.out.println("Thoat khoi chuong trinh ");
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
