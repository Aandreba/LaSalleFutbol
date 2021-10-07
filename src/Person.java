import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Person {
    final public String firstName, lastName, dni;
    final public LocalDate birthDate;

    public Person (String firstName, String lastName, String dni, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dni = dni;
        this.birthDate = birthDate;
    }

    // METHODS
    public String getFullName () {
        return this.firstName + ' ' + this.lastName;
    }

    public Period getAge () {
        return Period.between(this.birthDate, LocalDate.now());
    }

    public int getYears () {
        return getAge().getYears();
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dni='" + dni + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
