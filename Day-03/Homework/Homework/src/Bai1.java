public class Bai1 {
    public static void main(String[] args) {
        System.out.println(repeatString("Quang"));

    }

    private static String repeatString(String inputString) {
        String outputResult="";
        for (int index =0; index<10;index++){
             outputResult += inputString;
        }
        return outputResult;
    }
}
