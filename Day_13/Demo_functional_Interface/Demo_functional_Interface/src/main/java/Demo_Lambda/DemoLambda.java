package Demo_Lambda;

@FunctionalInterface
interface Hello{
    void sayHello(String name);
}
public class DemoLambda {
    public static void main(String[] args) {
        Hello h = (name) -> {
            System.out.println("Xin chao cac ban "+name);
        };
        h.sayHello("Quang");

    }
}
