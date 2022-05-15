public class Developer extends Employee{
    private  int overtimeHours;
    @Override
    public int calculateSalary() {
        return this.getBasicSalary()+overtimeHours*200000;
    }

    public Developer() {
    }

    public Developer(int id, String name, String email, int basicSalary, int overtimeHours) {
        super(id, name, email, basicSalary);
        this.overtimeHours = overtimeHours;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }
}
