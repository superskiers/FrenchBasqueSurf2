package com.example.superskiers.frenchbasquesurf;


import android.app.Activity;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Objects;

/**
 * A simple {@link Fragment} subclass.
 */
class PlageAdapter extends ArrayAdapter<Beach> {

    //PlageAdapter shows what needs to be pulled to create the view
    public PlageAdapter(Activity context, ArrayList<Beach> beaches){
        super(context, 0, beaches);
    }
    //Below are the components to form the page fragments
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);

        }
        //Get the Beach object at the given position on the list
        Beach currentWord = getItem(position);

        //Find the TextView in the list_item.xml layout with the beachName ID
        TextView beachNameText = listItemView.findViewById(R.id.beachName_Text);
        beachNameText.setText(Objects.requireNonNull(currentWord).getbeachNameText());

        //Find the TextView in the list_item.xml layout with the beachDescription ID
        TextView beachDescripText = listItemView.findViewById(R.id.beachDescrip_Text);
        beachDescripText.setText(currentWord.getbeachDescripText());

        //Find the ImageView in the list_item.xml layout with the Image of the Beach ID
        ImageView imageBeach = listItemView.findViewById(R.id.imageOfBeach);
        imageBeach.setImageResource(currentWord.getmImageResourceId());

        //Find the ImageView in the list_item.xml layout with the Image Info View ID
        ImageView imageInfoView = listItemView.findViewById(R.id.imageInfoView);
        imageInfoView.setImageResource(currentWord.getImageOfReport());

        //Return the whole list layout (including 2 TextViews and 2 ImageViews)
        return listItemView;

    }

}
