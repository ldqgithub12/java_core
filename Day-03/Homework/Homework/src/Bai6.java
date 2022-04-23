public class Bai6 {
    public static void main(String[] args) {
        printArrayNumber();
    }

    private static void printArrayNumber() {
        for (int i = 1; i<=100;i++){
            if(i%3==0 && i%5!=0){
                System.out.print("Fizz ");
                continue;
            }
            else if(i%5==0 && i%3 !=0){
                System.out.print("Buzz ");
                continue;
            }
            else if(i%3==0 && i%5==0){
                System.out.print("FizzBuzz ");
                continue;
            }
            System.out.print(i+" ");
        }
    }
}
