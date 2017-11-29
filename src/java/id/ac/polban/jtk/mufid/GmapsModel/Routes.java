package id.ac.polban.jtk.mufid.GmapsModel;

import java.util.List;

/**
 *
 * @author mufidjamaluddin
 */
public class Routes 
{

    private Bounds bounds;
    private String copyrights;
    private List<Legs> legs;
    private Overview_polyline overview_polyline;
    private String summary;
    private List<String> warnings;
    private List<String> waypoint_order;

    /**
     * @return the bounds
     */
    public Bounds getBounds() {
        return bounds;
    }

    /**
     * @param bounds the bounds to set
     */
    public void setBounds(Bounds bounds) {
        this.bounds = bounds;
    }

    /**
     * @return the copyright
     */
    public String getCopyrights() {
        return copyrights;
    }

    /**
     * @param copyright the copyright to set
     */
    public void setCopyrights(String copyrights) {
        this.copyrights = copyrights;
    }

    /**
     * @return the legs
     */
    public List<Legs> getLegs() {
        return legs;
    }

    /**
     * @param legs the legs to set
     */
    public void setLegs(List<Legs> legs) {
        this.legs = legs;
    }

    /**
     * @return the overview_polyline
     */
    public Overview_polyline getOverview_polyline() {
        return overview_polyline;
    }

    /**
     * @param overview_polyline the overview_polyline to set
     */
    public void setOverview_polyline(Overview_polyline overview_polyline) {
        this.overview_polyline = overview_polyline;
    }

    /**
     * @return the summary
     */
    public String getSummary() {
        return summary;
    }

    /**
     * @param summary the summary to set
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * @return the warnings
     */
    public List<String> getWarnings() {
        return warnings;
    }

    /**
     * @param warnings the warnings to set
     */
    public void setWarnings(List<String> warnings) {
        this.warnings = warnings;
    }

    /**
     * @return the waypoint_order
     */
    public List<String> getWaypoint_order() {
        return waypoint_order;
    }

    /**
     * @param waypoint_order the waypoint_order to set
     */
    public void setWaypoint_order(List<String> waypoint_order) {
        this.waypoint_order = waypoint_order;
    }

 
}
