package com.zecode.deal.filteration.view;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zecode.deal.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class FilterationFragment extends Fragment {


    public FilterationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_filteration, container, false);
    }

}
