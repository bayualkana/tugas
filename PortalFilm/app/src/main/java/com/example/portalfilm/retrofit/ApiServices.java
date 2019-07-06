package com.example.portalfilm.retrofit;

import com.example.portalfilm.model.ResponseMovie;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiServices {

    @GET("movie/popular")
    Call<ResponseMovie>  ambilDataMovie(
            @Query("api_key") String apikey

    );


}
