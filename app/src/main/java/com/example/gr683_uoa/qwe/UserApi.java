package com.example.gr683_uoa.qwe;

import com.example.gr683_uoa.qwe.DataSourse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface UserApi {
    @GET("/api/users")
    Call<List<DataSourse>> getData();


}
