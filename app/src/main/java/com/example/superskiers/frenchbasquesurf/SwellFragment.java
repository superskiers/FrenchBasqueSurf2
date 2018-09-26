package com.example.superskiers.frenchbasquesurf;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class SwellFragment extends Fragment {
    // Required empty public constructor
    public SwellFragment() {
    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        //Create an ArrayList of beaches
        final ArrayList<Beach> beaches = new ArrayList<>();
        beaches.add(new Beach(getString(R.string.anglet), getString(R.string.anglet_swell), getString(R.string.anglet_forecast),
                R.drawable.anglet3, R.drawable.swell_height3, R.drawable.swell_height3, R.drawable.winds, R.drawable.tides2));
        beaches.add(new Beach(getString(R.string.grande_plage), getString(R.string.grande_plage_swell), getString(R.string.grand_plage_forecast),
                R.drawable.grandeplage3, R.drawable.swell_height3, R.drawable.swell_height3, R.drawable.winds, R.drawable.tides2));
        beaches.add(new Beach(getString(R.string.cote_de_basque), getString(R.string.cote_de_basque_swell), getString(R.string.cote_basque_forecast),
                R.drawable.cotedebasque3, R.drawable.swell_height2, R.drawable.swell_height2, R.drawable.winds, R.drawable.tides2));
        beaches.add(new Beach(getString(R.string.milady), getString(R.string.milady_swell), getString(R.string.milady_forecast),
                R.drawable.milady3, R.drawable.swell_height2, R.drawable.swell_height2, R.drawable.winds, R.drawable.tides2));
        beaches.add(new Beach(getString(R.string.parlementia), getString(R.string.parlementia_swell), getString(R.string.parlementia_forecast),
                R.drawable.parlementia3, R.drawable.swell_height2, R.drawable.swell_height2, R.drawable.winds, R.drawable.tides2));
        beaches.add(new Beach(getString(R.string.st_jean_de_luz), getString(R.string.st_jean_de_luz_swell), getString(R.string.st_jean_de_luz_forecast),
                R.drawable.stjeandeluz3, R.drawable.swell_height3, R.drawable.swell_height2, R.drawable.winds, R.drawable.tides2));
        beaches.add(new Beach(getString(R.string.hendaye), getString(R.string.hendaye_swell), getString(R.string.hendaye_forecast),
                R.drawable.hendaye3, R.drawable.swell_height3, R.drawable.swell_height2, R.drawable.winds, R.drawable.tides2));
        //Setting up the array adapter
        BeachAdapter adapter = new BeachAdapter(getActivity(), beaches);

        //Find the ID called list which is declared in the word_list.xml layout file
        ListView listView = rootView.findViewById(R.id.list);

        //Set OnItemClickListener for each item
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Beach allAttributes = beaches.get(position);

                Intent intent = new Intent(getContext(), AllFragmentsActivity.class);

                //TextViews
                intent.putExtra("beachName", allAttributes.getbeachNameText());
                intent.putExtra("beachDescrip", allAttributes.getmBeachForecast());
                //ImageViews
                intent.putExtra("beachImage", allAttributes.getmImageResourceId());
                intent.putExtra("forecast", allAttributes.getImageOfReport());
                intent.putExtra("swell", allAttributes.getmImageOfSwell());
                intent.putExtra("tides", allAttributes.getmImageOfTides());
                intent.putExtra("winds", allAttributes.getmImageOfWind());
                getContext().startActivity(intent);
            }
        });
        //Set adapter with items to the view being populated
        listView.setAdapter(adapter);

        return rootView;

    }

}