package br.com.jbusiness.alcoolougasolina;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etPrecoAlcool;
    private EditText etPrecoGasolina;
    private TextView tvResultado;
    private Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etPrecoAlcool = findViewById(R.id.et_alcool_id);
        etPrecoGasolina = findViewById(R.id.et_gasolina_id);
        btnCalcular = findViewById(R.id.btn_calcular);
        tvResultado = findViewById(R.id.tv_resultado_id);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String precoAlcool = etPrecoAlcool.getText().toString();
                String precoGasolina = etPrecoGasolina.getText().toString();

                if(precoAlcool.isEmpty()){
                    tvResultado.setTextColor(Color.RED);
                    tvResultado.setText("Favor informar o preço do Álcool.");
                }

                if(precoGasolina.isEmpty()){
                    tvResultado.setTextColor(Color.RED);
                    tvResultado.setText("Favor informar o preço da Gasolina.");
                }

                double pAlcool = Double.valueOf(precoAlcool).doubleValue();
                double pGasolina = Double.valueOf(precoGasolina).doubleValue();

                double resultado = pAlcool / pGasolina;

                if(resultado >= 0.7){
                    tvResultado.setTextColor(Color.BLACK);
                    tvResultado.setText("A melhor opção a ser utilizada é gasolina.");
                } else {
                    tvResultado.setTextColor(Color.BLACK);
                    tvResultado.setText("A melhor opção a ser utilizada é álcool.");
                }

            }
        });

    }
}
