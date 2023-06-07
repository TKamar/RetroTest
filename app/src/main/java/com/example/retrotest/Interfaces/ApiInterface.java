package com.example.retrotest.Interfaces;

import com.example.retrotest.Classes.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("/posts")
    Call<List<Post>> getPosts();

}
