import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

/**
 * A class containing basic person information
 * @author Alex Andreba
 * @version 1.0
 */
public class Person {
    final public String firstName, lastName, dni;
    final public LocalDate birthDate;
    final public boolean gender;
    private int salary;

    /**
     * {@link Person} base constructor
     * @param firstName Person's first name
     * @param lastName Person's last name
     * @param dni Person's National Identity Document
     * @param birthDate Person's birthdate
     * @param gender Person's gender
     * @param salary Annual salary in euros
     * @throws InvalidDNIException if the dni passed is invalid
     */
    public Person (String firstName, String lastName, String dni, LocalDate birthDate, boolean gender, int salary) throws InvalidDNIException {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.salary = salary;

        if (!checkDni(dni)) {
            throw new InvalidDNIException(dni);
        }

        this.dni = dni;
    }

    public int getSalary () {
        return salary;
    }

    /**
     * Retrieves the full name of the person
     * @return The person's full name
     */
    public String getFullName () {
        return this.firstName + ' ' + this.lastName;
    }

    /**
     * Calculates person's age
     * @return Distance between {@link Person#birthDate} and {@link LocalDate#now()}
     * @see Period#between(LocalDate, LocalDate)
     */
    public Period getAge () {
        return Period.between(this.birthDate, LocalDate.now());
    }

    /**
     * Calculates person's age in years
     * @return Year distance between {@link Person#birthDate} and {@link LocalDate#now()}
     */
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

    /**
     * Checks if passed dni is valid
     * @param dni DNI to check
     * @return {@link Boolean#TRUE} if DNI is valie, {@link Boolean#FALSE} otherwise
     */
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
