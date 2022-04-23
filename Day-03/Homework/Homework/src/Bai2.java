public class Bai2 {
    public static void main(String[] args) {
        repeatString("Quang");
    }

    private static void repeatString(String inputString) {
        for(int i=1;i<=10;i++){
            if(i ==1){
                System.out.print(inputString);
            }
            else System.out.print("-"+inputString);
        }
    }
}
