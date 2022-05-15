package controller;

import model.Student;
import services.StudentServiceImplement;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
    public StudentServiceImplement studentServiceImplement = new StudentServiceImplement();
    private void printMenu(){
        System.out.println("===== MENU =====");
        System.out.println("1. Xem danh sach hoc sinh");
        System.out.println("2. Them hoc sinh moi");
        System.out.println("3. Cap nhat diem hoc sinh");
        System.out.println("4. Xoa hoc sinh");
        System.out.println("5. Xem danh sach hoc sinh theo lop");
        System.out.println("6. Sap xep theo ten");
        System.out.println("7. Sap xep theo tuoi");
        System.out.println("8. Sap xep theo diem");
        System.out.println("9. Thoat");
    }
    public void run(){
        Scanner sc = new Scanner(System.in);
        boolean isContinue= true;
        int option;
        while (isContinue){
            printMenu();
            System.out.println("nhap lua chon cua ban: ");
            option = Integer.parseInt(sc.nextLine());
            switch (option){
                case 1:{
                    System.out.println("Danh sach hoc sinh !!!");
                    studentServiceImplement.printListStudents(studentServiceImplement.getAllStudents());
                    break;
                }
                case 2:{
                    System.out.println("Them hoc sinh moi !!!");
                    Student student = studentServiceImplement.addNewStudent();
                    System.out.println("Sinh vien moi nhap la: ");
                    System.out.println(student);
                    break;
                }
                case 3:{
                    System.out.println("Cap nhap diem hoc sinh !!!");
                    System.out.print("Nhap id hoc sinh muon cap nhat: ");
                    int id = Integer.parseInt(sc.nextLine());
                    Student student = studentServiceImplement.updateStudentPoint(id);
                    System.out.println("Hoc sinh sau khi duoc cap nhat ");
                    System.out.println(student);
                    break;
                }
                case 4:{
                    System.out.println("Xoa hoc sinh !!!");
                    System.out.print("Nhap id sinh vien muon xoa: ");
                    int id = Integer.parseInt(sc.nextLine());
                    studentServiceImplement.deleteStudent(id);
                    break;
                }
                case 5:{
                    System.out.println("Xem sinh vien theo lop !!!");
                    System.out.print("Nhap ten lop: ");
                    String name = sc.nextLine();
                    ArrayList<Student> list = studentServiceImplement.printByClassroom(name);
                    System.out.println("Danh sach sinh vien theo lop "+name);
                    studentServiceImplement.printListStudents(list);
                    break;
                }
                case 6:{
                    System.out.println("Sap xep sinh vien theo ten");
                    studentServiceImplement.printListStudents(studentServiceImplement.sortByName(studentServiceImplement.getAllStudents()));
                    break;
                }
                case 7:{
                    System.out.println("Sap xep sinh vien theo id");
                    studentServiceImplement.printListStudents(studentServiceImplement.sortById(studentServiceImplement.getAllStudents()));
                    break;
                }
                case 8:{
                    System.out.println("Sap xep sinh vien theo diem");
                    studentServiceImplement.printListStudents(studentServiceImplement.sortByPoint(studentServiceImplement.getAllStudents()));
                    break;
                }
                case 9:{
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
