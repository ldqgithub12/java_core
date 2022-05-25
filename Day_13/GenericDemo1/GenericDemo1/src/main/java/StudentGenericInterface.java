import lombok.*;

import java.util.ArrayList;
import java.util.List;

interface StudentGeneric<T>{
    void add(T obj);
    void remove(T obj);
    void print();
}
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class StudentGenericInterface<T> implements StudentGeneric<T> {
    private List<Student> list;
    public static void main(String[] args) {
        StudentGenericInterface studentGenericInterface = new StudentGenericInterface(new ArrayList<>());
        Student st = new Student("Quang4",22);
        studentGenericInterface.add(new Student("Quang",22));
        studentGenericInterface.add(new Student("Quang1",22));
        studentGenericInterface.add(new Student("Quang2",22));
        studentGenericInterface.add(new Student("Quang3",22));
        studentGenericInterface.add(st);
        studentGenericInterface.print();

        studentGenericInterface.remove(st);
        studentGenericInterface.print();

    }

    @Override
    public void add(Object obj) {
        list.add((Student) obj);

    }

    @Override
    public void remove(Object obj) {
        list.remove(obj);
    }

    @Override
    public void print() {
        for (Object object:list){
            System.out.println(object);
        }

    }
}
