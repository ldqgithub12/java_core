public class Bai3 {
    public static void main(String[] args) {
        System.out.println(repeatString("Quang",5));
    }

    private static String repeatString(String inputString, int lengthOfString) {
        String outputResult="";
        for(int i=0; i<lengthOfString;i++){
            if(i==0){
                outputResult += inputString;
            }
            else outputResult += "-"+inputString;
        }
        return outputResult;
    }
}
