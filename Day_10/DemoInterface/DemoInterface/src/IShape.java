public interface IShape {
    String name = "Shape";
    double getArea();
    double getPerimeter();
    void printInfo();

    //Static method
    static void display(){
        System.out.println("Hi, my name is "+name);
    };
    //Default
    default void getSide(){
        System.out.println("Shape have many size");
    }
}
