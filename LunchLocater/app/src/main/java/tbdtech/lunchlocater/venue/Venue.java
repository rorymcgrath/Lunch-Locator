package tbdtech.lunchlocater.venue;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by tliimfee on 7/26/2016.
 */
public class Venue
{

    private Location location;
    private String iconUrl;
    private String placeId;
    private String id;
    private String name;
    private double rating;
    private String reference;
    private String scope;
    private ArrayList<Photo> photos;
    private ArrayList<LocationType> types;
    private String vicinity;

    {
        photos = new ArrayList<>();
        types = new ArrayList<>();
    }

    public Venue(JSONObject venue) throws JSONException
    {
        JSONObject geo = venue.getJSONObject("geometry").getJSONObject("location");
        this.location = new Location(geo.getDouble("lat"),geo.getDouble("lng"));
        this.iconUrl = venue.getString("icon");
        this.id = venue.getString("id");
        this.name = venue.getString("name");
        this.placeId = venue.getString("place_id");
        this.rating = venue.getLong("rating");
        this.reference = venue.getString("reference");
        this.scope = venue.getString("scope");
        this.vicinity = venue.getString("vicinity");
    }

    public void setIconUrl(String url)
    {
        this.iconUrl = url;
    }

    public String getIconUrl()
    {
        return this.iconUrl;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setPlaceId(String placeId)
    {
        this.placeId = placeId;
    }

    public void setRating(double rating)
    {
        this.rating = rating;
    }

    public void setReference(String reference)
    {
        this.reference = reference;
    }

    public void setScope(String scope)
    {
        this.scope = scope;
    }

    public void addType(LocationType type)
    {
        this.types.add(type);
    }

    public ArrayList<LocationType> getTypes() {
        return types;
    }

    public void setTypes(ArrayList<LocationType> types) {
        this.types = types;
    }

    public Location getLocation()
    {
        return location;
    }

    public void setLocation(Location location)
    {
        this.location = location;
    }

    public String getPlaceId()
    {
        return placeId;
    }

    public String getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public double getRating()
    {
        return rating;
    }

    public String getReference()
    {
        return reference;
    }

    public String getScope()
    {
        return scope;
    }

    public ArrayList<Photo> getPhotos()
    {
        return photos;
    }

    public void setPhotos(ArrayList<Photo> photos)
    {
        this.photos = photos;
    }

    public String getVicinity()
    {
        return vicinity;
    }

    public void setVicinity(String vicinity)
    {
        this.vicinity = vicinity;
    }

}
