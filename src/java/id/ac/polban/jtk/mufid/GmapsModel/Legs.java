package id.ac.polban.jtk.mufid.GmapsModel;

import java.util.List;

/**
 *
 * @author mufidjamaluddin
 */
public class Legs 
{
    private Distance distance;
    private Duration duration;
    private String end_address;
    private Location end_location;
    private String start_address;
    private Location start_location;
    private List<Steps> steps;
    private List<String> traffict_speed_entry;
    private List<String> via_waypoint;

    /**
     * @return the distance
     */
    public Distance getDistance() {
        return distance;
    }

    /**
     * @param distance the distance to set
     */
    public void setDistance(Distance distance) {
        this.distance = distance;
    }

    /**
     * @return the duration
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    /**
     * @return the end_address
     */
    public String getEnd_address() {
        return end_address;
    }

    /**
     * @param end_address the end_address to set
     */
    public void setEnd_address(String end_address) {
        this.end_address = end_address;
    }

    /**
     * @return the end_location
     */
    public Location getEnd_location() {
        return end_location;
    }

    /**
     * @param end_location the end_location to set
     */
    public void setEnd_location(Location end_location) {
        this.end_location = end_location;
    }

    /**
     * @return the start_address
     */
    public String getStart_address() {
        return start_address;
    }

    /**
     * @param start_address the start_address to set
     */
    public void setStart_address(String start_address) {
        this.start_address = start_address;
    }

    /**
     * @return the start_location
     */
    public Location getStart_location() {
        return start_location;
    }

    /**
     * @param start_location the start_location to set
     */
    public void setStart_location(Location start_location) {
        this.start_location = start_location;
    }

    /**
     * @return the steps
     */
    public List<Steps> getSteps() {
        return steps;
    }

    /**
     * @param steps the steps to set
     */
    public void setSteps(List<Steps> steps) {
        this.steps = steps;
    }

    /**
     * @return the traffict_speed_entry
     */
    public List<String> getTraffict_speed_entry() {
        return traffict_speed_entry;
    }

    /**
     * @param traffict_speed_entry the traffict_speed_entry to set
     */
    public void setTraffict_speed_entry(List<String> traffict_speed_entry) {
        this.traffict_speed_entry = traffict_speed_entry;
    }

    /**
     * @return the via_waypoint
     */
    public List<String> getVia_waypoint() {
        return via_waypoint;
    }

    /**
     * @param via_waypoint the via_waypoint to set
     */
    public void setVia_waypoint(List<String> via_waypoint) {
        this.via_waypoint = via_waypoint;
    }

  
   
}