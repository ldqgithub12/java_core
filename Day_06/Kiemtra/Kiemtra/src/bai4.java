public class bai4 {
    public static void main(String[] args) {
        int i =0;
        int count = 0;
        while (count <10){
            if(isPrimeNumber(i)){
                System.out.print(i+" ");
                count++;
            }
            i++;
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
