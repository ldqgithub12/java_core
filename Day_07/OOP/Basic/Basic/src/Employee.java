public class Employee {
    private String name;
    private int age;
    private String address;
    private int totalHours;

    public Employee() {
    }

    public Employee(String name, int age, String address, int totalHours) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.totalHours = totalHours;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(int totalHours) {
        this.totalHours = totalHours;
    }

    public void printInfor(){
        System.out.println("My name is "+name+", i'm "+age+" years old, i'm living in "+address+", my total hours is "+totalHours );
    }
    public long getSalary(){
        long salary = this.totalHours * 20000;
        long bonus=0;
        if (this.totalHours >=200){
            bonus = salary*20/100;
        }
        else if(this.totalHours >=100){
            bonus = salary*10/100;
        }
        return salary+bonus;
    }
}
