package tbdtech.lunchlocater.venue;

import java.util.ArrayList;

/**
 * Created by tliimfee on 7/26/2016.
 */
public class Photo
{
    private int height;
    private int width;
    private ArrayList<String> htmlAttrobutions = new ArrayList<>();
    private String reference;

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public int getWidth()
    {
        return width;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public ArrayList<String> getHtmlAttrobutions()
    {
        return htmlAttrobutions;
    }

    public void setHtmlAttrobutions(ArrayList<String> htmlAttrobutions)
    {
        this.htmlAttrobutions = htmlAttrobutions;
    }

    public String getReference()
    {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
}