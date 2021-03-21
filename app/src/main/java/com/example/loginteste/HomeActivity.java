package com.example.loginteste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    private Button BTVoltaLogin;
    private Button BTVoltaSplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        BTVoltaLogin = (Button) findViewById(R.id.BTVoltaLogin);
        BTVoltaSplash = (Button) findViewById(R.id.BTVoltaSplash);

        BTVoltaLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        BTVoltaSplash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SplashActivity.class);
                startActivity(intent);
            }
        });
    }
}