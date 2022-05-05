public class bai2 {
    public static void main(String[] args) {
        countLetters("Le o dang don   quang");
    }

    private static void countLetters(String inputString) {
        char[] chars = inputString.toCharArray();
        int count = 0;
        int numberOfO=0;
        for (int i = 0; i< inputString.length();i++){
            if(chars[i] ==' ' && chars[i+1] !=' '){
                count++;
            }
            if(chars[i] =='o'){
                numberOfO++;
            }
        }
        System.out.println("Chuoi tren co so ky tu la: "+(count+1));
        System.out.println("So ky tu o la: "+numberOfO);
        System.out.println("Vi tri cua cac ky tu o la: ");
        for (int i = 0; i<inputString.length();i++){
            if (chars[i] =='o'){
                System.out.print(i+" ");
            }
        }


    }
}
