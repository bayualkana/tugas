package com.example.portalfilm;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.portalfilm.model.ResponseMovie;
import com.example.portalfilm.model.ResultsItem;
import com.example.portalfilm.retrofit.RetrofitConfig;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    List<ResultsItem> dataMovie = new ArrayList<>();
    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //layout per item
        //model datanya
        //dummydata

        recycler = findViewById(R.id.recycleview);

       // MovieModel movie1 = new MovieModel();
      //  movie1.setJudulFilm("The Hobbit");
       // movie1.setPosterFilm("https://image.tmdb.org/t/p/w185_and_h278_bestv2/ysX7vDmSh5O19vFjAi56WL7l4nk.jpg");

       // for (int i = 0; i < 20 ; i++) {

        //    dataMovie.add(movie1);

      //
        //}
        
        getDataOnline();

        //adapter
        recycler.setAdapter(new MovieAdapter(MainActivity.this, dataMovie));



        //layoutmanager

        recycler.setLayoutManager(new GridLayoutManager(MainActivity.this, 2));

    }

    private void getDataOnline() {
        final ProgressDialog progress = new ProgressDialog(MainActivity.this);
        progress.setMessage("Silahkan menunggu");
        progress.show();









        Call<ResponseMovie> request = RetrofitConfig.getApiServices().ambilDataMovie("e8b96303b7279f47e4800cfe6733a94d");
        request.enqueue(new Callback<ResponseMovie>() {
            @Override
            public void onResponse(Call<ResponseMovie> call, Response<ResponseMovie> response) {
                progress.dismiss();


                if (response.isSuccessful()){
                    dataMovie = response.body().getResults();
                    recycler.setAdapter(new MovieAdapter(MainActivity.this, dataMovie));

                } else {
                    Toast.makeText(MainActivity.this, "Request Tidak Diterima", Toast.LENGTH_SHORT).show();

                }
            }

            @Override
            public void onFailure(Call<ResponseMovie> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Request gagal"+t.getMessage(), Toast.LENGTH_SHORT).show();
                progress.dismiss();

            }
        });
    }
}
