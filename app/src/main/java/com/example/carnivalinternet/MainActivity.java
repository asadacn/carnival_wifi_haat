package com.example.carnivalinternet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton  button_haat = (ImageButton) findViewById(R.id.buttonHaat);
        button_haat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHaatActivity();
            }
        });

        ImageButton  button_tv = (ImageButton) findViewById(R.id.buttonTv);
        button_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTvActivity();
            }
        });

        ImageButton  button_nagordola = (ImageButton) findViewById(R.id.buttonNagordola);
        button_nagordola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNagordolaActivity();
            }
        });
    }
    public void openHaatActivity(){
        Intent intent = new Intent(this, HaatActivity.class);
        startActivity(intent);
    }

    public void openTvActivity(){
        Intent intent = new Intent(this, TvActivity.class);
        startActivity(intent);
    }

    public void openNagordolaActivity(){
        Intent intent = new Intent(this, NagordolaActivity.class);
        startActivity(intent);
    }
}