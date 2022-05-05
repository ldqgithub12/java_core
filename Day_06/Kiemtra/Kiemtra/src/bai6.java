import java.util.Scanner;
import java.util.regex.Pattern;

public class bai6 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String email_pattern = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
        String phone_pattern = "^[0-9]{9,11}$";
        String email,phone = "";
        System.out.print("Nhap email: ");
        email = sc.nextLine();
        System.out.print("Nhap so dien thoai: ");
        phone = sc.nextLine();
        System.out.println("\""+email+"\"" + " Co hop le hay khong :" +(Pattern.matches(email_pattern,email) ? "Co":"Khong"));
        System.out.println("\""+phone+"\"" + " Co hop le hay khong :" +(Pattern.matches(phone_pattern,phone) ? "Co":"Khong"));
    }
}
