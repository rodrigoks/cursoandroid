package br.com.jbusiness.atmempresaconsultoria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class EmpresaActivity extends AppCompatActivity {

    private TextView tvDetalhesEmpresa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empresa);

        tvDetalhesEmpresa = findViewById(R.id.tv_detalhes_empresa_id);
        tvDetalhesEmpresa.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris et elit eu felis varius elementum ultricies ut mi. Praesent sagittis turpis quis nisl pretium, quis consequat enim dignissim. Integer hendrerit feugiat faucibus. Suspendisse sapien eros, ullamcorper ut fermentum non, accumsan at purus. Aliquam tincidunt vitae metus nec tincidunt. Pellentesque pretium, quam ac rutrum tincidunt, nibh ligula viverra urna, ut fermentum nisi sapien sed lectus. Phasellus ut mauris nisi. Donec eu odio sollicitudin, pellentesque nisl a, convallis eros. Duis rhoncus nibh eu porta malesuada. Nam pellentesque molestie arcu vel efficitur. Sed vitae massa feugiat, eleifend arcu eu, semper nisi. Sed quis metus aliquet, congue urna scelerisque, vulputate velit. Interdum et malesuada fames ac ante ipsum primis in faucibus. Aenean ultrices enim libero, vel lacinia erat pellentesque at. Suspendisse potenti. Vestibulum nec venenatis velit.\n" +
                "\n" +
                "Nullam sodales cursus dui a accumsan. Maecenas egestas leo accumsan ante volutpat, at condimentum augue lacinia. Nullam nibh leo, imperdiet a pretium non, bibendum nec quam. Nunc egestas elit quis nisi semper mattis. Phasellus sed leo at ex scelerisque pretium. Donec consequat pretium faucibus. Praesent scelerisque efficitur pretium. Quisque viverra, ex sed mollis congue, lorem mauris ultricies ante, sed mollis neque sem eu purus. Nullam et tristique erat.\n" +
                "\n" +
                "Suspendisse egestas elit ac velit accumsan condimentum. Aenean auctor commodo lectus, in vestibulum augue sollicitudin vel. Duis sit amet viverra mauris. Sed dolor eros, aliquet quis erat eu, pharetra interdum lacus. Donec sit amet mi consequat, finibus ante ac, elementum elit. Pellentesque accumsan sapien non vestibulum varius. Vestibulum pulvinar eu erat ut venenatis. Ut justo nulla, laoreet sit amet convallis ut, ultrices eu mauris. Cras sagittis consequat dolor, non facilisis tortor sollicitudin quis. Nam rutrum enim nec pellentesque aliquet. Praesent fermentum risus et ante eleifend, non suscipit eros consectetur. Curabitur non magna elit. Curabitur consectetur neque in nibh interdum mollis. Aenean in urna lacus. Vestibulum ligula purus, viverra et ante ac, mollis sagittis nulla.\n" +
                "\n" +
                "Praesent et dolor vehicula diam dictum lacinia. Morbi et rhoncus dui. Etiam vel ligula ut enim finibus lobortis ut eu tortor. In sed nibh blandit purus hendrerit tristique sit amet eget mi. Suspendisse potenti. Etiam aliquet sem urna, a varius diam tincidunt vitae. In auctor justo sit amet scelerisque accumsan. Vivamus quis ex dictum sem iaculis sodales non sed ex. Suspendisse at maximus erat. Fusce ultrices euismod pharetra.\n" +
                "\n" +
                "Quisque a turpis tellus. Mauris quis fringilla augue. Vivamus nulla metus, varius vel mauris quis, venenatis rhoncus tellus. Vivamus vitae fermentum nulla, ac placerat quam. Quisque sed eros tristique, interdum urna quis, dapibus lorem. Aenean in lacus rutrum leo sodales mollis. Sed suscipit tellus non sem vestibulum aliquam. Nulla nisi nisl, porta auctor congue eu, luctus et justo. Maecenas hendrerit vulputate condimentum. Pellentesque posuere, massa nec molestie molestie, ipsum ligula convallis quam, sit amet sagittis nisl felis sit amet sem. Praesent cursus eu urna vitae varius. In id malesuada orci. Vivamus mattis, erat a cursus eleifend, urna odio finibus sapien, laoreet auctor lacus massa sed nunc. Integer nunc ipsum, pretium eu dolor vitae, condimentum finibus arcu.");
    }

}
