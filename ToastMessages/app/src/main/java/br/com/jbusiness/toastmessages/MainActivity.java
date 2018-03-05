package br.com.jbusiness.toastmessages;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnCliqueAqui;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCliqueAqui = findViewById(R.id.btn_clique_aqui);

        btnCliqueAqui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Exibindo mensagens de teste Toast!", Toast.LENGTH_LONG).show();
            }
        });
    }
}
