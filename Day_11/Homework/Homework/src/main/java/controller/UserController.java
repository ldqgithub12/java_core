package controller;

import models.User;
import services.UserServices;

import java.io.IOException;
import java.util.Scanner;

public class UserController {
    UserServices userServices = new UserServices();

    private void printMenu() {
        System.out.println("=== MENU ===");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Forget password ?");
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        boolean isContinue = true;
        int option;
        while (isContinue) {
            printMenu();
            System.out.print("Nhap lua chon cua ban: ");
            option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1: {
                    System.out.println("Dang nhap");
                    User user = userServices.login();
                    System.out.println("Xin chao " + user.getUserName() + ", ban co the thuc hien nhung chuc nang sau");
                    boolean isSubContinue = true;
                    int subOption;
                    while (isSubContinue) {
                        System.out.println("1. Thay doi username");
                        System.out.println("2. Thay doi email");
                        System.out.println("3. Thay doi mat khau");
                        System.out.println("4. Dang xuat");
                        System.out.println("5. Thoat khoi chuong trinh");
                        System.out.print(" Nhap lua chon cua ban: ");
                        subOption = Integer.parseInt(sc.nextLine());
                        switch (subOption) {
                            case 1: {
                                System.out.println("Thay doi username");
                                userServices.changeUsername(user);
                                break;
                            }
                            case 2: {
                                System.out.println("Thay doi email");
                                userServices.changeEmail(user);
                                break;
                            }
                            case 3: {
                                System.out.println("Thay doi mat khau ");
                                userServices.changePassword(user);
                                break;
                            }
                            case 4: {
                                isSubContinue = false;
                                break;
                            }
                            case 5: {
                                System.out.println("Thoat khoi chuong trinh");
                                isContinue = false;
                                isSubContinue = false;
                                break;
                            }
                            default: {
                                System.out.println("Lua chon khong phu hop");
                                break;
                            }
                        }
                    }
                    break;
                }
                case 2: {
                    System.out.println("Dang ky tai khoan !!! ");
                    try {
                        userServices.register();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    break;
                }
                case 3: {
                    System.out.println("Quen mat khau !!");
                    userServices.forgetPassword();
                    break;
                }
                default: {
                    System.out.println("Lua chon khong phu hop");
                    break;
                }
            }
        }
    }
}

