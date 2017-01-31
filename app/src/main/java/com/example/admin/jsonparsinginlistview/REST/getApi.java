package com.example.admin.jsonparsinginlistview.REST;

import com.example.admin.jsonparsinginlistview.Model.User;

import java.util.ArrayList;
import java.util.List;

import retrofit.Call;
import retrofit.http.GET;

/**
 * Created by admin on 29-12-2016.
 */
public interface getApi {


    @GET("/andpract/userlist_view.php")
    Call<ArrayList<User>> getUserDetails();


}
