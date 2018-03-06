package br.com.jbusiness.mediaplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnPlay;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPlay = findViewById(R.id.btn_play_id);
        mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.musica);

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer.isPlaying())
                    pause();
                else
                    play();
            }
        });
    }

    @Override
    protected void onDestroy() {
        if(mediaPlayer != null){
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }
        super.onDestroy();
    }

    /**
     * executar a musica
     */
    private void play() {

        if(mediaPlayer != null) {
            mediaPlayer.start();
            btnPlay.setText("Pausar");
        }

    }

    /**
     * pausar a musica
     */
    private void pause() {

        if(mediaPlayer != null) {
            mediaPlayer.pause();
            btnPlay.setText("Play");
        }

    }
}
