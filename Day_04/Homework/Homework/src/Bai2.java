import java.util.Scanner;

public class Bai2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        boolean isContinue = true;
        System.out.print("Nhap so phan tu cho mang: ");
        n = sc.nextInt();
        int[] numbers = new int[n];
        while (isContinue){
            inMenu();
            int option;
            option = sc.nextInt();
            switch (option){
                case 1:{
                    System.out.println("Nhap mang");
                    numbers=nhapMang(n,numbers);
                    break;
                }
                case 2:{
                    System.out.println("Mang vua nhap la: ");
                    inMang(n,numbers);
                    break;
                }
                case 3:{
                    numbers = tangSoChan(n,numbers);
                    System.out.println("Mang sau khi thay doi la: ");
                    inMang(n,numbers);
                    break;
                }
                case 4:{
                    isContinue = false;
                    System.out.println("Thoat khoi chuong trinh !!!");
                    break;
                }
                default:{
                    System.out.println("Nhap khong hop le. Vui long nhap lai");
                    break;
                }
            }
        }
    }

    private static int[] tangSoChan(int n, int[] numbers) {
        for (int i = 0; i<n;i++){
            if(numbers[i] %2 == 0){
                numbers[i] = numbers[i]+1;
            }
        }
        return  numbers;

    }

    private static void inMang(int n, int[] numbers) {
        for (int i = 0; i<n; i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.print("\n");
    }

    private static int[] nhapMang(int n, int[] numbers) {
        for(int i =0; i<n;i++){
            System.out.print("nhap phan tu thu "+(i+1)+": ");
            numbers[i] = sc.nextInt();
        }
        return numbers;
    }

    private static void inMenu() {
        System.out.println("===== MENU =====");
        System.out.println("Option 1: Nhap mang");
        System.out.println("Option 2: In Mang");
        System.out.println("Option 3: Thay doi phan tu chan cua mang");
        System.out.println("Option 4: Thoat");
    }
}
