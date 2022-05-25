import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MyClass<T> {
    private T obj;
    //Method generic
    public void demoMethod(T data){
        System.out.println("Demo method Generic");
        System.out.println("Data: "+data);
    }
    public <U extends Number> void demoMethod1(U data){
        System.out.println("Demo method Generic");
        System.out.println("Data: "+data);
    }

    public static void main(String[] args) {
        MyClass<Integer> myClass = new  MyClass<>(10);
        System.out.println(myClass.getObj());
        myClass.demoMethod(20);

        MyClass<String> myClass1 = new MyClass<>("Kieu String");
        System.out.println(myClass1.getObj());

        MyClass<? extends Number> myClass2 = new MyClass<>(10.5);
        System.out.println(myClass2.getObj());
        myClass2.demoMethod1(1_000_000);

        MyClass<Student> myClass3 = new MyClass<>(new Student("Quang",22));
        System.out.println(myClass3.getObj());
    }

}
