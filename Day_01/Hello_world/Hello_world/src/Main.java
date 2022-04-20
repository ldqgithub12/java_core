import java.util.Scanner;

public class Main {
//    Khai báo biến cục bộ
    public static int globalVariable = 20;
    public static void main(String[] args) {
        System.out.println("Hello world");
//        System.out.println("Chao phat nua");
        String firstName, lastName;
        firstName = "Le";
        lastName="Quang";
        String fullName = "Le Dang Quang";
//        System.out.println(firstName+" "+lastName);
//        System.out.println(fullName);
        int age = 22;
        System.out.println("Hello, my name is "+fullName+". I'm "+age+" years old");
        long money = 10_000_000_000L;
        System.out.println("Hello, my name is "+fullName+". I'm "+age+" years old. I have "+money+" VND");
        boolean isMarried = false;
        System.out.println("Hello, my name is "+fullName+". I'm "+age+" years old. I have "+money+" VND, is married: "+!isMarried);

//        Khai báo dấu phẩy động
        float weight = 60.5f, height=180.5f;
        System.out.println("Hello, my name is "+fullName+". I'm "+age+" years old. I have "+money+" VND, is married: "+!isMarried+" " +
                ". Current weight: "+weight+", current height: "+height+" cm" );
        char gender;
        //Search bảng mã ascii trên google
        gender = 77;
        System.out.println("Gender: "+gender);

//        Ép kiểu
//        double number;
//        int numberFloat;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập số cần nhập: ");
//        number = sc.nextDouble();
//        numberFloat =(int) number;
//        System.out.println(numberFloat);
//        Phạm vi của biến
//        Biến cục bộ
        System.out.println(globalVariable);

    }
}
