import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {

        int hour;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap gio: ");
        hour = sc.nextInt();
        if (hour < 12) {
            System.out.println("Good morning");
        } else if(hour <= 18){
            System.out.println("Good afternoon");
        }
        else{
            System.out.println("Dem roi chao gi nua, di ngu di !!");
        }

    }
}
