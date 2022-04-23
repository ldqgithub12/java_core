public class Bai4 {
    public static void main(String[] args) {
        System.out.println(sumOfFive());
    }

    private static int sumOfFive() {
        int sum = 0;
        for (int index = 0;index<100;index++){
            if(index % 5 == 0){
                sum+=index;
            }
        }
        return sum;
    }
}
