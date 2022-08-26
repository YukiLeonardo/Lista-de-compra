package br.unigran.listadecompra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText nome;
    EditText marca;
    EditText quant;
    ArrayList dados;
    ListView listagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nome = findViewById(R.id.id_nome);
        marca = findViewById(R.id.id_marca);
        quant = findViewById(R.id.id_quant);
        dados = new ArrayList();
        listagem = findViewById(R.id.id_list);
        ArrayAdapter adapter = new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,dados);
        listagem.setAdapter(adapter);
    }
    public void salvar(View view){
        ListaCompra listacompra = new ListaCompra();
        listacompra.setNome(nome.getText().toString());
        listacompra.setMarca(marca.getText().toString());
        listacompra.setQuant(quant.getText().toString());
        dados.add(listacompra);
        Toast.makeText(this,"Salva com Sucesso",Toast.LENGTH_LONG);
    }
}