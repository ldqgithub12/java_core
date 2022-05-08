public class Main {
    public static void main(String[] args) {
        Student student = new Student("Quang",22,GENDER.MALE);
        String name = student.getName();
        int age = student.getAge();
        GENDER gender = student.getGender();
        System.out.println("My name is "+name+" i am "+age+" years old, i'm "+gender);
        System.out.println(Student.school);
    }
}
