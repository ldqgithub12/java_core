import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten vao day: ");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi");
        int tuoi = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập giới tính");
        String gioitinh = sc.nextLine();

        System.out.println("My name is "+name+", i'm "+tuoi+". Myy gender is: "+gioitinh);
    }
}
