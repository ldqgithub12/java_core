public class Bai1 {
    public static void main(String[] args) {
        repeatString("Quang");
    }

    private static void repeatString(String inputString) {
        for (int index =0; index<10;index++){
            System.out.print(inputString);
        }
    }
}
