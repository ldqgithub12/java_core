package OptionalDemo;

import java.util.Optional;

public class DemoOptional {
    public static void main(String[] args) {
//        Tạo đối tượng Optional
//        Tạo optional rỗng
        Optional<String> optionalEmpty = Optional.empty();
        System.out.println(optionalEmpty);

//        Tạo optional có giá trị khác null;
        Optional<String> stringOptional = Optional.of("Hello");
        System.out.println(stringOptional);
//        Tạo giá trị cụ thể
        Optional<Integer> integerOptional = Optional.ofNullable(1);
        Optional<Integer> integerOptional1 = Optional.ofNullable(null);
        System.out.println(integerOptional);
        System.out.println(integerOptional1);

    }
}
