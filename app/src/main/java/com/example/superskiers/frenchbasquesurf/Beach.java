package com.example.superskiers.frenchbasquesurf;


class Beach {

    //Text resources for the word
    private final String beachName;
    private final String beachDescrip;
    //Image resource ID for the word
    private final int mImageResourceId;
    //Image of corresponding report (swell, tides)
    private int imageOfReport;



    //Constructor
    public Beach(String nWord, String dWord, int imageResourceID){
        beachName = nWord;
        beachDescrip = dWord;
        mImageResourceId = imageResourceID;
    }
    public Beach(String nWord, String dWord, int imageResourceId, int imageOfReportId){
        beachName = nWord;
        beachDescrip = dWord;
        mImageResourceId = imageResourceId;
        imageOfReport = imageOfReportId;


    }

    //Return the description of the beach
    public String getbeachDescripText(){
        return beachDescrip;
    }
    //Return the beachName
    public String getbeachNameText(){
        return beachName;
    }
    //Return the Image of beach
    public  int getmImageResourceId(){
        return mImageResourceId;
    }
    //Return the image of specified report (i.e. swell or tides)
    public int getImageOfReport(){
        return imageOfReport;
    }

    }


