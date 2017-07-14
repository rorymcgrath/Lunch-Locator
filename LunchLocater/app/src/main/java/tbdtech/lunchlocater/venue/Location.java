package tbdtech.lunchlocater.venue;

import org.json.JSONObject;

/**
 * Created by tliimfee on 7/26/2016.
 */
public class Location
{

    private double lat;
    private double lng;

    public Location(double lat, double lng)
    {
        this.lat = lat;
        this.lng = lng;
    }

    public Location(JSONObject geometry)
    {
    }

    public double getLat()
    {
        return lat;
    }

    public double getLng()
    {
        return lng;
    }

    public void setLat(double lat)
    {
        this.lat = lat;
    }

    public void setLng(double lng)
    {
        this.lng = lng;
    }
}
