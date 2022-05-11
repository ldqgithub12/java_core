public class Student {
    private String id;
    private double avgPoint;
    private int age;
    private String studentClass;

    public Student() {
    }

    public Student(String id, double avgPoint, int age, String studentClass) {
        this.id = id;
        this.avgPoint = avgPoint;
        this.age = age;
        this.studentClass = studentClass;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if(id.length()<8 || id.length()>8){
            System.out.println("id must be 8 characters");
            return;
        }
        this.id = id;
    }

    public double getAvgPoint() {
        return avgPoint;
    }

    public void setAvgPoint(double avgPoint) {
        if (avgPoint <0 || avgPoint>10){
            System.out.println("point must be between 0.0 to 10.0");
            return;
        }
        this.avgPoint = avgPoint;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18){
            System.out.println("age must be bigger 18 ");
            return;
        }
        this.age = age;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        if (studentClass.startsWith("A") || studentClass.startsWith("C")){
            this.studentClass = studentClass;
            return;
        }
        System.out.println("Class must start with A or C");

    }
    public void showInfor(){
        System.out.println("Id: "+this.id);
        System.out.println("Avg Point: "+this.avgPoint);
        System.out.println("Age: "+this.age);
        System.out.println("Class: "+this.studentClass);
    }
}
