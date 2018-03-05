package br.com.jbusiness.caraoucoroa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView btnJogar;
    private String[] opcoes = { "cara", "coroa" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnJogar = findViewById(R.id.iv_btn_jogar_id);

        btnJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /*
                 * Preparando para gerar numero aleatorio entre 0 e 1
                 * que sera utilizado como indice para recuperar a opcao
                 * da moeda.
                 */
                Random randNumber = new Random();
                int numeroAleatorio = randNumber.nextInt(2);

                /*
                 * Prepara informações e chamada para proxima activity
                 */
                Intent intSecond = new Intent(MainActivity.this, SecondActivity.class);
                intSecond.putExtra("opcao", opcoes[numeroAleatorio]);

                /*
                 * Chamar a proxima activity
                 */
                startActivity(intSecond);
            }
        });
    }
}
