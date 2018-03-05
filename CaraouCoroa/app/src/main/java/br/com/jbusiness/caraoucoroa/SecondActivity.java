package br.com.jbusiness.caraoucoroa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {

    private ImageView ivMoeda;
    private ImageView ivResultado;
    private ImageView btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ivMoeda = findViewById(R.id.iv_resultado_id);
        btnVoltar = findViewById(R.id.iv_btn_voltar_id);
        ivResultado = findViewById(R.id.iv_resultado_id);

        Bundle extras = getIntent().getExtras();

        if(extras != null){

            String opcao = extras.getString("opcao");
            if("cara".equals(opcao)){
                ivResultado.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_cara));
            } else {
                ivResultado.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_coroa));
            }
        }

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SecondActivity.this, MainActivity.class));
            }
        });
    }
}
