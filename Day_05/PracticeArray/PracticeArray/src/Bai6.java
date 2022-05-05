import com.sun.jdi.FloatType;

import java.util.Arrays;
import java.util.Scanner;

public class Bai6 {
    public  static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        float[] outPut = randomRGB();
        System.out.print("RGB( ");
        for (int i = 0;i<outPut.length;i++){
            System.out.print(outPut[i]+" ");
        }
        System.out.println(") ");
    }
    public static float[] randomRGB(){
        float[] colors = new float[3];
        for (int i = 0;i<3;i++){
            colors[i] = (float) Math.random()*256;
        }
        return colors;
    }
}
