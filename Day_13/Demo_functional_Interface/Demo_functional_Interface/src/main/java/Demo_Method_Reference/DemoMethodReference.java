package Demo_Method_Reference;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface Hello{
    void display();
}
public class DemoMethodReference {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Quang","Quang@gmial.com"));
        students.add(new Student(2,"Quang1","Quang1@gmial.com"));
        students.add(new Student(3,"Quang2","Quang2@gmial.com"));
        students.forEach(student -> System.out.println(student));
        System.out.println();
        students.forEach(System.out::println);

        Student student = new Student(1,"Quang","Quang@gmial.com");
        Hello h = student::printInfo;
        h.display();
    }
}
