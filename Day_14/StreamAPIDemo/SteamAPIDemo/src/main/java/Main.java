import exceptions.NotFoundExceptioin;
import models.Student;
import service.StudentService;

public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        try {
            studentService.printStudents();
        }
        catch (RuntimeException ex){
            ex.printStackTrace();
        }
        try {
            Student student = studentService.getStudentById(1);
            System.out.println(student);
            Student student1 = studentService.getStudentById(10);
            System.out.println(student1);
        }
        catch(NotFoundExceptioin ex){
            ex.printStackTrace();
        }
//        Find by email
        try {
            System.out.println();
            Student student = studentService.getStudentByEmail("quang@gmail.com");
            System.out.println(student);
            Student student1 = studentService.getStudentByEmail("abc@gmail.com");
            System.out.println(student1);
        }
        catch(NotFoundExceptioin ex){
            ex.printStackTrace();
        }
        try
        {
            studentService.deleteStudentById(1);
            studentService.deleteStudentById(90);
        }
        catch (NotFoundExceptioin ex){
            ex.printStackTrace();
        }
    }
}
