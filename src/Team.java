import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Team {

    private static  Club club;
    private final String name;
    private final String category;
    private static ArrayList<Player> players;
    private static  Person coach;


    /**
     * @param club
     * @param name
     * @param players
     * @param coach
     */
    public Team(Club club, String name,String category, List<Player> players, Person coach) {
        this.club = club;
        this.name = name;
        this.category = category;
        this.players = new ArrayList<Player>();
        this.coach = coach;
    }

    public static Club getClub() {
        return club;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public static ArrayList<Player> getPlayers() {
        return players;
    }

    public static Person getCoach() {
        return coach;
    }


    private static void init() {
        boolean exit = false;
        ArrayList<Team> teams = new ArrayList<Team>();
        String name = null;


        String category = null;


        do {
            int num = readInt("Insert team name\n [1] La Salle junior A \n [2] La Salle senior A\n [3] La Salle  women\n", 1, 3);
            switch (num) {
                case 1:
                    name = "La Salle Junior A";
                    break;
                case 2:
                    name = "La Salle senior A";
                    break;
                case 3:
                    name = "La Salle women";
                    break;
                default:
                    exit = false;
            }
        } while (!exit);


        do {
            int num2 = readInt("Select choise\n [1] Premieer league \n [2] Second league\n [3] women league\n", 1, 3);
            switch (num2) {
                case 1:
                    category = "Premiere league";
                    break;
                case 2:
                    category = "Second league";
                    break;
                case 3:
                    category = "Women league";
                    break;
                default:
                    exit = false;
            }


        } while (!exit);

        teams.add(new Team(getClub(), name, category, getPlayers(), getCoach()));
    }

        /**
         *
         * @param mensaje This is the message that user read before introduce information
         * @param min minimum value that user introduce in
         * @param max maximum value that user introduce in
         * @return After some checks return the value introduce by user
         */
        private static int readInt (String mensaje,int min, int max){

            Scanner input = new Scanner(System.in);
            boolean exit = false;
            int a = 0;

            do {
                System.out.println(mensaje);
                if (input.hasNextInt()) {
                    a = input.nextInt();
                    input.nextLine();
                    if (a >= min && a <= max) {
                        exit = true;
                    }

                } else {
                    input.nextLine();
                    System.out.println("Error");
                }
            } while (!exit);

            return a;
        }

        /**
         *
         * @param mensaje This is the message that user read before introduce information
         * @param min minimum value that user introduce in
         * @param max maximum value that user introduce in
         * @return After some checks return the value introduce by user
         */
        private double readDouble (String mensaje,int min, int max){

            Scanner input = new Scanner(System.in);
            boolean exit = false;
            double a = 0;

            do {
                System.out.println(mensaje);
                if (input.hasNextDouble()) {
                    a = input.nextDouble();
                    input.nextLine();
                    if (a >= min && a <= max) {
                        exit = true;
                    }

                } else {
                    input.nextLine();
                    System.out.println("Error");
                }
            } while (!exit);

            return a;
        }

}




