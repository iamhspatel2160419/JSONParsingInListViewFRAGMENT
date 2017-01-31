package com.example.admin.jsonparsinginlistview;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ArgumentFragment extends Fragment {
    public ArgumentFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_default, container, false);//Inflate Layout
        TextView postcode = (TextView) view.findViewById(R.id.tvPostCode);
        TextView email = (TextView) view.findViewById(R.id.tvEmail);
        //Find textview Id

        //Get Argument that passed from activity in "data" key value
        String pcode = getArguments().getString("postCode");
        String eMail = getArguments().getString("email");
        postcode.setText(pcode);//set string over textview
        email.setText(eMail);
        return view;//return view
    }
}