import lombok.*;

import java.util.ArrayList;
import java.util.List;

interface InterfaceGeneric<T extends Number>{
    void add(T obj);
    void remove(T obj);
    void print();
}
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GenericInterface <T extends Number> implements InterfaceGeneric {
    private List<T> list;


    @Override
    public void add(Number obj) {
        list.add((T) obj);
    }

    @Override
    public void remove(Number obj) {
        list.remove(obj);
    }

    @Override
    public void print() {
        for (T obj:list) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        GenericInterface<Integer> genericInterface = new GenericInterface<>(new ArrayList<>());
        genericInterface.add(1);
        genericInterface.add(2);
        genericInterface.add(3);
        genericInterface.add(4);
        genericInterface.print();
        genericInterface.remove(2);
        genericInterface.print();
    }
}

