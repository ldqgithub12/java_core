import java.util.Scanner;

public class ThucHanhWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("Enter the number: ");
            int number = sc.nextInt();
            if (number ==0){
                System.out.println("Nhap so khac 0. Nhap lai !!");
            }
            else {
                System.out.println("So vua nhap la: " + number);
                break;
            }
        }
    }
}
