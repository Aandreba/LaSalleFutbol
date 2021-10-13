/**
 * A class containing basic Stadium information
 * @author Miquel Lopez
 * @version 1.0
 */
public class Stadium {
    final public Club owner;
    final public int maxCapacity;
    final public String name;

    /**
     *{@link Stadium} base constructor
     * @param owner Owner of stadium
     * @param maxCapacity Maximum stadium capacity
     * @param name Name of the stadium
     */
    public Stadium(Club owner, int maxCapacity, String name) {
        this.owner = owner;
        this.maxCapacity = maxCapacity;
        this.name = name;
    }

    /**
     * Retrieves name of stadium owner
     * @return owner of stadium
     */
    public Club getOwner() {
        return owner;
    }

    /**
     * Retrieves maximum capacity of stadium
     * @return maximum stadium capacity
     */
    public int getMaxCapacity() {
        return maxCapacity;
    }

    /**
     * Retrieves name of stadium
     * @return name's stadium
     */
    public String getName() {
        return name;
    }

    /**
     * Override of Stadium
     * @return print Stadium
     */
    @Override
    public String toString() {
        return "Stadium{" +
                "owner=" + owner +
                ", maxCapacity=" + maxCapacity +
                ", name='" + name + '\'' +
                '}';
    }
}
