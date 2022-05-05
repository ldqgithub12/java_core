import java.util.Scanner;

public class Bai4 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("Nhap so muon kiem tra: ");
        int numCheck = sc.nextInt();
        System.out.println("So "+numCheck+" ton tai trong mang: "+checkNumber(arr,numCheck));
    }

    private static boolean checkNumber(int[] arr, int numCheck) {
        for (int i =0;i<arr.length;i++){
            if(arr[i] == numCheck){
                return true;
            }
        }
        return false;
    }
}
