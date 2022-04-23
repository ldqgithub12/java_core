public class SwitchExemple {
    public static void main(String[] args) {
        int money = 15000;
        switch (money){
            case 12000:{
                System.out.println("Cà phê sữa");
                break;
            }
            case 10000:{
                System.out.println("Cà phê đá");
                break;
            }
            case 8000:{
                System.out.println("Sting");
                break;
            }
            case 5000:{
                System.out.println("Trà đá");
                break;
            }
            default:{
                System.out.println("Chịu, qua quán khác mà mua");
                break;
            }

        }
    }
}
