import java.lang.reflect.Type;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        String name, gender, address;
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.print("Enter your age: ");
        age = Integer.parseInt(sc.nextLine());
        System.out.print("Enter your gender: ");
        gender = sc.nextLine();
        System.out.print("Enter your address: ");
        address = sc.nextLine();

        System.out.println("Hi, my name is "+name+", i'm "+age+" years old. I am "+gender+", now i am living in "+address+" ");
    }
}
