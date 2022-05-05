public class bai1b {
    public static void main(String[] args) {
        inTamGiac();
    }

    private static void inTamGiac() {
        for (int i = 1; i<=4; i++){
            for (int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
