package com.example.topratedmovieservice.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.topratedmovieservice.models.MovieModel;
import com.example.topratedmovieservice.repository.MovieRepository;

public class MovieViewModel extends ViewModel {
    private MovieRepository repository;
    public MovieViewModel() {
        repository = new MovieRepository();
    }
    public LiveData<MovieModel> getMovieData() {
        return repository.getMovieData();
    }
}
