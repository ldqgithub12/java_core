package services;

import model.Student;

import java.util.*;

public class StudentServiceImplement implements IStudentServices {
    public ArrayList<Student> students = new ArrayList<>();
    private void init(){
        students.add(new Student(1,"Nguyen Van A",22,"Ha noi",7,"Java"));
        students.add(new Student(2,"Nguyen Van C",21,"Hai Phong",9,"Switch"));
        students.add(new Student(3,"Nguyen Van E",23,"Nghe An",10,"IOS"));
        students.add(new Student(4,"Nguyen Van F",25,"Thanh Hoa",9,"Docker"));
        students.add(new Student(5,"Nguyen Van D",19,"Bac Ninh",6,"React"));
    }

    public StudentServiceImplement() {
        init();
    }
    public ArrayList<Student> getAllStudents(){
        return students;
    }

    @Override
    public void printListStudents(ArrayList<Student> list) {
        for (Student student:list) {
            System.out.println(student);
        }
    }

    @Override
    public Student addNewStudent() {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        System.out.print("Enter the age: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Enter the address: ");
        String address = sc.nextLine();
        System.out.print("Enter the point: ");
        double point = Double.parseDouble(sc.nextLine());
        System.out.println("Enter the classroom: ");
        String classroom = sc.nextLine();
        Student student = new Student(rd.nextInt(100)+6,name,age,address,point,classroom);
        students.add(student);
        return student;
    }

    @Override
    public Student updateStudentPoint(int id) {
        Student student = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap diem moi cho hoc vien: ");
        double point = Double.parseDouble(sc.nextLine());
        for (Student st :students) {
            if (st.getId() == id){
                student = st;
            }
        }
        student.setPoint(point);
        return student;
    }

    @Override
    public void deleteStudent(int id) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if (student.getId() == id){
                iterator.remove();
            }
        }
        System.out.println("Xoa thanh cong !!");
    }

    @Override
    public ArrayList<Student> printByClassroom(String name) {
        ArrayList<Student> result= new ArrayList<>();
        for (Student student:students) {
            if (student.getClassroom().equalsIgnoreCase(name)){
                result.add(student);
            }
        }
        return result;
    }

    @Override
    public ArrayList<Student> sortByName(ArrayList<Student> list) {
        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        });
        return list;
    }

    @Override
    public ArrayList<Student> sortById(ArrayList<Student> list) {
        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getId()-o2.getId();
            }
        });
        return list;
    }

    @Override
    public ArrayList<Student> sortByPoint(ArrayList<Student> list) {
        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int) (o1.getPoint()-o2.getPoint());
            }
        });
        return list;
    }
}
