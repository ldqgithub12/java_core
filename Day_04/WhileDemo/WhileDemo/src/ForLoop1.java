public class ForLoop1 {
    public static void main(String[] args) {
        System.out.println("Chuoi tren la chuoi doi xung: "+ isDoiXung("acbbca"));
    }

    private static Boolean isDoiXung(String inputString) {
        String reverseString = "";
        for(int i = inputString.length()-1;i>=0;i--)
        {
            reverseString += inputString.charAt(i);
        }
        if(reverseString.equals(inputString)){
            return true;
        }
        else return false;

    }
}
