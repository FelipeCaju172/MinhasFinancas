package com.example.financas;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.text.method.DigitsKeyListener;
import android.text.method.KeyListener;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button botao01;
    private EditText edLogin, edSenha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_USER_PORTRAIT);
        botao01 = (Button) findViewById(R.id.btnlogin);
        edLogin = (EditText) findViewById(R.id.editTextlogin);
        edSenha = (EditText) findViewById(R.id.editTextPassword);
        edLogin.requestFocus();
        KeyListener keyListener = DigitsKeyListener.getInstance("1234567890");
        edLogin.setKeyListener(keyListener);
        edSenha.setKeyListener(keyListener);

        botao01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                botao01Activitc();
            }
        });

    }

    private void botao01Activitc() {

        Intent intent = new Intent(MainActivity.this, TelaInicial.class);
        startActivity(intent);

    }
}