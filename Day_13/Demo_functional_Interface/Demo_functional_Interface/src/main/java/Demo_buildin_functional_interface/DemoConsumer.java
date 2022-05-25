package Demo_buildin_functional_interface;

import java.util.List;
import java.util.function.Consumer;

import static java.lang.System.*;

public class DemoConsumer {
    public static void main(String[] args) {
        List<String> names = List.of("An","Vinh","Hoa");
        names.forEach(out::println);
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                out.println(s);
            }
        };
        names.forEach(consumer);
    }
}
