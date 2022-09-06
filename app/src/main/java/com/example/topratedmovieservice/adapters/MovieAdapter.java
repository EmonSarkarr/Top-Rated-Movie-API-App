package com.example.topratedmovieservice.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.example.topratedmovieservice.databinding.MovieRowBinding;
import com.example.topratedmovieservice.models.Result;

public class MovieAdapter extends ListAdapter<Result, MovieAdapter.MovieViewHolder> {
    public MovieAdapter() {
        super(new MovieDiff());
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        MovieRowBinding binding = MovieRowBinding.inflate(
                LayoutInflater.from(parent.getContext()), parent, false
        );
        return new MovieViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {
        final Result result = getItem(position);
        holder.bind(result);
    }

    static class MovieViewHolder extends RecyclerView.ViewHolder {
        MovieRowBinding binding;
        public MovieViewHolder(MovieRowBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(Result result) {
            binding.setMovie(result);
        }
    }

    static class MovieDiff extends DiffUtil.ItemCallback<Result> {

        @Override
        public boolean areItemsTheSame(@NonNull Result oldItem, @NonNull Result newItem) {
            return oldItem.getId() == newItem.getId();
        }

        @Override
        public boolean areContentsTheSame(@NonNull Result oldItem, @NonNull Result newItem) {
            return oldItem.getId() == newItem.getId();
        }
    }
}
