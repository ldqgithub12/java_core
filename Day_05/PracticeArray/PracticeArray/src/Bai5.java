import java.util.Random;

public class Bai5 {
    public static void main(String[] args) {
        String hexCode = randomHexcode();
        System.out.println(hexCode);
    }

    private static String randomHexcode() {
        Random rd = new Random();
        String[] letters = "0123456789abcdef".split("");
        String color ="#";
        for (int i=0;i<6;i++){
            color += letters[Math.round(rd.nextFloat()*15)];
        }
        return color;
    }
}
