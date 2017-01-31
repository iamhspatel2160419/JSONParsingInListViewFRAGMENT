package com.example.admin.jsonparsinginlistview.Adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.example.admin.jsonparsinginlistview.FragmentMainActivity;
import com.example.admin.jsonparsinginlistview.Model.User;
import com.example.admin.jsonparsinginlistview.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 29-12-2016.
 */
public class CustomAdapter extends BaseAdapter {

    Context context;
    LayoutInflater inflater;
    ArrayList<User> data;

    public CustomAdapter(Context context, ArrayList<User> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public User getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        final ViewHolder holder ;
        if(convertView==null) {
            holder=new ViewHolder();
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView= inflater.inflate(R.layout.single_raw,null);
            holder.userFullName= (TextView) convertView.findViewById(R.id.userFullName);
            holder.userCity= (TextView) convertView.findViewById(R.id.userCity);
            holder.userPostcode= (TextView) convertView.findViewById(R.id.userPostCode);
            holder.userEmail= (TextView) convertView.findViewById(R.id.userEmailId);

            convertView.setTag(holder);
        }
        else
        {
            holder = (ViewHolder) convertView.getTag();


        }
        holder.userFullName.setText(data.get(position).getTrcFullName());
        holder.userCity.setText(data.get(position).getTrcCity());
        holder.userPostcode.setText(data.get(position).getTrcPostcode());
        holder.userEmail.setText(data.get(position).getTrcEmail());

        holder.userFullName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoFragmentMainActivity=new Intent(context, FragmentMainActivity.class);
                gotoFragmentMainActivity.putExtra("full_name",data.get(position).getTrcFullName());
                gotoFragmentMainActivity.putExtra("city_name",data.get(position).getTrcCity());
                gotoFragmentMainActivity.putExtra("postcodE_name",data.get(position).getTrcPostcode());
                gotoFragmentMainActivity.putExtra("email_name",data.get(position).getTrcEmail());
                context.startActivity(gotoFragmentMainActivity);
            }
        });


        return convertView;
    }

    public static class ViewHolder
    {
        public TextView userFullName,userCity,userPostcode,userEmail;
        public Button sendRequest;

    }



}
