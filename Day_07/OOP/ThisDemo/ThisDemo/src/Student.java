public class Student {
    private String name;
    private int age;
    private GENDER gender;
    public static String school = "Dao Duy Tu";

    public Student() {
    }

    public Student(String name, int age, GENDER gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public GENDER getGender() {
        return gender;
    }

    public void setGender(GENDER gender) {
        this.gender = gender;
    }
}

