package com.example.xylophone;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void PlayDo(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.note1_c);
        mediaPlayer.start();
    }

    public void PlayRe(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.note2_d);
        mediaPlayer.start();
    }

    public void PlayMi(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.note3_e);
        mediaPlayer.start();
    }

    public void PlayFa(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.note4_f);
        mediaPlayer.start();
    }

    public void PlaySol(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.note5_g);
        mediaPlayer.start();
    }

    public void PlayLa(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.note6_a);
        mediaPlayer.start();
    }

    public void PlaySi(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.note7_b);
        mediaPlayer.start();
    }
}