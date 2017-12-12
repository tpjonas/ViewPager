package cimdata.android.dez2017.viewpager.fragments;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cimdata.android.dez2017.viewpager.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ItemViewFragment extends Fragment {


    public ItemViewFragment() {}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_item_view, container, false);



        return v;
    }

}
