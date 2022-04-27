import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        String name = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        name.toUpperCase();
        char[] nameChar = name.toCharArray();
        for(int i=0;i<nameChar.length;i++)
        {
            nameChar[0] =  Character.toUpperCase(nameChar[0]);
            if(nameChar[i] == ' ' && nameChar[i+1] != ' '){
                nameChar[i+1] = Character.toUpperCase(nameChar[i+1]);
            }
        }
        System.out.print("Format String: ");
        for(int i=0;i<nameChar.length;i++)
        {
            System.out.print(nameChar[i]);
        }
    }
}
