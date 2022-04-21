import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        float width, length;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the width: ");
        width = sc.nextFloat();
        System.out.print("Enter the length: ");
        length = sc.nextFloat();

        System.out.println("Perimeter(Chu vi) : "+((width+length)*2));
        System.out.println("Area(Dien tich): "+(width*length));
    }
}
