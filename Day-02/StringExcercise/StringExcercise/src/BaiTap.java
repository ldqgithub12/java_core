import java.util.Scanner;

public class BaiTap {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi: ");
        str = sc.nextLine();
        System.out.println("Chuoi in hoa cua chuoi "+str+" la: "+str.toUpperCase());
        System.out.println("Chuoi in thuong cua chuoi "+str+" la: "+str.toLowerCase());
        System.out.println("So ky tu của chuoi "+str+" la: "+str.length());
        System.out.println("Ky tu cuoi cung trong chuoi "+str+" la: "+str.charAt(str.length()-1));
        System.out.println("5 ky tu dau của chuoi \""+str+"\" la: "+str.substring(0,6));
        System.out.println("Chuoi \""+str+"\" co chua chuoi \"hello\" hay khong: "+str.contains("hello"));
    }
}
