import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
//        cách 1: khai báo và gắn giá trị luôn;
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu cho mang: ");
        n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i=0; i<n; i++){
            System.out.print("Nhap phan tu "+(i+1)+":\t");
            numbers[i] = sc.nextInt();
        }
        System.out.print("Mang vua nhap la:\t");
        System.out.println(Arrays.toString(numbers));
    }
}
