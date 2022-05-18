public class DemoCallStackUnchecked {
    public static void methodOne(){
        throw new ArithmeticException("Loi toan hoc");
    }
    public static void methodTwo(){
        methodOne();
    }
    public static void methodThree(){
        methodTwo();
    }

    public static void main(String[] args) {

    }
}