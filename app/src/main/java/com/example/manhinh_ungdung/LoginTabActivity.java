package com.example.manhinh_ungdung;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginTabActivity extends AppCompatActivity {
    Button btnback, btnlogin;
    EditText edtuser, edtpassword;
    Intent intent;
    @Override
    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_tab);
        //Ánh xạ dữ liệu
        edtuser = findViewById(R.id.user);
        edtpassword = findViewById(R.id.pass);
        btnback = (Button) findViewById(R.id.back);
        btnlogin = (Button) findViewById(R.id.buttonlogin);

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(LoginTabActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = edtuser.getText().toString();
                String pass = edtpassword.getText().toString();
                if(user.equals("Phuoc Nguyen") && pass.equals("12345")){
                    intent = new Intent(LoginTabActivity.this, ProfileTabActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(LoginTabActivity.this, "Sai thông tin đăng nhâp", Toast.LENGTH_LONG).show();
                }

            }
        });
    }

}
