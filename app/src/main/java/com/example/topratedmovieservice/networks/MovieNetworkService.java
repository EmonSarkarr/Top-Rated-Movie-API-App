package com.example.topratedmovieservice.networks;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MovieNetworkService {
    public static MovieServiceApi getService() {
        final Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.themoviedb.org/3/movie/").addConverterFactory(GsonConverterFactory.create()).build();
        return retrofit.create(MovieServiceApi.class);
    }

}
