import javax.swing.*;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * A class containing basic Game information
 * @author Miquel Lopez
 * @version 1.0
 */
public class Game {
    final public ArrayList<Action> actions;
    final public LocalDateTime starts;
    private LocalDateTime ends;
    private Stadium stadium;
    final public Team teamA;
    final public Team teamB;
    final Team winner;
    private int spectators;

    /**
     * {@link Game} base constructor
     * @param actions action's sets
     * @param starts date of game starts
     * @param ends date of game ends
     * @param stadium stadium's name
     * @param teamA local team's name
     * @param teamB visitor team's name
     * @param spectators spectator's number
     */
    public Game(ArrayList<Action> actions, LocalDateTime starts, LocalDateTime ends, Stadium stadium, Team teamA, Team teamB, int spectators) {
        this.actions = actions;
        this.starts = starts;
        this.ends = ends;
        this.stadium = stadium;
        this.teamA = teamA;
        this.teamB = teamB;
        this.winner = null;
        this.spectators = spectators;
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
}
