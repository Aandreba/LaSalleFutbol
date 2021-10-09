import java.time.LocalDate;

public class Player extends Person {
    final public Team team;
    final public Position position;

    public Player (String firstName, String lastName, String dni, LocalDate birthDate, boolean gender, int salary, Team team, Position position) throws InvalidDNIException {
        super(firstName, lastName, dni, birthDate, gender, salary);
        this.team = team;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Player {" +
                " firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dni='" + dni + '\'' +
                ", birthDate=" + birthDate +
                ", gender=" + gender +
                ", team=" + team +
                ", position=" + position +
                '}';
    }
}
