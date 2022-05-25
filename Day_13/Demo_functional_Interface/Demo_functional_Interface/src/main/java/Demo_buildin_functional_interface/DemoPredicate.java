package Demo_buildin_functional_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class DemoPredicate {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("An");
        names.add("Vinh");
        names.add("Hoa");
//    Xóa 1 name tên An
        names.removeIf(name->name.equals("An"));
        names.forEach(System.out::println);

        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.equals("Vinh");
            }
        };
        names.removeIf(predicate);
        names.forEach(name->System.out.println(name));
    }
}
