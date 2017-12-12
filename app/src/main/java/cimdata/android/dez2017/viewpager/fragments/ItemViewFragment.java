package cimdata.android.dez2017.viewpager.fragments;


import android.os.Bundle;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import cimdata.android.dez2017.viewpager.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ItemViewFragment extends Fragment {


    private static final String ARGS_STRING_TITLE = "args.string.title";

    TextView titleText;
    
    String title;

    public ItemViewFragment() {}

    public static ItemViewFragment newInstance(String title) {

        ItemViewFragment fragment = new ItemViewFragment();

        Bundle args = new Bundle();
        args.putString(ARGS_STRING_TITLE, title);
        fragment.setArguments(args);

        return fragment;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            title = getArguments().getString(ARGS_STRING_TITLE);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_item_view, container, false);

        titleText = v.findViewById(R.id.txt_fritem_title);
        titleText.setText(title);


        return v;
    }
}
