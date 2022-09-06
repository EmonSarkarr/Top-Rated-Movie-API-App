package com.example.topratedmovieservice;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.topratedmovieservice.adapters.MovieAdapter;
import com.example.topratedmovieservice.databinding.FragmentMovieListBinding;
import com.example.topratedmovieservice.models.Result;
import com.example.topratedmovieservice.viewmodels.MovieViewModel;

import java.util.List;

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
        viewModel = new ViewModelProvider(requireActivity()).get(MovieViewModel.class);
        final MovieAdapter adapter = new MovieAdapter();
        binding.movieRV.setLayoutManager(new LinearLayoutManager(getActivity()));
        binding.movieRV.setAdapter(adapter);
        viewModel.getMovieData()
                .observe(getViewLifecycleOwner(),
                        movieModel -> {
                            final List<Result> movieList = movieModel.getResults();
                            adapter.submitList(movieList);
                        });
        return binding.getRoot();
    }
}