import java.util.Random;

public class DoWhileDemo {
    public static void main(String[] args) {
        Random rd = new Random();
        int number = 0;
        while (number <90){
            number = rd.nextInt(100);
            System.out.print(number + " ");
        }
    }
}
