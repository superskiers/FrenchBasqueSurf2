package com.example.superskiers.frenchbasquesurf;


import android.app.Activity;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class BeachAdapter extends ArrayAdapter<Beach> {

    //BeachAdapter shows what needs to be pulled to create the view
    public BeachAdapter(Activity context, ArrayList<Beach> beaches) {
        super(context, 0, beaches);
    }

    //Below are the components to form the page fragments
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View layoutView = convertView;
        if (layoutView == null) {
            layoutView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        //Get the Beach object at the given position on the list
        Beach currentWord = getItem(position);

        //Find the TextView in the list_item.xml layout with the beachName ID
        TextView beachNameText = layoutView.findViewById(R.id.beach_name_text_view);
        beachNameText.setText(currentWord.getbeachNameText());

        //Find the TextView in the list_item.xml layout with the beachDescription ID
        TextView beachDescripText = layoutView.findViewById(R.id.beach_description_text_view);
        beachDescripText.setText(currentWord.getbeachDescriptionText());

        //Find the ImageView in the list_item.xml layout with the Image of the Beach ID
        ImageView imageBeach = layoutView.findViewById(R.id.image_of_beach);
        imageBeach.setImageResource(currentWord.getmImageResourceId());

        //Find the ImageView in the list_item.xml layout with the Image Info View ID
        ImageView imageInfoView = layoutView.findViewById(R.id.forecast_image_view);
        imageInfoView.setImageResource(currentWord.getImageOfReport());

        //Return the whole list layout (including 2 TextViews and 2 ImageViews)
        return layoutView;

    }
}
