public class Main {
    public static void main(String[] args) {
        Person person = Person.builder().withName("Quang").withAge(22).build();
        System.out.println(person);
        Person person1 = Person.builder().withMarried(false).withMail("ledangquang@gmail.com").build();
        System.out.println(person1);
    }
}
