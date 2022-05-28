package OptionalDemo;

import java.util.Optional;

public class DemoOptionalMethod {
    public static void main(String[] args) {
        Optional<String> optionalEmpty = Optional.empty();
        System.out.println(optionalEmpty);

//        Tạo optional có giá trị khác null;
        Optional<String> stringOptional = Optional.of("Hello");
        System.out.println(stringOptional);
//        Một số phương thức
//        Phương thức get()-Lấy giá trị trong Optional;
//        isPresent và ifPresent kiểm tra optional có giá trị hay không;
        if (stringOptional.isPresent()){
            System.out.println("Gia tri la: "+stringOptional.get());
        }
        else {
            System.out.println("Khong co gia tri nao");
        }

        stringOptional.ifPresent(s-> System.out.println("Gia tri la: "+s));
        String value = stringOptional.orElse("Default value");
        System.out.println(value);
//        orElseThrow
//        Nếu có gái trị thì trả về giá trị còn ko thì trả về exception
        try {
            String value1 = optionalEmpty.orElseThrow(() -> {
                throw new RuntimeException("da co loi say ra");
            });
        }
        catch (RuntimeException e){
            e.printStackTrace();
        }

    }
}
