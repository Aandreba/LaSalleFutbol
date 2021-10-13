import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * A class containing basic Game information
 * @author Miquel Lopez
 * @version 1.0
 */
public class Game {
    public final ArrayList<Action> actions;
    public final LocalDateTime starts;
    private LocalDateTime ends;
    private Stadium stadium;
    public final Team teamA;
    public final Team teamB;
    public Team winner;
    private int spectators;

    /**
     * {@link Game} base constructor
     * @param starts date of game starts
     * @param stadium stadium's name
     * @param teamA local team's name
     * @param teamB visitor team's name
     */
    public Game(LocalDateTime starts, Stadium stadium, Team teamA, Team teamB) {
        this.actions = new ArrayList<>();
        this.starts = starts;
        this.stadium = stadium;
        this.teamA = teamA;
        this.teamB = teamB;
    }

    /**
     *Retrieves action's sets of game
     * @return action's sets
     */
    public ArrayList<Action> getActions() {
        return actions;
    }

    /**
     * Retrieve the start date of game
     * @return start date
     */
    public LocalDateTime getStarts() {
        return starts;
    }

    /**
     * Retrieve the end date of game
     * @return end date
     */
    public LocalDateTime getEnds() {
        return ends;
    }

    /**
     * Retrieve the stadium of game
     * @return staidum
     */
    public Stadium getStadium() {
        return stadium;
    }

    /**
     * Retrieve the local team of game
     * @return local team
     */
    public Team getTeamA() {
        return teamA;
    }

    /**
     * Retrieve the visitor team of game
     * @return visitor team
     */
    public Team getTeamB() {
        return teamB;
    }

    /**
     * Retrieve the winner of game
     * @return winner
     */
    public Team getWinner() {
        return winner;
    }

    /**
     * Retrieve the spectators of game
     * @return spectators
     */
    public int getSpectators() {
        return spectators;
    }

    public static Game startGame(LocalDateTime starts, Stadium stadium, Team teamA, Team teamB) {
        return new Game(starts, stadium, teamA, teamB);
    }

    public static Team whoWon(Game game) {
        int teamApoints = 0;
        int teamBpoints = 0;
        for (int i = 0; i < game.actions.size(); i++) {
            if (game.actions.get(i).getActionType() == ActionType.GOAL) {
                if (game.actions.get(i).getIssuer().equals(game.teamA)) {
                    teamApoints++;
                } else teamBpoints++;
            }
        }
        if (teamApoints == teamBpoints) return null;
        return (teamApoints > teamBpoints) ? game.teamA : game.teamB;
    }

}
