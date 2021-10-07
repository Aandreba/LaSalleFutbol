public class Referee  {

    private static char takeDecision;


    /**
     * Method: showingCard
     * This method is showing the referee decision to the player.
     * If Referee take decision (Y) it's means Yellow Card and it's a warning.
     * If he is showing (R) it's means Red Card and it's  a Error.
     */

    public static  void showingCard(){
        if (takeDecision ==  'Y') {
            System.out.println("WARNING: It's a warning for a Player.");
        } else if (takeDecision == 'R') {
            System.out.println("The Player has to go from Game.");
        }
    }


    public static void setTakeDecision(char takeDecision) {
        Referee.takeDecision = takeDecision;
    }
}

