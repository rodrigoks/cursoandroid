package br.com.jbusiness.sharedpreferences;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txtNome;
    private Button btnSalvar;
    private TextView txtResultado;
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    private static final String ARQUIVO_PREFERENCIA = "ArquivoPreferencia";
    private static final String NOME = "nome";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNome = findViewById(R.id.et_nome_id);
        btnSalvar = findViewById(R.id.btn_salvar_id);
        txtResultado = findViewById(R.id.tv_resultado_id);

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sharedPreferences = getSharedPreferences(ARQUIVO_PREFERENCIA, 0);
                editor = sharedPreferences.edit();

                if("".equals(txtNome.getText().toString()))
                    Toast.makeText(MainActivity.this, "Favor informar um nome", Toast.LENGTH_SHORT).show();
                else {
                    editor.putString(NOME, txtNome.getText().toString());
                    editor.commit();
                    txtResultado.setText("Olá, " + txtNome.getText().toString());
                }
            }
        });

        // Recuperando informacoes
        sharedPreferences = getSharedPreferences(ARQUIVO_PREFERENCIA, 0);
        if(sharedPreferences.contains(NOME)){
            String usuario = sharedPreferences.getString(NOME, "usuário não definido");
            txtResultado.setText("Olá, " + usuario);
        } else {
            txtResultado.setText("Olá, usuário não definido");
        }
    }
}
