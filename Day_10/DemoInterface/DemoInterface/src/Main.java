import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,6);
        Square square = new Square(4);
        System.out.println("Area: "+rectangle.getArea());
        System.out.println("Perimeter: "+rectangle.getPerimeter());
        rectangle.printInfo();
        System.out.println();

        ArrayList<IShape> list = new ArrayList<>();
        list.add(rectangle);
        list.add(new Rectangle(4,5));
        list.add(square);
        list.add(new Square(3));
        for (IShape iShape:list){
            System.out.println("Area: "+iShape.getArea());
            System.out.println("Perimeter: "+iShape.getPerimeter());
            iShape.printInfo();
            System.out.println();
        }

        ArrayList<IShape> newlist = new ArrayList<>();
        for (IShape iShape:list){
            if (iShape instanceof Rectangle){
                newlist.add(iShape);
            }
        }
        System.out.println("Sap xep hinh chu nhat theo dien tich tang dan");
        newlist.sort(new Comparator<IShape>() {
            @Override
            public int compare(IShape o1, IShape o2) {
                return (int) (o1.getArea()-o2.getArea());
            }
        });
        for (IShape i : newlist){
            i.printInfo();
            System.out.println(i.getArea());
        }
        IShape.display();
    }
}
