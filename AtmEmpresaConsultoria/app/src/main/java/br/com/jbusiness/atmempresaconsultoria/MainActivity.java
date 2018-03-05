package br.com.jbusiness.atmempresaconsultoria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView ivEmpresa;
    private ImageView ivClientes;
    private ImageView ivServicos;
    private ImageView ivContato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivEmpresa = findViewById(R.id.iv_menu_empresa_id);
        ivClientes = findViewById(R.id.iv_menu_clientes_id);
        ivServicos = findViewById(R.id.iv_menu_servicos_id);
        ivContato = findViewById(R.id.iv_menu_contato_id);

        ivEmpresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, EmpresaActivity.class));
            }
        });

        ivClientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Clientes", Toast.LENGTH_SHORT).show();
            }
        });

        ivServicos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Serviços", Toast.LENGTH_SHORT).show();
            }
        });

        ivContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Contato", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
