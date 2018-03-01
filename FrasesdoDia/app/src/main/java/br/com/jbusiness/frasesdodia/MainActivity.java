package br.com.jbusiness.frasesdodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView novaFrase;
    private Button btnNovaFrase;

    private String[] frases = {
            "FRASE 1",
            "FRASE 2",
            "FRASE 3"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        novaFrase = findViewById(R.id.txt_frase_dia_id);
        btnNovaFrase = findViewById(R.id.btn_nova_frase_dia);

        btnNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rand = new Random();
                int valorRandomico = rand.nextInt(frases.length);
                novaFrase.setText(frases[valorRandomico]);
            }
        });

    }
}
