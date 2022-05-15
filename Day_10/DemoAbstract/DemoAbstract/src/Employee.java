public abstract class Employee {
    private int id;
    private String name;
    private String email;
    private int basicSalary;

    public Employee() {
    }

    public Employee(int id, String name, String email, int basicSalary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.basicSalary = basicSalary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }
    public void register(){
        System.out.println("Employee register....");
    }
    public abstract int calculateSalary();

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", basicSalary=" + basicSalary +
                '}';
    }
}
