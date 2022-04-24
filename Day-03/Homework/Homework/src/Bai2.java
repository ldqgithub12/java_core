public class Bai2 {
    public static void main(String[] args) {
        System.out.println(repeatString("Quang"));
    }

    private static String repeatString(String inputString) {
        String outputResult="";
        for(int i=1;i<=10;i++){
            if(i ==1){
                outputResult += inputString;
            }
            else outputResult += "-"+inputString;
        }
        return outputResult;
    }
}
