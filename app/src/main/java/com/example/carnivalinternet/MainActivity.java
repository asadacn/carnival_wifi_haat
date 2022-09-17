package com.example.carnivalinternet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
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

        Button  update_button = (Button) findViewById(R.id.check_Update);
        update_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {openCheckUpdateActivity();}
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

    public void openCheckUpdateActivity(){
//        Intent intent = new Intent(this, CheckUpdateActivity.class);
//        startActivity(intent);
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1psC8ZE1rm8KhzkxSOeWiwoyhYLvRSno-?usp=sharing"));
        startActivity(browserIntent);
    }
}