package com.example.assignment2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.StrictMode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsACtivity extends AppCompatActivity {

    Result result;
    ImageView img1,img2;
    TextView tv1, tv2, tv3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_details);

        result = (Result) getIntent().getSerializableExtra("result");

        img1=(ImageView)findViewById(R.id.back_drop_path);
        img2=(ImageView)findViewById(R.id.poster_path);
        tv1=(TextView) findViewById(R.id.original_title);
        tv2=(TextView) findViewById(R.id.vote_count);
        tv3=(TextView) findViewById(R.id.over_view);


        img1.setImageResource(getIntent().getIntExtra("BackdropPath",0));
        img2.setImageResource(getIntent().getIntExtra("PosterPath",0));
        tv1.setText(getIntent().getStringExtra("OriginalTitle"));
        tv2.setText(getIntent().getStringExtra("VoteCount"));
        tv3.setText(getIntent().getStringExtra("Overview"));

        }


}