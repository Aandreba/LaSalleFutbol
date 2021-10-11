import java.util.ArrayList;
import java.util.Scanner;

public class Team {

    private String teamName;
    //private Arraylist <Player> players;
    private double budget;
    private int rankingPoints;
    private String category;

    /**
     * @param teamName
     * @param budget
     * @param rankingPoints
     * @param category
     */
    public Team(String teamName, double budget, int rankingPoints, String category) {

        this.teamName = teamName;
        // this.players =players ;
        this.budget = budget;
        this.rankingPoints = rankingPoints;
        this.category = category;
    }


    /**
     * Method that calculate the points in classification adding points depends the resolt
     *
     * @param a depending the result "win" 3 points, "draw 1 point "lose 0 points.
     */
    public void calcPoints(String a) {

        if (a.equals("win")) {
            this.rankingPoints += 3;
        } else if (a.equals("draw")) {
            this.rankingPoints += 1;
        } else {
            this.rankingPoints += 0;
        }
    }

    /**
     *
     * @return ArrayList from class Player different teams
     */
   /* public Arraylist <Player> players () {
        return this.players;
    }*/


    /**
     * @return budget from team
     */
    public double getBudget() {
        return budget;
    }

    /**
     * @return TReturn category in different
     */
    public String getCategory() {
        return category;
    }
}

/**
 * Main class to introduce update and create a new objects
 */
class Main {


private ArrayList<Team> teams;

    /**
     *
     * @param args This is the execution area
     */
    public static void main(String[] args) {
        Main main = new Main();
        main.init();
    }

    /**
     * Method where is code to exection area
     */
    private void init() {
        boolean exit = false;
        teams = new ArrayList<Team>();
        String teamName = null;

        //ArrayList<Player>
        double budget;
        int rankingPoints =0;
        String category =null;


        do {
            int num = readInt("Insert team name\n [1] La Salle junior A \n [2] La Salle senior A\n [3] La Salle  women\n", 1, 3);
            switch (num){
                case 1:
                    teamName = "La Salle Junior A";
                    break;
                case 2:
                    teamName = "La Salle senior A";
                    break;
                case 3:
                    teamName = "La Salle women";
                    break;
                default:
                    exit=false;
            }
        }while (!exit);

        budget = readDouble("Enter team budget", 1,10000000);

        do {
            int num2 = readInt ("Select choise\n [1] Premieer league \n [2] Second league\n [3] women league\n",1,3);
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
                    exit=false;
            }

        }while(!exit);

        teams.add(new Team(teamName, budget, rankingPoints, category));




    }

    /**
     *
     * @param mensaje This is the message that user read before introduce information
     * @param min minimum value that user introduce in
     * @param max maximum value that user introduce in
     * @return After some checks return the value introduce by user
     */
    private int readInt(String mensaje, int min, int max){

        Scanner input = new Scanner(System.in);
        boolean exit = false;
        int a = 0;

        do {
            System.out.println(mensaje);
            if (input.hasNextInt()) {
                a = input.nextInt();
                input.nextLine();
                if (a>=min && a<=max) {
                    exit = true;
                }

            } else {
                input.nextLine();
                System.out.println("Error");
            }
        }while(!exit);

        return a;
    }

    /**
     *
     * @param mensaje This is the message that user read before introduce information
     * @param min minimum value that user introduce in
     * @param max maximum value that user introduce in
     * @return After some checks return the value introduce by user
     */
    private double readDouble(String mensaje, int min, int max) {

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
