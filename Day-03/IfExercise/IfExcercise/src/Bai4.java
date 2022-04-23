import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        number = sc.nextInt();
        checkPositive(number);
    }

    private static void checkPositive(int number) {
        if(number > 0){
            System.out.println("This is positive number ");
        }
        else if(number < 0){
            System.out.println("This is negative number");
        }
        else System.out.println("This is 0");
    }
}
