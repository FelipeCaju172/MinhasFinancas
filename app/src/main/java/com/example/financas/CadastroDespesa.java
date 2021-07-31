package com.example.financas;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class CadastroDespesa extends AppCompatActivity {

    EditText editDescricao, editStatus, editParcela, editVencimento, editPagamento, editValor;
    Button btnCadastrar;


    BancoDados db = new BancoDados(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastrodespesa);

        editDescricao = (EditText)findViewById(R.id.edit_descricao);
        editStatus = (EditText)findViewById(R.id.edit_status);
        editParcela = (EditText)findViewById(R.id.edit_parcelas);
        editVencimento = (EditText)findViewById(R.id.edit_datainicial);
        editPagamento = (EditText)findViewById(R.id.edit_datafinal);
        editValor = (EditText)findViewById(R.id.edit_valor);
//
        btnCadastrar= (Button) findViewById(R.id.btn_cadastrar);
        System.out.println("1");

        db.addFinanca(new Financa("Energia", 1, "21/05/2021", "20/05/2021", 50.0, 0));
        db.addFinanca(new Financa("Agua", 2, "14/03/2021", "21/05/2021", 55.0, 1));
        db.addFinanca(new Financa("Internet", 1, "16/06/2021", "22/05/2021", 60.0, 0));
        db.addFinanca(new Financa("Luz", 3, "24/07/2021", "23/05/2021", 70.0, 1));
System.out.println("2");

     Toast.makeText(CadastroDespesa.this, "Salvo", Toast.LENGTH_LONG).show();
        System.out.println("3");
    }

}