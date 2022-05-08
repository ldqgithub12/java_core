public class Calculator {
    private int number1;
    private int number2;

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public void printInfor(){
        System.out.println("number 1: "+number1+", number 2: "+number2);
    }
    public int addition(){
        return number1+number2;
    }
    public int subtract(){
        return number1-number2;
    }
    public int multi(){
        return number1*number2;
    }
    public float division(){
        return (float) number1/number2;
    }
}
