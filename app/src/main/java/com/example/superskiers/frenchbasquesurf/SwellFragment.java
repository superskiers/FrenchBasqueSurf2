package com.example.superskiers.frenchbasquesurf;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class SwellFragment extends Fragment {
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        //Create an ArrayList of beaches
        final ArrayList<Beach> beaches = new ArrayList<>();
        beaches.add(new Beach(getString(R.string.anglet), getString(R.string.angletSwell), R.drawable.anglet3, R.drawable.swell_height2));
        beaches.add(new Beach(getString(R.string.grandeplage), getString(R.string.grandePlageSwell),R.drawable.grandeplage3, R.drawable.swell_height2));
        beaches.add(new Beach(getString(R.string.cotedebasque), getString(R.string.coteDeBasqueSwell),R.drawable.cotedebasque3, R.drawable.swell_height2));
        beaches.add(new Beach(getString(R.string.milady), getString(R.string.miladySwell),R.drawable.milady3, R.drawable.swell_height2));
        beaches.add(new Beach(getString(R.string.parlementia), getString(R.string.parlementiaSwell),R.drawable.parlementia3, R.drawable.swell_height2));
        beaches.add(new Beach(getString(R.string.stjeandeluz), getString(R.string.stjeandeluzSwell),R.drawable.stjeandeluz3, R.drawable.swell_height3));
        beaches.add(new Beach(getString(R.string.hendaye), getString(R.string.hendayeSwell),R.drawable.hendaye3, R.drawable.swell_height3));


        PlageAdapter adapter = new PlageAdapter(getActivity(), beaches);

        //Find the ID called list which is declared in the word_list.xml layout file
        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;

    }

}