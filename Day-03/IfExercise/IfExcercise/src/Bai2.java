import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        int mark;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your mark: ");
        mark = sc.nextInt();
        getMark(mark);
    }
    private static void getMark(int mark) {
        if (mark >= 85) {
            System.out.println("Your rank is A");
        } else if (mark >= 70 && mark < 85) {
            System.out.println("Your rank is B");
        } else if (mark >= 40 && mark < 70) {
            System.out.println("Your rank is C");
        } else {
            System.out.println("Your rank is D");
        }
    }
}
