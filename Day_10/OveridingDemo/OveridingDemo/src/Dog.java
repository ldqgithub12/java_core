public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("Dog eat bones");
    }

    @Override
    public void sound() {
        System.out.println("Dog sound go go");
    }
    public void sleep(){
        System.out.println("Dog sleep ... ");
    }
}
