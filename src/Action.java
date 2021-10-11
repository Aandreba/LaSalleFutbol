import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * Class action. Represents an in-game action that has happened at a certain time and has an issuer and a receiver.
 * author: Gerard Marquina Rubio
 */
public class Action {
    private final Action actionType;
    private final LocalDateTime happened;
    private final Object issuer;
    private final ArrayList<Object> receiver;

    /**
     * Consturctor.
     * @param actionType type of action.
     * @param happened time that the action has happened.
     * @param issuer issuer of the action.
     * @param receiver receiver(s) of the action.
     */
    public Action(Action actionType, LocalDateTime happened, Object issuer, ArrayList<Object> receiver) {
        this.actionType = actionType;
        this.happened = happened;
        this.issuer = issuer;
        this.receiver = receiver;
    }

    /**
     * Get action type as Enum.
     * @return enum action type.
     */
    public Action getActionType() {
        return actionType;
    }

    /**
     * Gets time of action happening.
     * @return happening as LocalDateTime.
     */
    public LocalDateTime getHappened() {
        return happened;
    }

    /**
     * Gets issuer of the action.
     * @return issuer as Object.
     */
    public Object getIssuer() {
        return issuer;
    }

    /**
     * Get list of receivers as Object.
     * @return gets receivers as ArrayList of Object.
     */
    public ArrayList<Object> getReceiver() {
        return receiver;
    }

}
