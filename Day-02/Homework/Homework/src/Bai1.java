import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        float width, height;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the width: ");
        width = sc.nextFloat();
        System.out.print("Enter the height: ");
        height = sc.nextFloat();

        System.out.println("Perimeter(Chu vi) : "+((width+height)*2));
        System.out.println("Area(Dien tich): "+(width*height));
    }
}
