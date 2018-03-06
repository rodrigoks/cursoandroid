package br.com.jbusiness.somdosbichos;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView cachorro;
    private ImageView gato;
    private ImageView leao;
    private ImageView macaco;
    private ImageView ovelha;
    private ImageView vaca;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cachorro = findViewById(R.id.iv_cao_id);
        gato = findViewById(R.id.iv_gato_id);
        leao = findViewById(R.id.iv_leao_id);
        macaco = findViewById(R.id.iv_macaco_id);
        ovelha = findViewById(R.id.iv_ovelha_id);
        vaca = findViewById(R.id.iv_vaca_id);

        cachorro.setOnClickListener(this);
        gato.setOnClickListener(this);
        leao.setOnClickListener(this);
        macaco.setOnClickListener(this);
        ovelha.setOnClickListener(this);
        vaca.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.iv_cao_id:
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.cao);
                play();
                break;
            case R.id.iv_gato_id:
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.gato);
                play();
                break;
            case R.id.iv_leao_id:
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.leao);
                play();
                break;
            case R.id.iv_macaco_id:
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.macaco);
                play();
                break;
            case R.id.iv_ovelha_id:
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ovelha);
                play();
                break;
            case R.id.iv_vaca_id:
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.vaca);
                play();
                break;
            default:
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.cao);
                play();
                break;
        }
    }

    /**
     * Tocar os sons selecionados.
     */
    private void play(){
        if(mediaPlayer != null){
            mediaPlayer.start();
        }
    }

    @Override
    public void onDestroy(){
        if(mediaPlayer != null){
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }
        super.onDestroy();
    }
}
