import java.io.IOException;

public class DemoThrowsAndThrow {
    public static void validateAge(int age){
        if (age<18) {
            throw new ArithmeticException("Khong du tuoi tham gia nghia vu quan su");
        }
        else System.out.println("Đủ tuổi đi nghĩa vụ");
    }
    public static void demo() throws IOException {
        throw new IOException("File not found");
    }
    public static void main(String[] args) {
        validateAge(20);
        validateAge(16);
    }
}
