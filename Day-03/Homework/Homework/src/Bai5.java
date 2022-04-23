public class Bai5 {
    public static void main(String[] args) {
        System.out.printf("The tich khoi cau la: %.3f",tinhTheTich(3));
    }

    private static double tinhTheTich(double v) {
        int r = 1;
        for (int index = 0; index<3;index++){
            r *=v;
        }
        return (4*Math.PI*r)/3;
    }
}
