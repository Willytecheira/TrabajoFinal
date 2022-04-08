package com.example.trabajofinal;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


        private EditText user;
        private EditText pass;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            user = (EditText) findViewById(R.id.usuario);
            pass = (EditText) findViewById(R.id.contraseña);

            Button login = (Button) findViewById(R.id.login);
            login.setOnClickListener(this); }


        @Override
        public void onClick(View view) {
            String us = user.getText().toString();
            String pas = pass.getText().toString();

            if(view.getId() == R.id.login) {

                if (us.equals("Willy") && pas.equals("12345")) {
                    Toast.makeText(getApplicationContext(), "Login Exitoso", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(this, vehiculos.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "Fallo", Toast.LENGTH_LONG).show();
                }}}}
