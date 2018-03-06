package br.com.jbusiness.series;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private SeekBar seekBar;
    private ImageView ivResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = findViewById(R.id.sb_bar_id);
        ivResultado = findViewById(R.id.iv_resultado_id);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                Toast.makeText(MainActivity.this, "indice: " + i, Toast.LENGTH_SHORT).show();
                switch (i) {
                    case 1:
                        ivResultado.setImageResource(R.drawable.pouco);
                        break;
                    case 2:
                        ivResultado.setImageResource(R.drawable.medio);
                        break;
                    case 3:
                        ivResultado.setImageResource(R.drawable.muito);
                        break;
                    case 4:
                        ivResultado.setImageResource(R.drawable.susto);
                        break;
                    default:
                        ivResultado.setImageResource(R.drawable.pouco);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
