package Demo_buildin_functional_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class DemoFunction {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("An");
        names.add("Vinh");
        names.add("Hoa");

        Function<String,String> function = new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        };
        names.forEach(System.out::println);
        names.stream().map(function).forEach(s -> System.out.println(s));
    }
}
