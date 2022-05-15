import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal();
//        Dog dog = new Dog();
//        Cat cat = new Cat();
//        animal.sound();
//        animal.eat();
//        dog.sound();
//        dog.eat();
//        cat.sound();
//        cat.play();

//          Upcasting
//        Animal animal = new Dog();
//        animal.eat();
//        animal.sound();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Cat());
        for (Animal animal: animals
             ) {
            animal.eat();
            animal.sound();
        }
    }
}
