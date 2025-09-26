package com.example.manhinh_ungdung;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class SignupTabActivity extends AppCompatActivity {
    Button btnback;
    @Override
    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_tab);
        btnback = (Button) findViewById(R.id.backfrsignup);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignupTabActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

}
