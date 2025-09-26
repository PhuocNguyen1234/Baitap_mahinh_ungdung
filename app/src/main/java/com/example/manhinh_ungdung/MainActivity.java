package com.example.manhinh_ungdung;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

public class MainActivity extends AppCompatActivity {
    private Button btnopen;
    private Button btnopenS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        btnopen = (Button) findViewById(R.id.btnlogin);
        btnopen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginTabActivity.class);
                startActivity(intent);
            }
        });

        btnopenS = (Button) findViewById(R.id.btnsignup);
        btnopenS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SignupTabActivity.class);
                startActivity(intent);
            }
        });

    }
}