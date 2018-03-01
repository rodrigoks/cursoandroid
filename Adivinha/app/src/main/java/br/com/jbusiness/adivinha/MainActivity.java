package br.com.jbusiness.adivinha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button jogar;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jogar = findViewById(R.id.button_play_id);
        resultado = findViewById(R.id.show_resultado_id);

        jogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random ram = new Random();
                int randomValue = ram.nextInt();
                resultado.setText("O valor gerado é: " + randomValue);
            }
        });

    }
}
