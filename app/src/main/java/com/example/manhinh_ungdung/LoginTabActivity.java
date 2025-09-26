package com.example.manhinh_ungdung;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LoginTabActivity extends AppCompatActivity {
    Button btnback;
    @Override
    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_tab);
        btnback = (Button) findViewById(R.id.back);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginTabActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

}
