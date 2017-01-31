package com.example.admin.jsonparsinginlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.Toast;

import com.example.admin.jsonparsinginlistview.Adapter.CustomAdapter;
import com.example.admin.jsonparsinginlistview.Model.User;
import com.example.admin.jsonparsinginlistview.REST.getApi;

import java.util.ArrayList;
import java.util.List;

import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

public class MainActivity extends AppCompatActivity {
    CustomAdapter customAdapter;
    ListView userList;
    ArrayList<User> users;
    String URL = "http://froggymails.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        userList = (ListView) findViewById(R.id.userList);
        users = new ArrayList<User>();
        getRetrofitObject(URL);


    }

    void getRetrofitObject(String url) {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        getApi service = retrofit.create(getApi.class);

        Call<ArrayList<User>> call = service.getUserDetails();

        call.enqueue(new Callback<ArrayList<User>>() {
            @Override
            public void onResponse(Response<ArrayList<User>> response, Retrofit retrofit) {
                users = response.body();
                Toast.makeText(MainActivity.this, response.body() + "", Toast.LENGTH_SHORT).show();
                customAdapter = new CustomAdapter(MainActivity.this, users);
                userList.setAdapter(customAdapter);
                customAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Throwable t) {
                Toast.makeText(MainActivity.this, "Sorry Didnt gets json", Toast.LENGTH_SHORT).show();
            }
        });
    }


}
