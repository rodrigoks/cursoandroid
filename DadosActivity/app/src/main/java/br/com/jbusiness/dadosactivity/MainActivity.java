package br.com.jbusiness.dadosactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnEnviarDados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEnviarDados = findViewById(R.id.btn_enviar_dados_id);

        btnEnviarDados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent newIntent = new Intent(MainActivity.this, SecondActivity.class);
                newIntent.putExtra("nome", "Rodrigo Kieling Sturm");
                startActivity(newIntent);
            }
        });

    }
}
