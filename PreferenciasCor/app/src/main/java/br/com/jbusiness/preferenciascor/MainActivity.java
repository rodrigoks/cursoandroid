package br.com.jbusiness.preferenciascor;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout layout;
    private RadioGroup rGroup;
    private RadioButton rbCor;
    private Button btnSalvar;
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    private static final String ARQUIVO_PREFERENCIAS = "ArquivoPreferencias";
    private static final String COR = "cor";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = findViewById(R.id.layout_id);
        rGroup = findViewById(R.id.rg_opcoes_id);
        btnSalvar = findViewById(R.id.btn_salvar_id);

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int escolhaId = rGroup.getCheckedRadioButtonId();

                if(escolhaId > 0) {

                    rbCor = findViewById(escolhaId);

                    sharedPreferences = getSharedPreferences(ARQUIVO_PREFERENCIAS, 0);
                    editor = sharedPreferences.edit();
                    String cor = rbCor.getText().toString();
                    editor.putString(COR, cor);
                    editor.commit();

                    setBackground(cor);

                }

            }
        });

        sharedPreferences = getSharedPreferences(ARQUIVO_PREFERENCIAS, 0);
        if(sharedPreferences.contains(COR)){
            String cor = sharedPreferences.getString(COR, "");
            setBackground(cor);
        }
    }

    /**
     * Setar a cor de background
     *
     * @param cor
     */
    private void setBackground(String cor){

        switch (cor) {
            case "Azul":
                layout.setBackgroundColor(Color.parseColor("#495B7C"));
                break;
            case "Laranja":
                layout.setBackgroundColor(Color.parseColor("#FFCE26"));
                break;
            case "Verde":
                layout.setBackgroundColor(Color.parseColor("#009670"));
                break;
            default:
                layout.setBackgroundColor(Color.parseColor("#FFFFFF"));
                break;

        }

    }
}
