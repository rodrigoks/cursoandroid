package br.com.jbusiness.signos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listaSignos;
    private String[] signos = {
            "Áries",
            "Touro",
            "Gêmeos",
            "Câncer",
            "Leão",
            "Virgem",
            "Libra",
            "Escopião",
            "Sagitário",
            "Capricórnio",
            "Aquário",
            "Peixes"
    };
    private String[] perfis = {
            "Perfil Áries",
            "Perfil Touro",
            "Perfil Gêmeos",
            "Perfil Câncer",
            "Perfil Leão",
            "Perfil Virgem",
            "Perfil Libra",
            "Perfil Escopião",
            "Perfil Sagitário",
            "Perfil Capricórnio",
            "Perfil Aquário",
            "Perfil Peixes"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaSignos = findViewById(R.id.lv_lista_id);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                signos
        );

        listaSignos.setAdapter(adaptador);

        listaSignos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), perfis[i], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
