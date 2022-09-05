package com.example.topratedmovieservice;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.topratedmovieservice.databinding.FragmentMovieListBinding;
import com.example.topratedmovieservice.viewmodels.MovieViewModel;

public class MovieListFragment extends Fragment {

    private FragmentMovieListBinding binding;
    private MovieViewModel viewModel;


    public MovieListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMovieListBinding.inflate(inflater);
        return binding.getRoot();
    }
}