import java.util.ArrayList;
import java.util.Arrays;

public class Method_arraylist {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Quang");
        names.add("Quy");
        names.add(("Thanh"));
        System.out.println(Arrays.toString(names.toArray()));
        names.add(1,"Thang");
        System.out.println(Arrays.toString(names.toArray()));

        names.remove(0);
        System.out.println(Arrays.toString(names.toArray()));

        names.remove("Thanh");
        System.out.println(Arrays.toString(names.toArray()));

        ArrayList<String> namesOther = new ArrayList<>();
        names.add("Quang2");
        names.add("Quy2");
        names.add(("Thanh2"));

        names.addAll(namesOther);
        System.out.println(Arrays.toString(names.toArray()));

        //Kiểm tra 1 phần tử có trong arraylist k
        System.out.println(names.contains("Quang2"));
        names.retainAll(namesOther);
        System.out.println(Arrays.toString(names.toArray()));
    }
}
