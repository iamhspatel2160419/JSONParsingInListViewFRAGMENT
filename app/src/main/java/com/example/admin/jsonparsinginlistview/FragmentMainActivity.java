package com.example.admin.jsonparsinginlistview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class FragmentMainActivity extends AppCompatActivity implements View.OnClickListener {

    private static Button defaultFragment, argumentFragment;
    private static FragmentManager fragmentManager;
    String name,city,postCode,email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        Intent intent = getIntent();
         name = intent.getStringExtra("full_name");
         city = intent.getStringExtra("city_name");
         postCode = intent.getStringExtra("postcodE_name");
         email = intent.getStringExtra("email_name");


        fragmentManager =getSupportFragmentManager();
                //Get Fragment Manager

        defaultFragment = (Button) findViewById(R.id.setDefaultFragment);
        argumentFragment = (Button) findViewById(R.id.setArgumentFragment);

        defaultFragment.setOnClickListener(this);
        argumentFragment.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.setDefaultFragment:

                Fragment argumentFragment1 = new DefaultFragment();//Get Fragment Instance
                Bundle data1 = new Bundle();//Use bundle to pass data
                data1.putString("name",name);//put string, int, etc in bundle with a key value
                data1.putString("city",city);
                argumentFragment1.setArguments(data1);//Finally set argument bundle to fragment
                //Replace default fragment
                fragmentManager.beginTransaction().replace(R.id.fragmentContainer, argumentFragment1).commit();
                break;
            case R.id.setArgumentFragment:

                Fragment argumentFragment2 = new ArgumentFragment();//Get Fragment Instance
                Bundle data = new Bundle();//Use bundle to pass data
                data.putString("postCode",postCode);//put string, int, etc in bundle with a key value
                data.putString("email",email);


                argumentFragment2.setArguments(data);//Finally set argument bundle to fragment

                fragmentManager.beginTransaction().replace(R.id.fragmentContainer, argumentFragment2).commit();//now replace the argument fragment

                /**  Note: If you are passing argument in fragment then don't use below code always replace fragment instance where we had set bundle as argument as we had done above else it will give exception  **/
                //   fragmentManager.beginTransaction().replace(R.id.fragmentContainer, new ArgumentFragment()).commit();
                break;
        }

    }
    }

