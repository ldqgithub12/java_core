public class bai4 {
    public static void main(String[] args) {
        int i =0;
        int count = 0;
        System.out.println("10 so nguyen to dau tien la: ");
        while (count <10){
            if(isPrimeNumber(i)){
                System.out.print(i+" ");
                count++;
            }
            i++;
        }
        System.out.println();
        System.out.println("Cac so nguyen to nho hon 10 la");
        for (int k =0; k<10;k++){
            if (isPrimeNumber(k)){
                System.out.print(k+" ");
            }
        }
    }

    private static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
