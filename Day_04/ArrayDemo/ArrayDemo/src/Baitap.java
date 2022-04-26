import java.util.Scanner;

public class Baitap {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n ;
        System.out.print("Nhap so phan tu mang: ");
        n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i =0; i<n; i++){
            System.out.print("Nhap phan tu thu "+(i+1)+": ");
            numbers[i] = sc.nextInt();
        }
        Boolean isContinue = true;
        while (isContinue){
            inMenu();
            int option;
            System.out.print("Nhap lua chon: ");
            option = sc.nextInt();
            switch (option){
                case 1: {
                    printArray(numbers);
                    break;
                }
                case 2: {
                    System.out.println("Tong cua mang vua nhap la: "+ sumOfArray(numbers));
                    break;
                }
                case 3:{
                    System.out.println("Min cua mang la: "+findMin(numbers));
                    break;
                }
                case 4:{
                    System.out.println("Max cua mang la: "+  findMax(numbers));
                    break;
                }
                case 5:{
                    System.out.println("So phan tu chan cua mang la: "+countEvenNumbers(numbers));
                    break;
                }
                case 6:{
                    System.out.println("So phan tu le cua mang la: "+countOddNubers(numbers));
                    break;
                }
                case 7:{
                    isContinue = false;
                    System.out.println("Exit the program");
                    break;
                }
                default:{
                    System.out.println("Lua chon khong hop le. Vui long nhap lai !!! ");
                    break;
                }
            }
        }
    }

    private static int countOddNubers(int[] numbers) {
        int count  = 0;
        for (int i = 0; i<numbers.length;i++){
            if(numbers[i] % 2 != 0){
                count++;
            }
        }
        return count;
    }

    private static int countEvenNumbers(int[] numbers) {
        int count  = 0;
        for (int i = 0; i<numbers.length;i++){
            if(numbers[i] % 2 == 0){
                count++;
            }
        }
        return count;
    }

    private static int findMax(int[] numbers) {
        int max = numbers[0];
        for(int i = 1;i<numbers.length;i++){
            if(max < numbers[i]){
                max = numbers[i];
            }
        }
        return max;
    }

    private static int findMin(int[] numbers) {
        int min = numbers[0];
        for(int i = 1;i<numbers.length;i++){
            if(min > numbers[i]){
                min = numbers[i];
            }
        }
        return min;
    }

    private static int sumOfArray(int[] numbers) {
        int sum = 0;
        for (int i = 0; i<numbers.length;i++){
            sum+=numbers[i];
        }
        return sum;
    }

    private static void printArray(int[] numbers) {
        System.out.print("Mang vua nhap la: ");
        for (int i = 0;i<numbers.length;i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.print("\n");
    }

    private static void inMenu() {
        System.out.println("=== MENU ===");
        System.out.println("Option 1: In ra cac phan tu mang");
        System.out.println("Option 2: Tinh tong cac phan tu mang");
        System.out.println("Option 3: Tim phan tu nho nhat");
        System.out.println("Option 4: Tim phan tu lon nhat");
        System.out.println("Option 5: Dem so phan tu chan");
        System.out.println("Option 6: Dem so phan tu le");
        System.out.println("Option 7: Thoat");
    }

}
