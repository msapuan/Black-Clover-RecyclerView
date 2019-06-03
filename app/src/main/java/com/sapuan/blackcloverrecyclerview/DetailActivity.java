package com.sapuan.blackcloverrecyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        BlackClover blackClover = intent.getParcelableExtra("KIRIM");
        String title        = blackClover.getName();
        String about        = blackClover.getInfo();
        String team         = blackClover.getTeam();


        getSupportActionBar().setTitle(title);

        ImageView imgPhoto  = findViewById(R.id.img_photo);

        Glide.with(this)
                .load(blackClover.getPhoto())
                .into(imgPhoto);

        TextView tvAbout    = findViewById(R.id.show_info);
        tvAbout.setText(about);

        TextView tvTeam     = findViewById(R.id.show_namaTim);
        tvTeam.setText(team);
    }
}
