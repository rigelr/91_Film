package com.rigelr.a91film;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.rigelr.a91film.adapters.GridAdapter;
import com.rigelr.a91film.models.MovieModel;

import java.util.ArrayList;
import java.util.List;

public class GridActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        RecyclerView teamsView = findViewById(R.id.rv_teams);

        List<MovieModel> movies = new ArrayList<>();
        movies.add(new MovieModel("https://upload.wikimedia.org/wikipedia/en/thumb/e/eb/Manchester_City_FC_badge.svg/360px-Manchester_City_FC_badge.svg.png", "Liverpool","80","2019","dddddddddddddddddddddddddddddddddddddddddddddddddddd"));
        movies.add(new MovieModel("https://asset.indosport.com/article/image/q/80/219914/logo_manchester_city-169.jpg?w=750&h=423", "Liverpool","80","2019","dddddddddddddddddddddddddddddddddddddddddddddddddddd"));
        movies.add(new MovieModel("https://asset.indosport.com/article/image/q/80/219914/logo_manchester_city-169.jpg?w=750&h=423", "Liverpool","80","2019","dddddddddddddddddddddddddddddddddddddddddddddddddddd"));
        movies.add(new MovieModel("https://asset.indosport.com/article/image/q/80/219914/logo_manchester_city-169.jpg?w=750&h=423", "Liverpool","80","2019","dddddddddddddddddddddddddddddddddddddddddddddddddddd"));
        movies.add(new MovieModel("https://asset.indosport.com/article/image/q/80/219914/logo_manchester_city-169.jpg?w=750&h=423", "Liverpool","80","2019","dddddddddddddddddddddddddddddddddddddddddddddddddddd"));
        movies.add(new MovieModel("https://asset.indosport.com/article/image/q/80/219914/logo_manchester_city-169.jpg?w=750&h=423", "Liverpool","80","2019","dddddddddddddddddddddddddddddddddddddddddddddddddddd"));
        movies.add(new MovieModel("https://asset.indosport.com/article/image/q/80/219914/logo_manchester_city-169.jpg?w=750&h=423", "Liverpool","80","2019","dddddddddddddddddddddddddddddddddddddddddddddddddddd"));
        movies.add(new MovieModel("https://asset.indosport.com/article/image/q/80/219914/logo_manchester_city-169.jpg?w=750&h=423", "Liverpool","80","2019","dddddddddddddddddddddddddddddddddddddddddddddddddddd"));
        movies.add(new MovieModel("https://asset.indosport.com/article/image/q/80/219914/logo_manchester_city-169.jpg?w=750&h=423", "Liverpool","80","2019","dddddddddddddddddddddddddddddddddddddddddddddddddddd"));
        movies.add(new MovieModel("https://asset.indosport.com/article/image/q/80/219914/logo_manchester_city-169.jpg?w=750&h=423", "Liverpool","80","2019","dddddddddddddddddddddddddddddddddddddddddddddddddddd"));
        movies.add(new MovieModel("https://asset.indosport.com/article/image/q/80/219914/logo_manchester_city-169.jpg?w=750&h=423", "Liverpool","80","2019","dddddddddddddddddddddddddddddddddddddddddddddddddddd"));
        movies.add(new MovieModel("https://asset.indosport.com/article/image/q/80/219914/logo_manchester_city-169.jpg?w=750&h=423", "Liverpool","80","2019","dddddddddddddddddddddddddddddddddddddddddddddddddddd"));


        GridAdapter adapter = new  GridAdapter(this,movies);
        teamsView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager =new GridLayoutManager(this,2);
        teamsView.setLayoutManager(layoutManager);
    }
}
