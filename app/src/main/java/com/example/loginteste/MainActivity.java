package com.example.loginteste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {

    private EditText tLogin;
    private EditText tSenha;
    private Button BTLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        tLogin = (EditText) findViewById(R.id.tLogin);
        tSenha = (EditText) findViewById(R.id.tSenha);
        BTLogin = (Button) findViewById(R.id.BTLogin);

        BTLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Login = tLogin.getText().toString();
                String Senha = tSenha.getText().toString();

                if (Login.equals(Senha)) {
                    tLogin.setTextColor(0xFF00FF00);
                    tSenha.setTextColor(0xFF00FF00);
                    Intent intent = new Intent(getApplicationContext(),  HomeActivity.class);
                    startActivity(intent);
                }
                else {
                    tLogin.setError("Errado");
                    tSenha.setError("Errado");
                }
            }
        });
    }

}

