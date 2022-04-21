import java.time.LocalDate;

public class LocalDateDemo {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.getMonth().getValue());
        System.out.println(localDate.of(2000,01,30));
        System.out.println(localDate.getYear());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfWeek());
    }
}
