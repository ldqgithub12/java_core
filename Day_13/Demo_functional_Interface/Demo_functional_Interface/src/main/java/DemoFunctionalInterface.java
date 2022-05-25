@FunctionalInterface
interface Greeting{
    void sayHello(String name);
}
public class DemoFunctionalInterface implements Greeting {
    @Override
    public void sayHello(String name) {
        System.out.println("Xin chao "+name);
    }

    public static void main(String[] args) {
        Greeting g = new DemoFunctionalInterface();
//        Cách 1
        g.sayHello("Quang");
//        Sử dụng anonymous class
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello(String name) {
                System.out.println("Xin chao "+name);
            }
        };
        greeting.sayHello("Quang2");
    }
}
