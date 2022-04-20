public class Method {
    public static void printName()
    {
        System.out.println("Xin chao Le Dang Quang");
    }
    public static  void printName(String name)
    {
        System.out.println("Xin chao "+name);
    }
    public static int tinhTong(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        printName();
        printName("Le");
        System.out.println(tinhTong(6,9));
    }
}
