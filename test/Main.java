import java.time.LocalDate;

public class Main {
    public static void main (String... args) throws Person.InvalidDNIException {
        Person alex = new Person("Alex", "Andreba", "12345678A", LocalDate.of(2020, 1, 31));
        System.out.println(alex);
    }
}