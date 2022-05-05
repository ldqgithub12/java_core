import java.util.Scanner;

public class Bai1 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        System.out.println("Nhap so phan tu mang: ");
        n = sc.nextInt();
        int[] inputArray = new int[n];
        nhapMang(inputArray);
        int[] outputArray = convertArray(inputArray);
        System.out.println("Ket qua sau khi convert mang la: ");
        for (int i = 0; i<outputArray.length;i++){
            System.out.print(outputArray[i]+" ");
        }

    }

    private static void nhapMang(int[] inputArray) {
        for (int i=0;i<inputArray.length;i++)
        {
            System.out.print("nhap phan tu thu "+(i+1)+": ");
            inputArray[i] = sc.nextInt();
        }
    }
    private  static int[] convertArray(int[] inputArray){
        for (int i = 0;i<inputArray.length;i++){
            inputArray[i] %= 2;
        }
        return  inputArray;
    }
}
