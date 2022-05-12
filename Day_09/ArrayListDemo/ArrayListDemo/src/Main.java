import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        //in
        //Cách 1;
        for (int i = 0; i<numbers.size();i++){
            System.out.print(numbers.get(i)+"\t");
        }
        System.out.println();
//        Cách 2: Dùng foreach
        for (int i : numbers){
            System.out.print(i+"\t");
        }
        System.out.println();
//        Cách 3: Dùng interator
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+"\t");
        }
        System.out.println();
//        Cách 4: List iterator
        ListIterator<Integer> listIterator = numbers.listIterator();
        while (listIterator.hasNext()){
            System.out.print(listIterator.next()+"\t");
        }
        System.out.println();
//        Lambda
        numbers.forEach(i-> System.out.println(i));
    }
}
