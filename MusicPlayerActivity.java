package com.example.musicplayerapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MusicPlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_player);

        Button play = findViewById(R.id.playbtn);
        Button pause = findViewById(R.id.pausebtn);
        Button stop = findViewById(R.id.stopbtn);
        Button back = findViewById(R.id.backbtn);

        final MediaPlayer mp = MediaPlayer.create(MusicPlayerActivity.this, R.raw.we_are_one);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MusicPlayerActivity.this, MainActivity.class));
            }
        });

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp == null){
                    mp.start();
                } else if(!mp.isPlaying()){
                    mp.start();
                }
            }
        });

        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.pause();
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.release();
            }
        });
    }
}
