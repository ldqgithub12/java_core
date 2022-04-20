public class BaiVN {
    public static void main(String[] args) {
        int a = 5, b= 6;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(b-a);
        System.out.println(a*b);
        System.out.println((float)a/b);
        System.out.println((float)b/a);
        System.out.println("Calculate BMI");
        System.out.println("My BMI: "+calculateBMI(75,1.8));
    }
    public static float calculateBMI(float weight, double height)
    {
        return (float) (weight/Math.pow(height,2));
    }
}
