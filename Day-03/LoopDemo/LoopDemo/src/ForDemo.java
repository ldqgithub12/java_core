import java.util.Random;
import java.util.Scanner;

public class ForDemo {
    public static void main(String[] args) {
//        int sum=0;
//        for (int i =0;i<20; i++)
//        {
//            sum+=10;
//            if(sum ==100)
//            {
//                System.out.println("Congratulate, you success your goal");
//                continue;
//            }
//            System.out.println("You have 10$ in bank");
//        }
//        Random n số ngẫu nhiên nhập từ bàn phím
        int n;
        Scanner sc = new Scanner(System.in);
        Random rd =new Random();
        System.out.println("Ban muon random bao nhieu so: ");
        n = sc.nextInt();
        for (int i = 0; i<n;i++)
        {
            int numberRandom = rd.nextInt(100);
            System.out.print(numberRandom+"\t");
        }
    }
}
