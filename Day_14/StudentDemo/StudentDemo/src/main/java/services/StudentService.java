package services;

import models.Gender;
import models.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentService {
    List<Student> students = new ArrayList<>();

    public StudentService() {
        students.add(new Student(1,"Le Dang Quang",1, Gender.MALE));
        students.add(new Student(2,"Ho Huu Quang",2, Gender.MALE));
        students.add(new Student(3,"Pham Van Thang",3, Gender.MALE));
        students.add(new Student(4,"Pham Thanh Quy",5, Gender.FEMALE));
        students.add(new Student(5,"Nguyen Tuan Thanh",4, Gender.FEMALE));

    }
    //    Viết method tính thứ hạng trung bình của cả lớp
    public int gradeAvg(){
       int sum = students.stream().reduce(0,(a,b)->a + b.getGrade(),Integer::sum);
       return sum/5;
    }
//    Viết method tính thứ hạng trung bình của nam trong lớp
    public int maleGradeAvg(){
        int count = (int) students.stream().filter(student -> student.getGender().equals(Gender.MALE)).count();
        int sum = students.stream().filter(student -> student.getGender().equals(Gender.MALE)).reduce(0,(a,b)->a+b.getGrade(),Integer::sum);
        return sum/count;
    }
//    Viết method tính thứ hạng trung bình của Nữ trong lớp
    public int femaleGradeAvg(){
        int count = (int) students.stream().filter(student -> student.getGender().equals(Gender.FEMALE)).count();
        int sum = students.stream().filter(student -> student.getGender().equals(Gender.FEMALE)).reduce(0,(a,b)->a+b.getGrade(),Integer::sum);
        return sum/count;
    }
//    Viết method tìm học viên Nam có thứ hạng cao nhất trong lớp
    public Student findMaxRank(){
        List<Student> newStudents = students.stream().filter(student -> student.getGender().equals(Gender.MALE)).collect(Collectors.toList());
        Optional<Student> minOptional = newStudents.stream().min((a,b)->a.getGrade()-b.getGrade());
        Student student = minOptional.get();
        return student;
    }
//    Viết method tìm học viên Nữ có thứ hạng cao nhất trong lớp
public Student findMaxRankFemail(){
    List<Student> newStudents = students.stream().filter(student -> student.getGender().equals(Gender.FEMALE)).collect(Collectors.toList());
    Optional<Student> minOptional = newStudents.stream().min((a,b)->a.getGrade()-b.getGrade());
    Student student = minOptional.get();
    return student;
}
//    Viết method tìm học viên Nam có thứ hạng thấp nhất trong lớp
public Student findMinRank(){
    List<Student> newStudents = students.stream().filter(student -> student.getGender().equals(Gender.MALE)).collect(Collectors.toList());
    Optional<Student> minOptional = newStudents.stream().max((a,b)->a.getGrade()-b.getGrade());
    Student student = minOptional.get();
    return student;
}
//    Viết method tìm học viên Nữ có thứ hạng thấp nhất trong lớp
public Student findMinRankFemale(){
    List<Student> newStudents = students.stream().filter(student -> student.getGender().equals(Gender.FEMALE)).collect(Collectors.toList());
    Optional<Student> minOptional = newStudents.stream().max((a,b)->a.getGrade()-b.getGrade());
    Student student = minOptional.get();
    return student;
}
//    Viết method thứ hạng cao nhất của cả lớp
//    Viết method thứ hạng thấp nhất của cả lớp
//    Viết method lấy ra danh sách tất cả học viên Nữ trong lớp
//    Viết method sắp xếp tên học viên theo chiều tăng dần của bảng chữ cái
//    Viết method sắp xếp thứ hạng học viên theo chiều giảm dần
//    Viết method lấy ra học viên Nữ có tên bắt đầu bằng “J”
//    Viết method lấy ra top 5 người có thứ hạng cao nhất trong lớp
}
