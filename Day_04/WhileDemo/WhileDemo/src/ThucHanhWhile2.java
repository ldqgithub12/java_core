import java.util.Random;
import java.util.Scanner;

public class ThucHanhWhile2 {
    public static void main(String[] args) {
        int randomNumber, userNumber;
        Random rd  = new Random();
        randomNumber = rd.nextInt(10);
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Con so gi day, so gi day : ");
            userNumber = sc.nextInt();
            if(randomNumber > userNumber){
                System.out.println("So nay nho hon roi, doan lai di !!! ");
            }
            else if(randomNumber < userNumber){
                System.out.println("So nay lon hon roi, doan lai di !!!");
            }
            else {
                System.out.println("Doan dung roi. Chuc mung !!!");
                break;
            }
        }
    }
}
