package services;

import models.Employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class EmployeeServices {
    private ArrayList<Employee> employees;

    private void init() {
        employees = new ArrayList<>();
        employees.add(new Employee(1, "Nguyen Van A", "a@gmail.com", 14_000_000));
        employees.add(new Employee(2, "Nguyen Van B", "b@gmail.com", 11_000_000));
        employees.add(new Employee(3, "Nguyen Van C", "c@gmail.com", 19_000_000));
        employees.add(new Employee(4, "Nguyen Van D", "d@gmail.com", 8_000_000));

    }

    //Khởi tạo data từ constructor
    public EmployeeServices() {
        init();
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void printInfor(ArrayList<Employee> list) {
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }

    public Employee addNewEmployee() {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int id = rd.nextInt(100) + 1;
        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        System.out.print("Enter the email: ");
        String email = sc.nextLine();
        System.out.print("Enter the salary: ");
        int salary = Integer.parseInt(sc.nextLine());
        Employee employee = new Employee(id, name, email, salary);
        employees.add(employee);
        return employee;
    }

    public ArrayList<Employee> findByName(String name) {
        ArrayList<Employee> list = new ArrayList<>();
        for (Employee e : employees) {
            if (e.getName().toLowerCase().contains(name.toLowerCase())) {
                list.add(e);
            }
        }
        return list;
    }

    public Employee findById(int id){
        for (Employee e:employees
             ) {
            if (e.getId() == id){
                return e;
            }
        }
        return null;
    }

    public void deleteEmployee(int id){
        // TODO: Test foreach to delete
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()){
            Employee em = iterator.next();
            if (em.getId()==id){
                iterator.remove();
            }
        }
    }

    public ArrayList<Employee> findBySalary(int minSalary,int maxSalary){
        ArrayList<Employee> list = new ArrayList<>();
        for (Employee em:employees
             ) {
            if (em.getSalary() >= minSalary && em.getSalary()<=maxSalary){
                list.add(em);
            }
        }
        return list;
    }
}
