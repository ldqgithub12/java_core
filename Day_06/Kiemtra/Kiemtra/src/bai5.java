import java.util.Random;
import java.util.Scanner;

public class bai5 {
    public static Scanner sc = new Scanner(System.in);
    public  static Random rd = new Random();
    public static void main(String[] args) {
        int row, col;
        System.out.print("nhap so dong: ");
        row = sc.nextInt();
        System.out.print("nhap so cot: ");
        col = sc.nextInt();
        int [][] a = new int[row][col];
        int [][] b = new int[row][col];
        System.out.println("Nhap phan tu cua mang: ");
        for (int i = 0; i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print("a["+i+"]["+j+"]: ");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("mang vua nhap la: ");
        for (int i = 0; i<row; i++){
            for (int j = 0; j<col;j++){
                System.out.print(a[i][j] +" ");
            }
            System.out.print("\n");
        }
        System.out.println("Cac phan tu nam tren duong cheo la: ");
        for (int i=0; i<row;i++){
            for (int j=0;j<col;j++){
                if(i == j){
                    System.out.print(a[i][j]+" ");
                }
            }
        }
        System.out.println();
//        Sinh thêm mảng mới
        for (int i = 0; i<row; i++){
            for (int j = 0; j<col; j++){
                b[i][j] = rd.nextInt(10)+1;
            }
        }
        System.out.println("mang moi sinh la: ");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Tong 2 mang la: ");
        for (int i =0; i<row;i++){
            for (int j=0; j<col;j++){
                System.out.print(a[i][j] + b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
