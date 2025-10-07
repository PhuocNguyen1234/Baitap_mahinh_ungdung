package com.example.manhinh_ungdung;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileTabActivity extends AppCompatActivity {
    ImageView imgsetting;
    @Override
    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_tab);
        imgsetting = findViewById(R.id.ic_setting);
        imgsetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileTabActivity.this, LoginTabActivity.class);
                startActivity(intent);
            }
        });

    }
}
