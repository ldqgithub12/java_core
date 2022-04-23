import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        float weight, height;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your weight: ");
        weight = sc.nextFloat();
        System.out.print("Enter your height: ");
        height = sc.nextFloat();
        float bmi = weight/(float) Math.pow(height,2);
        System.out.print("This is your result: ");
        if(bmi < 18.5)
        {
            System.out.println("you are underweight");
        }
        else if (bmi <= 24.9){
            System.out.println("You are normal");
        }
        else {
            System.out.println("you are overweight");
        }
    }
}
