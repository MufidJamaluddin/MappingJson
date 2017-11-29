package id.ac.polban.jtk.mufid.GmapsModel;

/**
 *
 * @author mufidjamaluddin
 */
public class Steps 
{
    private Distance distance;
    private Duration duration;
    private Location end_location;
    private String html_instructions;
    private String maneuver;
    private Polyline polyline;
    private Location start_location;
    private String travel_mode;

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
     * @return the html_instructions
     */
    public String getHtml_instructions() {
        return html_instructions;
    }

    /**
     * @param html_instructions the html_instructions to set
     */
    public void setHtml_instructions(String html_instructions) {
        this.html_instructions = html_instructions;
    }

    /**
     * @return the polyline
     */
    public Polyline getPolyline() {
        return polyline;
    }

    /**
     * @param polyline the polyline to set
     */
    public void setPolyline(Polyline polyline) {
        this.polyline = polyline;
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
     * @return the travel_mode
     */
    public String getTravel_mode() {
        return travel_mode;
    }

    /**
     * @param travel_mode the travel_mode to set
     */
    public void setTravel_mode(String travel_mode) {
        this.travel_mode = travel_mode;
    }

    /**
     * @return the maneuver
     */
    public String getManeuver() {
        return maneuver;
    }

    /**
     * @param maneuver the maneuver to set
     */
    public void setManeuver(String maneuver) {
        this.maneuver = maneuver;
    }

}