package com.fransiskaindri202102369.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private ImageView _imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _imageView1 = (ImageView) findViewById(R.id.iamgeView1);

        String imageUrl = "https://s-light.tiket.photos/t/01E25EBZS3W0FY9GTG6C42E1SE/t_htl-dskt/tix-hotel/images-web/2020/10/31/c72e4eb3-a752-4313-8c13-3266d5944cb9-1604124500101-c25edc66b75fc58826b69700a47335c2.jpg";
        Picasso.with(this).load(imageUrl).into(_imageView1);
    }
}