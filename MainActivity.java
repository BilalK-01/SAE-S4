package com.example.powerhome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username=(TextView) findViewById(R.id.username);
        TextView password=(TextView) findViewById(R.id.password);

        MaterialButton loginBtn=(MaterialButton) findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("a1")&&password.getText().toString().equals("123")){
                    Toast.makeText(MainActivity.this,"Bienvenue",Toast.LENGTH_SHORT).show();
                    String email=username.getText().toString();
                    String mdp=password.getText().toString();
                    Intent intent=new Intent(MainActivity.this, HabitatActivity.class);
                    intent.putExtra("email",email);
                    intent.putExtra("mdp",mdp);
                    startActivity(intent);

                }
                else{
                    Toast.makeText(MainActivity.this,"Mauvais Mot de Passe ou Email",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


}