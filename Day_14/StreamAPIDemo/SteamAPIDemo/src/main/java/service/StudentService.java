package service;

import exceptions.NotFoundExceptioin;
import models.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentService {
    private List<Student> students;

    public StudentService() {
        students = new ArrayList<>();
        students.add(new Student(1,"Quang","quang@gmail.com"));
        students.add(new Student(2,"Quang2","quang2@gmail.com"));
        students.add(new Student(3,"Quang3","quang3@gmail.com"));
        students.add(new Student(4,"Quang4","quang4@gmail.com"));
    }
//    In ra danh sách
    public void printStudents(){
        if (students.isEmpty()){
            throw new NotFoundExceptioin("List is empty");
        }
        students.forEach(student -> System.out.println(student));
    }

    public Student getStudentById(int id){
        Optional<Student> optionalStudent = findStudent(id);
        if (optionalStudent.isPresent()){
            return optionalStudent.get();
        }
        else {
            throw new NotFoundExceptioin("Can't find student with id "+id);

        }
    }

    public Student getStudentByEmail(String email){
        Optional<Student> optionalStudent = findStudent(email);
        return optionalStudent.orElseThrow(()->{
            throw new NotFoundExceptioin("Can't find student with emain: "+email);
        });
    }
    public void deleteStudentById(int id){
        if (findStudent(id).isEmpty()){
            throw new NotFoundExceptioin("Student do not exist");
        }
        else {
            students.removeIf(student -> student.getId() == id);
            System.out.println("Delete successfully");
        }
    }
//    Tìm kiếm student theo id
    public Optional<Student> findStudent(int id){
        return students.stream().filter(student -> student.getId() == id).findFirst();
    }
    public Optional<Student> findStudent(String email){
        return students.stream().filter(student -> student.getEmail().equals(email)).findFirst();
    }
//    Tìm kiếm student theo email
//    Xóa student theo id;
}
