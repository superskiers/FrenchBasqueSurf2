package com.example.superskiers.frenchbasquesurf;


public class Beach {

    //TextView resources
    private final String mBeachName;
    private final String mBeachDescription;
    private String mBeachForecast;

    //ImageView resources
    private final int mImageResourceId; //mImageResourceId is for the main image of each beach
    //Image of corresponding report (swell, tides)
    private int mImageOfReport;
    private int mImageOfWind;
    private int mImageOfTides;
    private int mImageOfSwell;

    //Constructor for the new Beach object with image of corresponding report i.e. tides, swell, etc.
    //Used to hold key and value pairs for intent to AllFragmentsActivity
    public Beach(String beachName, String beachDescription, String beachForecast, int imageResourceId,
                 int imageOfReportId, int imageOfSwell, int imageOfWind, int imageOfTides) {
        mBeachName = beachName;
        mBeachDescription = beachDescription;
        mBeachForecast = beachForecast;
        mImageResourceId = imageResourceId;
        mImageOfReport = imageOfReportId;
        mImageOfSwell = imageOfSwell;
        mImageOfWind = imageOfWind;
        mImageOfTides = imageOfTides;
    }
    //Constructor for the new Beach object for corresponding fragment
    public Beach(String beachName, String beachDescription, String beachForecast, int imageResourceID,
                 int imageOfSwell, int imageOfWind, int imageOfTides) {
        mBeachName = beachName;
        mBeachDescription = beachDescription;
        mImageResourceId = imageResourceID;
        mBeachForecast = beachForecast;
        mImageOfSwell = imageOfSwell;
        mImageOfWind = imageOfWind;
        mImageOfTides = imageOfTides;
    }
    //Return the description of the beach
    public String getbeachDescriptionText(){
        return mBeachDescription;
    }
    //Return the beachName
    public String getbeachNameText(){
        return mBeachName;
    }
    //Return the Image of beach
    public  int getmImageResourceId(){
        return mImageResourceId;
    }
    //Return the image of specified report (i.e. swell or tides)
    public int getImageOfReport(){
        return mImageOfReport;
    }
    //Return the image of swell report
    public int getmImageOfSwell() {
        return mImageOfSwell;
    }
    //Return the image of wind report
    public int getmImageOfWind() {
        return mImageOfWind;
    }
    //Return the image of tides report
    public int getmImageOfTides() {
        return mImageOfTides;
    }
    //Return String of forecast
    public String getmBeachForecast() {
        return mBeachForecast;
    }
}


