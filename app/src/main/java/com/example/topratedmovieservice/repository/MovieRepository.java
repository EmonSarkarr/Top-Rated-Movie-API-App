package com.example.topratedmovieservice.repository;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.example.topratedmovieservice.models.MovieModel;
import com.example.topratedmovieservice.networks.MovieNetworkService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MovieRepository {
    public LiveData<MovieModel> getMovieData() {
        MutableLiveData<MovieModel> movieLiveData = new MutableLiveData<>();
        MovieNetworkService.getService().getMovieData().enqueue(new Callback<MovieModel>() {
            @Override
            public void onResponse(Call<MovieModel> call, Response<MovieModel> response) {
                if (response.code() == 200) {
                    final MovieModel model = response.body();
                    movieLiveData.postValue(model);
                }
            }
            @Override
            public void onFailure(Call<MovieModel> call, Throwable t) {
                Log.e("RetrofitExample", "onFailure: "+t.getLocalizedMessage());
            }
        });
        return movieLiveData;
    }

}
