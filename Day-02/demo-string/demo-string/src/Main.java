import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String name = "Le Dang Quang";
        String name1 = "Le Dang Quang";
        String name2 = new String("Ho Huu Quang");
        String name3 = new String("Le Dang Quang");
        System.out.println(name);
        System.out.println(name2);
//        So sánh về mặt địa chỉ ô nhớ
        System.out.println(name==name1);
        System.out.println(name==name3);
//        So sánh về mặt ký tự
        System.out.println(name.equals(name1));
        System.out.println(name.equals(name3));

        String text = "Xin chao moi nguoi, lai la Chao day";
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
        System.out.println(text.charAt(26));
        System.out.println(text.length());
        System.out.println(text.substring(27,29));
        System.out.println(text.substring((26)));
//        Kiểm tra xem từ "lai" có trong text hay không, kiểm tra từ vị trí số 2
        System.out.println(text.indexOf("lai",2));
        System.out.println(text.contains("Quang"));
        String le = "   LeLe    ";
        System.out.println(le);
        System.out.println(le.trim());
    }
}
