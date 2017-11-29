package id.ac.polban.jtk.mufid.GmapsModel;

import java.util.List;

/**
 *
 * @author mufidjamaluddin
 */
public class Geocoded_waypoints 
{
    private String geocoder_status;
    private String place_id;
    private List<String> types;

    /**
     * @return the geocoder_status
     */
    public String getGeocoder_status() {
        return geocoder_status;
    }

    /**
     * @param geocoder_status the geocoder_status to set
     */
    public void setGeocoder_status(String geocoder_status) {
        this.geocoder_status = geocoder_status;
    }

    /**
     * @return the place_id
     */
    public String getPlace_id() {
        return place_id;
    }

    /**
     * @param place_id the place_id to set
     */
    public void setPlace_id(String place_id) {
        this.place_id = place_id;
    }

    /**
     * @return the types
     */
    public List<String> getTypes() {
        return types;
    }

    /**
     * @param types the types to set
     */
    public void setTypes(List<String> types) {
        this.types = types;
    }

    
}