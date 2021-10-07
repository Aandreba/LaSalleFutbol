import java.util.ArrayList;
import java.util.HashMap;

public class Club {
    private String name;
    private String acronym;
    private Person director;
    private String country;
    private String region;
    private String city;
    private HashMap<String, Team> teams = new HashMap<>();

    /**
     * Creates a club with given attributes.
     * @param name Name of the club. Example: "Futbol Club Barcelona".
     * @param acronym Acronym of the club. Example: "FCB".
     * @param director Director of the club. Example: Object(Person) = {"Pepito", "Perez", "Martinez", null...};
     * @param country Country of the club. Example: "Spain".
     * @param region Region of the club. Example: "Catalonia".
     * @param city City of the club. Example: "Barcelona".
     */
    public Club(String name, String acronym, Person director, String country, String region, String city) {
        this.name = name;
        this.acronym = acronym;
        this.director = director;
        this.country = country;
        this.region = region;
        this.city = city;
    }

    /**
     * Creates a club with given attributes. Acronym will be constructed from first three letters of name.
     * @param name Name of the club. Example: "Futbol Club Barcelona".
     * @param director Director of the club. Example: Object(Person) = {"Pepito", "Perez", "Martinez", null...};
     * @param country Country of the club. Example: "Spain".
     * @param region Region of the club. Example: "Catalonia".
     * @param city City of the club. Example: "Barcelona"
     */
    public Club(String name, Person director, String country, String region, String city) {
        this(name, name.substring(0, 2), director, country, region, city);
    }

    /**
     * Gets the name of the club as String.
     * @return name of the club as String.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the acronym of the club as String.
     * @return acronym of the club as String.
     */
    public String getAcronym() {
        return acronym;
    }

    /**
     * Gets director of the club as Object Person.
     * @return director of the club as Person.
     */
    public Person getDirector() {
        return director;
    }

    /**
     * Gets country of the club as String.
     * @return country of the club as String.
     */
    public String getCountry() {
        return country;
    }

    /**
     * Gets region of the club as String.
     * @return region of the club as String.
     */
    public String getRegion() {
        return region;
    }

    /**
     * Gets city of the club as String.
     * @return city of the club as String.
     */
    public String getCity() {
        return city;
    }

    /**
     * Gets team from passed key.
     * @param id id of the team as String.
     * @return object of class Team with key of the passed parameter.
     * @throws Exception if there is any error trying to get the Team.
     */
    public Team getTeam(String id) throws Exception {
        Team result = teams.get(id);
        if (result == null) throw new Exception("team with id does not exist");
        return result;
    }

    /**
     * Ads team with id.
     * @param team object of class Team.
     * @param id id of the team as String.
     * @throws Exception if there is any error adding the Team.
     */
    public void addTeam(Team team, String id) throws Exception {
        if (teams.containsKey(id)) throw new Exception("team with id already exists");
        teams.put(id, team);
    }

}
