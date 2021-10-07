import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Person {
    final public String firstName, lastName, dni;
    final public LocalDate birthDate;

    public Person (String firstName, String lastName, String dni, LocalDate birthDate) throws InvalidDNIException {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;

        if (!checkDni(dni)) {
            throw new InvalidDNIException(dni);
        }

        this.dni = dni;
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

    // STATIC
    final private static char[] dniChars = new char[] {
            't', 'r', 'w', 'a',
            'g', 'm', 'y', 'f',
            'p', 'd', 'x', 'b',
            'n', 'j', 'z', 's',
            'q', 'v', 'h', 'l',
            'c', 'k', 'e'
    };

    private static boolean checkDni (String dni) {
        if (dni.length() != 9) {
            return false;
        }

        String digits = dni.substring(0, 8);
        char letter = dni.charAt(8);
        int val;

        try {
            val = Integer.parseInt(digits);
        } catch (Exception e) {
            return false;
        }

        return Character.toLowerCase(letter) == dniChars[val % 23];
    }

    // EXCEPTIONS
    public static class InvalidDNIException extends Exception {
        public InvalidDNIException (String message) {
            super(message);
        }
    }
}
