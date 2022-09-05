package com.example.topratedmovieservice.adapters;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.example.topratedmovieservice.R;
import com.squareup.picasso.Picasso;

public class MovieBindingAdapter {
    @BindingAdapter(value = "app:setMoviePoster")
    public static void setMoviePoster(ImageView imageView,String url){
        final String fullUrl = "https://image.tmdb.org/t/p/w500"+url;
        Picasso.get().load(fullUrl).placeholder(R.drawable.ic_baseline_pending_24).into(imageView);
    }
}
