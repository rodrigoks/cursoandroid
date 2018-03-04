package br.com.jbusiness.idadedecachorro;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txtIdade;
    private TextView txtResultado;
    private Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtIdade = findViewById(R.id.txt_anos_dog);
        txtResultado = findViewById(R.id.txt_lbl_resultado);
        btnCalcular = findViewById(R.id.btn_calcular_dog);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {

                    String txt = txtIdade.getText().toString();

                    if(txt.isEmpty()){
                        txtResultado.setTextColor(Color.GRAY);
                        txtResultado.setText("Favor informar a idade do cachorro.");
                    } else {
                        int idadeDog = Integer.valueOf(txtIdade.getText().toString()).intValue();
                        int resultado = idadeDog * 7;
                        txtResultado.setTextColor(Color.WHITE);
                        txtResultado.setText(String.valueOf(resultado).toString());
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }
}
