package com.example.topratedmovieservice.networks;

import com.example.topratedmovieservice.models.MovieModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MovieServiceApi {
    @GET("top_rated?api_key=6d1a0ef86c33e6d6982d2f0b82cab0d4&language=en-US&page=1&fbclid=IwAR099X9xF6_gklb-qAXrLDClQKpDkKT8Y2gKLnHBO3DS222TegfxSlJ-HZA&language=en-US&page=1")
    Call<MovieModel> getMovieData();
}
