public class Team extends Club{

   private int positionClasification;
   private int numberPlayers;
   private double budget;
   private int pointsClasification;
   private String category;


    public Team(int positionClasification, int numberPlayers, double budget, int pointsClasification, String category) {

        this.positionClasification = positionClasification;
        this.numberPlayers = numberPlayers;
        this.budget = budget;
        this.pointsClasification = pointsClasification;
        this.category = category;
    }
    public Team () {
        super ();
    }

    /**
     * Method that calculate the points in classification adding points depends the resolt
     * @param String  depending the result "win" 3 points, "draw 1 point "lose 0 points.
     */
    public void calcPoints (String a) {

        if (a,equals "win") {
            this.pointsClasification += 3;
        }else if (a.equals "draw") {
            this.pointsClasification += 1;
        }else {
            this.pointsClasification += 0;
        }
    }

    /**
     *
     * @return Return the position in classification
     */
    public int getPositionClasification() {
        return positionClasification;
    }

    /**
     *
     * @return Return buget from tem
     */
    public double getBudget() {
        return budget;
    }

    /**
     *
     * @return TReturn category in different
     */
    public String getCategory() {
        return category;
    }
}
