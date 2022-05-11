public class Tester extends Employee {
    private int error;

    public Tester() {
    }

    public Tester(int id, String name, int age, String phone, String email, int salaryBasic, int error) {
        super(id, name, age, phone, email, salaryBasic);
        this.error = error;
    }

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }
    public long calSalary(){
        return this.getSalaryBasic() + this.error*50000;
    }

    @Override
    public void printInfor() {
        super.printInfor();
        System.out.printf("%5d %15d",error,this.calSalary());
    }
}
