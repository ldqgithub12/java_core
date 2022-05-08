public class Person {
    private String name;
    private int age;
    private String email;
    private String phone;
    private boolean isMarried;

    public Person() {}

    public Person(String name, int age, String email, String phone, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.isMarried = isMarried;
    }
    public static Person builder(){
        return new Person();
    }
    public Person withName(String name){
        this.name=name;
        return this;
    }
    public Person withAge(int age){
        this.age = age;
        return this;
    }
    public Person withPhone(String phone){
        this.phone=phone;
        return this;
    }
    public Person withMail(String email){
        this.email=email;
        return this;
    }
    public Person withMarried(boolean isMarried){
        this.isMarried=isMarried;
        return this;
    }
    public Person build(){
        return new Person(name,age,email,phone,isMarried);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", isMarried=" + isMarried +
                '}';
    }
}
