package com.example.congh.myasm.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.congh.myasm.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_ThongKe extends Fragment {


    public Fragment_ThongKe() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment__thong_ke, container, false);
    }

}
