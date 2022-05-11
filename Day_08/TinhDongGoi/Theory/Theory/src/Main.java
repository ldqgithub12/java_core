public class Main {
    public static void main(String[] args) {
//        Person person = new Person();
//        person.setId(9);
//        person.setName("Quang");
//        person.setAge(22);
//        person.setEmail("ledangquang@gmail.com");
//        System.out.println(person);
//
//        Person person1 = new Person(10,"Nguyen Van B",22,"b@gmail.com");
//        System.out.println(person1.getAge());

        Student student = new Student();
        student.setId("12345678");
        student.setAge(18);
        student.setAvgPoint(9.9);
        student.setStudentClass("Avenger assemble");
        student.showInfor();
    }
}
