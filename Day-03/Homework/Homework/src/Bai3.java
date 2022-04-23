public class Bai3 {
    public static void main(String[] args) {
        repeatString("Quang",5);
    }

    private static void repeatString(String inputString, int lengthOfString) {
        for(int i=0; i<lengthOfString;i++){
            if(i==0){
                System.out.print(inputString);
            }
            else System.out.print("-"+inputString);
        }
    }
}
