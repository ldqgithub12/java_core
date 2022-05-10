import models.Student;
import services.StudentServices;

public class Main {
    public static void main(String[] args) {
        StudentServices studentServices = new StudentServices();
        Student student = studentServices.createStudent();
        System.out.println("Thong tin hoc vien la: ");
        studentServices.printInfo(student);
    }
}
