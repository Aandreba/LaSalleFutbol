import java.util.ArrayList;

public class Game {
    final public Team TEAMA;
    private int teamAGoals;
    final public Team TEAMB;
    private int teamBGoals;
    final public Referee REFEREE;
    private String winner;
    private ArrayList<Person> numberSpectators;

    /**
     * Constructor
     * @param teamA Local team
     * @param teamB Visitor team
     * @param referee Name of referee
     * @param numberSpectators Number of spectators
     */
    public Game(Team teamA, Team teamB, Referee referee, ArrayList<Person> numberSpectators) {
        this.TEAMA = teamA;
        this.teamAGoals = 0;
        this.TEAMB = teamB;
        this.teamBGoals = 0;
        this.REFEREE = referee;
        this.numberSpectators = numberSpectators;
    }

    /*public int doGoal(Team team){
        if (){
            return this.temAGoals++;
        } else {
            return this.temBGoals++;
        }
    }*/


    /**
     * Compare goals of two team, and select winner
     */
    public void whoWin(){
        if(teamAGoals == teamBGoals){
            this.winner = "Draw";
        } else if(teamAGoals > teamBGoals){
            this.winner = "Team A win";
        } else {
            this.winner = "Team B win";
        }
    }
}
