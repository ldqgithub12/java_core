import java.util.Scanner;

public class Bai2 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String str = "";
        System.out.print("Nhap chuoi bat ky: ");
        str = sc.nextLine();
        System.out.println("Repeat the string 10 times");
        String[] outputString = repeatString(str);
        for (int i=0;i<outputString.length;i++){
            System.out.print(outputString[i]);
        }
    }

    private static String[] repeatString(String str) {
        String[] strArray = new String[10];
        for (int i = 0;i<10;i++)
        {
            strArray[i] = str;
        }
        return  strArray;
    }
}
