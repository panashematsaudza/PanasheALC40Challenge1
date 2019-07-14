package com.panashematsaudza.alc4challenge1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class ProfileActivityC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_c);

        ImageView imageView =  findViewById(R.id.imageView);


        imageView.setImageResource(R.drawable.p);
    }
}
