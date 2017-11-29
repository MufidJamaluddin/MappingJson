package id.ac.polban.jtk.mufid.GmapsModel;

import java.util.List;

/**
 *
 * @author mufidjamaluddin
 */
public class Gmaps {

    private List<Geocoded_waypoints> geocoded_waypoints;
    private List<Routes> routes;
    private String status;

    /**
     * @return the geocoded_waypoints
     */
    public List<Geocoded_waypoints> getGeocoded_waypoints() {
        return geocoded_waypoints;
    }

    /**
     * @param geocoded_waypoints the geocoded_waypoints to set
     */
    public void setGeocoded_waypoints(List<Geocoded_waypoints> geocoded_waypoints) {
        this.geocoded_waypoints = geocoded_waypoints;
    }

    /**
     * @return the routes
     */
    public List<Routes> getRoutes() {
        return routes;
    }

    /**
     * @param routes the routes to set
     */
    public void setRoutes(List<Routes> routes) {
        this.routes = routes;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

  

}