public class Developer extends Employee{
    private int overtimeHours;

    public Developer() {
    }

    public Developer(int id, String name, int age, String phone, String email, int salaryBasic, int overtimeHours) {
        super(id, name, age, phone, email, salaryBasic);
        this.overtimeHours = overtimeHours;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public long calSalary(){
        return this.getSalaryBasic()+this.overtimeHours*200000;
    }

    @Override
    public void printInfor() {
        super.printInfor();
        System.out.printf("%5d %15d",overtimeHours,this.calSalary());
    }
}
