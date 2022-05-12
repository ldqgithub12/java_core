public class Main {
    public static void main(String[] args) {
        int a = 5;
        double b = 5.65;

        // Chuyển đổi thành wrapper objects tương ứng
        Integer aObj = Integer.valueOf(a);
        Double bObj = Double.valueOf(b);

        if(aObj instanceof Integer) {
            System.out.println("Mot object thuoc Integer da duoc tao.");
        }

        if(bObj instanceof Double) {
            System.out.println("Mot object thuoc Double da duoc tao.");
        }
    }
}
