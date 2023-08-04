package com.example.pics;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class home extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) EditText user=findViewById(R.id.username);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) EditText pass=findViewById(R.id.ed2);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) EditText email=findViewById(R.id.et3);

        Button Login=findViewById(R.id.btn);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String Username="starsajo";
                String Password="003";
                String Enteremail="sajo@gmail.com";
                if(user.getText().toString().matches(Username) && pass.getText().toString().matches(Password) && email.getText().toString().matches(Enteremail))
                {
                    Intent i=new Intent(home.this,profile.class);
                    startActivity(i);
                }
                else{
                    Toast.makeText(getApplicationContext(), "Enter a valid username or password", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}