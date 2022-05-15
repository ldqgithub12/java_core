public class Square implements IShape {
    private int size;

    public Square() {
    }

    public Square(int size) {
        this.size = size;
    }

    @Override
    public double getArea() {
        return size*size;
    }

    @Override
    public double getPerimeter() {
        return size*4;
    }

    @Override
    public void printInfo() {
        System.out.println("Size: "+size);
    }
}
