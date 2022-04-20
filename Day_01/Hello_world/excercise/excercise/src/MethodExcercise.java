public class MethodExcercise {
    public static void main(String[] args) {
//        In ra chuỗi mà không có đối số
        sayHello();
//        In ra chuỗi bình thường
        sayHelloWithPara("Le Dang Quang");
//        In ra chuỗi với dấu ngoặc kép
        sayHelloWithSpePara("Le Dang Quang");
//        Tính tổng 2 số
        System.out.println( sum(6,7));
//        Tính bình phương 1 số
        System.out.println(powNumber(4));
//        Tính thế kỷ
        System.out.println("The ky: "+calCentury(1001));
    }

    private static int calCentury(int year) {
        if(year >0 && year <=100)
        {
            return 1;
        }
        int a = year /100;
        int b = year%100;
        if(b == 0){
            return a;
        }
        else  return a+1;
    }

    private static int powNumber(int a) {
        return (int) Math.pow(a,2);
    }

    private static int sum(int a, int b) {
        return a+b;
    }

    private static void sayHelloWithSpePara(String name) {
        System.out.println("Xin chao \""+name+"\"");
    }

    private static void sayHelloWithPara(String name) {
        System.out.println("Xin chao "+name);
    }

    private static void sayHello() {
        System.out.println("Xin chao Le Dang Quang");
    }
}
