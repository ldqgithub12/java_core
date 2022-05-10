package services;

import models.Student;

import java.util.Random;
import java.util.Scanner;

public class StudentServices {
    public Student createStudent(){
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        Student student = new Student();
        student.id = rd.nextInt(100)+1;
        System.out.print("Nhap ten hoc vien: ");
        student.name = sc.nextLine();
        System.out.print("Nhap diem ly thuyet: ");
        student.theoryPoint = sc.nextDouble();
        System.out.print("Nhap diem thuc hanh: ");
        student.practicePoint=sc.nextDouble();
        return student;
    }
    public double calculateAvgPoint(double theoryPoint, double practicePoint) {
        double point = (theoryPoint+practicePoint)/2;
        return point;
    }
    public void printInfo(Student s) {
        System.out.println("id: "+s.id);
        System.out.println("Name: "+s.name);
        System.out.println("Theory Point: "+s.theoryPoint);
        System.out.println("Practice Point: "+s.practicePoint);
        System.out.println("Diem trung binh: "+this.calculateAvgPoint(s.theoryPoint,s.practicePoint));

    }
}
