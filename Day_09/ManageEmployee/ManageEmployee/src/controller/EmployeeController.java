package controller;

import models.Employee;
import services.EmployeeServices;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeController {
    private final EmployeeServices employeeServices = new EmployeeServices();

    private void printMenu() {
        System.out.println("=====_-MENU-_=====");
        System.out.println("1. In thong tin nhan vien");
        System.out.println("2. Them nhan vien moi");
        System.out.println("3. Tim kiem nhan vien theo ten");
        System.out.println("4. Tim kiem nhan vien theo id");
        System.out.println("5. Xoa nhan vien theo id");
        System.out.println("6. Tim kiem nhan vien co muc luong tu 5.000.000=>10.000.000");
        System.out.println("7. Thoat");
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        boolean isContinue = true;
        int option = 0;
        while (isContinue) {
            printMenu();
            System.out.println("Nhap lua chon: ");
            option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1: {
                    ArrayList<Employee> list = employeeServices.getEmployees();
                    if (list.isEmpty()) {
                        System.out.println("List without employee");
                    } else {
                        System.out.println("Danh sach nhan vien: ");
                        employeeServices.printInfor(list);
                    }
                    break;
                }
                case 2: {
                    Employee em = employeeServices.addNewEmployee();
                    System.out.println("Nhan vien vua duoc them la: ");
                    System.out.println(em);
                    break;
                }
                case 3: {
                    System.out.print("nhap ten muon tim: ");
                    String name = sc.nextLine();
                    ArrayList<Employee> list = employeeServices.findByName(name);
                    if (list.isEmpty()) {
                        System.out.println("Khong co nhan vien co ten " + name + " trong danh sach !!");
                    } else {
                        System.out.println("Danh sach nhan vien co ten la " + name + ": ");
                        employeeServices.printInfor(list);
                    }
                    break;
                }
                case 4: {
                    System.out.print("Nhap id: ");
                    int id = Integer.parseInt(sc.nextLine());
                    Employee em = employeeServices.findById(id);
                    if (em == null) {
                        System.out.println("Khong co nhan vien co id: " + id);
                    } else {
                        System.out.println("Nhan vien co id : " + id);
                        System.out.println(em);
                    }
                    break;
                }
                case 5: {
                    System.out.print("Nhap id: ");
                    int id = Integer.parseInt(sc.nextLine());
                    Employee em = employeeServices.findById(id);
                    if (em == null) {
                        System.out.println("Khong co nhan vien co id: " + id);
                    } else {
                        System.out.println("Nhan vien co id : " + id);
                        System.out.println(em);
                    }
                    employeeServices.deleteEmployee(id);
                    System.out.println("Xoa thanh cong nhan vien co id: " + id);
                    break;
                }
                case 6: {
                    ArrayList<Employee> list = employeeServices.findBySalary(5000000, 10000000);
                    if (list.isEmpty()) {
                        System.out.println("Khong co nhan vien co muc luong 5.000.000 -> 10.000.000 trong danh sach !!");
                    } else {
                        System.out.println("Danh sach nhan vien co muc luong 5.000.000 =>10.000.000 ");
                        employeeServices.printInfor(list);
                    }
                    break;
                }
                case 7: {
                    isContinue = false;
                    System.out.println("Thoat khoi chuong trinh");
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
