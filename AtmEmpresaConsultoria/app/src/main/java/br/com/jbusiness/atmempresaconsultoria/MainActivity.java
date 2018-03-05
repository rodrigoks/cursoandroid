package br.com.jbusiness.atmempresaconsultoria;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

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
                startActivity(new Intent(MainActivity.this, ClientesActivity.class));
            }
        });

        ivServicos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ServicosActivity.class));
            }
        });

        ivContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ContatoActivity.class));
            }
        });
    }
}
