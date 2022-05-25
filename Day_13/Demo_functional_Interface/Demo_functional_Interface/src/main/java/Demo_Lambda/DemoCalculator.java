package Demo_Lambda;

@FunctionalInterface
interface Calculator{
    int calculate(int a, int b);
}

public class DemoCalculator {
    public static void main(String[] args) {
        Calculator cal = (a,b)->a+b;
        System.out.println(cal.calculate(3,4));

        Calculator calculator =(a,b)->a-b;
        System.out.println(calculator.calculate(6,7));
    }
}
