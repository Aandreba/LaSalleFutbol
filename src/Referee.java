import java.time.LocalDate;

public class Referee extends Person {

    public  int numberOfFoul;

    /**
     * {@link Person} base constructor
     * @param firstName Person's first name
     * @param lastName  Person's last name
     * @param dni       Person's National Identity Document
     * @param birthDate Person's birthdate
     * @param gender    Person's gender
     * @param salary    Annual salary in euros
     * @throws InvalidDNIException if the dni passed is invalid
     */
    public Referee(String firstName, String lastName, String dni, LocalDate birthDate, boolean gender, int salary) throws InvalidDNIException {
        super(firstName, lastName, dni, birthDate, gender, salary);
    }

    /**
     * This Method is to show Warning to the Player.
     * It indicate that a player has been officially cautioned. But he  may continue the game.
     */
   public void giveYellowCard(){
        if(numberOfFoul <= 1){
            System.out.println("WARNING: A player can be out of the game. He has to be calm now while playing.");
            numberOfFoul++;
        }
   }

    /**
     * This Method is to shown by a referee to signify that a player must be sent off.
     */
   public void giveRedCard(){
        if (numberOfFoul == 2){
            System.out.println("A player who has been sent off is required to leave the field of play immediately.");
        }
   }


}

