import services.StudentService;

public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        System.out.println(studentService.findMinRankFemale());
    }
}
