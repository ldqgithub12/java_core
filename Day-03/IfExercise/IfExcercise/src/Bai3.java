import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        a = sc.nextInt();
        System.out.print("Enter the second number: ");
        b = sc.nextInt();
        System.out.println("The bigger number is: "+ comNumber(a,b));
    }

    private static int comNumber(int a, int b) {
        if(a > b){
            return a;
        }
        else return b;
    }
}
