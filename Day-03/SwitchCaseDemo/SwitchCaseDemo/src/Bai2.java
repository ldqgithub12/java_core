import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        int season;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the season(number): ");
        season = sc.nextInt();
        switch (season){
            case 1:
            case 2:
            case 3:{
                System.out.println("This is Spring");
                break;
            }
            case 4:
            case 5:
            case 6:{
                System.out.println("This is Summer");
                break;
            }
            case 7:
            case 8:
            case 9:{
                System.out.println("This is Fall");
                break;
            }
            case 10:
            case 11:
            case 12:{
                System.out.println("Winter is coming");
                break;
            }
            default:{
                System.out.println("WTF bro ?? :D ??. Are you lag");
            }

        }
    }
}
