package br.com.jbusiness.dadosactivity;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        text = findViewById(R.id.tv_id);

        Bundle extra = getIntent().getExtras();

        if(extra != null){
            String nome = extra.getString("nome");
            if(nome != null && !nome.equals("")){
                text.setTextColor(Color.BLACK);
                text.setText("O nome informado é: " + nome);
            } else {
                informarTextoInvalido(text);
            }
        } else {
            informarTextoInvalido(text);
        }


    }

    private void informarTextoInvalido(TextView text){
        text.setTextColor(Color.RED);
        text.setText("Informação não enviada.");
    }
}
