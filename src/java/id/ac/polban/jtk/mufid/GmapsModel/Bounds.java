package id.ac.polban.jtk.mufid.GmapsModel;

/**
 *
 * @author mufidjamaluddin
 */
public class Bounds {

    private Location northeast;
    private Location southwest;

    /**
     * @return the northeast
     */
    public Location getNortheast() {
        return northeast;
    }

    /**
     * @param northeast the northeast to set
     */
    public void setNortheast(Location northeast) {
        this.northeast = northeast;
    }

    /**
     * @return the southwest
     */
    public Location getSouthwest() {
        return southwest;
    }

    /**
     * @param southwest the southwest to set
     */
    public void setSouthwest(Location southwest) {
        this.southwest = southwest;
    }


}