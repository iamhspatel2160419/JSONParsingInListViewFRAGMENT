package com.example.admin.jsonparsinginlistview;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by SONU on 07/10/15.
 */
public class DefaultFragment extends Fragment {
    //Simple Fragment
    public DefaultFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.default_frag, container, false);//Inflate Layout
        TextView name = (TextView) view.findViewById(R.id.tvName);
        TextView city = (TextView) view.findViewById(R.id.tvCity);
        //Find textview Id

        //Get Argument that passed from activity in "data" key value
        String Name = getArguments().getString("name");
        String City = getArguments().getString("city");
        name.setText(Name);//set string over textview
        city.setText(City);
        return view;//return view
    }
}