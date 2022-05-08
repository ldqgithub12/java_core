public class Test {
    public static void main(String[] args) {
/*        Person person = new Person();
        person.setName("Quang");
        person.setAge(22);
        person.setAddress("Thanh Hoa");
        System.out.println(person.getName());
        System.out.println(person.getYearOfBirth());
        person.play();
        person.eat("Banh mi");
        System.out.println(person.toString());*/

/*        Calculator calculator = new Calculator();
        calculator.setNumber1(10);
        calculator.setNumber2(20);
        calculator.printInfor();
        System.out.println(calculator.getNumber1()+" + "+calculator.getNumber2()+" = "+calculator.addition());
        System.out.println(calculator.getNumber1()+" - "+calculator.getNumber2()+" = "+calculator.subtract());
        System.out.println(calculator.getNumber1()+" * "+calculator.getNumber2()+" = "+calculator.multi());
        System.out.println(calculator.getNumber1()+" / "+calculator.getNumber2()+" = "+calculator.division());*/

        Employee employee = new Employee("Quang",22,"Thanh Hoa",160);
        employee.printInfor();
        System.out.println("Your total salary is "+employee.getSalary());

        Employee employee1 = new Employee();
        employee1.setName("Quy");
        employee1.setAge(20);
        employee1.setAddress("Soc Son");
        employee1.setTotalHours(90);
        employee1.printInfor();
        System.out.println("Your total salary is "+employee1.getSalary());

    }
}
