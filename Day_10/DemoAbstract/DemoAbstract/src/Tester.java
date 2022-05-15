public class Tester extends Employee{
    private int error;
    @Override
    public int calculateSalary() {
        return getBasicSalary()+error*50000;
    }

    public Tester() {
    }

    public Tester(int id, String name, String email, int basicSalary, int error) {
        super(id, name, email, basicSalary);
        this.error = error;
    }

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }
}
