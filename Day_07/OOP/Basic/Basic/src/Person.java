import java.time.LocalDate;

public class Person {
    private String name;
    private int age;
    private String address;

    public void play(){
        System.out.println("I'm playing game");
    }
    public void eat(String foodname){
        System.out.println("I'm eating "+foodname);
    }
    public int getYearOfBirth(){
        return LocalDate.now().getYear()-age;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "My name is " +
                name +
                ", age= " + age +
                ", address= " + address;
    }

    public Person() {
        System.out.println("Constructor without parameter");
    }

    public Person(String name) {
        System.out.println("Constructor with one parameter");
        this.name = name;
    }

    public Person(String name, int age, String address) {
        System.out.println("Constructor with full parameter");
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
