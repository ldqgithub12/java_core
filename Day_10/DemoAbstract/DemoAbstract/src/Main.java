import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Developer developer = new Developer(1,"Nguyen Van A","a@gmail.com",2_000_000,20);
        Tester tester = new Tester(3,"Nguyen Van B","b@gmail.com",1_000_000,20);

        System.out.println("Developer");
        developer.register();
        System.out.println(developer.calculateSalary());

        System.out.println("Tester");
        tester.register();
        System.out.println(tester.calculateSalary());

        ArrayList<Employee> list = new ArrayList<>();
        list.add(developer);
        list.add(new Developer(2,"Nguyen Van C","c@gmail.com",2_000_000,20));
        list.add(tester);
        list.add(new Tester(1,"Nguyen Van D","a@gmail.com",2_000_000,20));

        int totalSalary=0;
        for (Employee em:list
             ) {
            System.out.println("Ten : "+em.getName()+" - luong: "+em.calculateSalary());
            totalSalary +=em.calculateSalary();
        }
        System.out.println("Tong tien phai tra cho nhan vien "+totalSalary);
//        Sắp xếp theo tên
        list.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.getName().compareTo(o1.getName());
            }
        });
        for (Employee employee:list){
            System.out.println(employee);
        }
    }
}
