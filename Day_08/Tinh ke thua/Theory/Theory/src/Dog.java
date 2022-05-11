public class Dog extends Animal{
    private int legs;

    public Dog() {
    }

    public Dog(String name, String color, int legs) {
        super(name, color);
        this.legs = legs;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "legs=" + legs +", name: "+super.getName()+", color: "+super.getColor()+
                '}';
    }
    @Override
    public void eat(){
        super.eat();
        System.out.println("shit");
    }


}
