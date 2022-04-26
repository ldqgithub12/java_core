import java.util.Scanner;

public class menuDemo {
    public static void main(String[] args) {
        boolean isContinue=true;
        Scanner sc = new Scanner(System.in);
        int option ;
        System.out.println("Enter the option: ");
        while (isContinue){
           inMenu();
            option = sc.nextInt();
            switch (option){
                case 1: {
                    System.out.println("Thuc hien case 1");
                    break;
                }
                case 2:{
                    System.out.println("Thuc hien case 2");
                    break;
                }
                case 3:{
                    isContinue = false;
                    System.out.println("Thoat khoi chuong trinh");
                    break;
                }
                default:{
                    System.out.println("Lua chon khong hop le");
                    break;
                }
            }

        }
    }

    private static void inMenu() {
        System.out.println("====== MENU ======");
        System.out.println("Option 1: In linh tinh");
        System.out.println("Option 2: In linh tinh pro vip");
        System.out.println("Option 3: Exit");
        System.out.print("Enter the option: ");
    }
}
