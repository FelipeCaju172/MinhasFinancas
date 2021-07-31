package com.example.financas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class TelaInicial extends AppCompatActivity {

    EditText editDescricao, editStatus,editVencimento, editPagamento;
    Button btnPesquisar;
    ListView listViewFinancas;
    FloatingActionButton btnCadastrar;

    BancoDados db = new BancoDados(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.telainicial);

        btnCadastrar = (FloatingActionButton)  findViewById(R.id.btnAdd);

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaInicial.this, CadastroDespesa.class);

                startActivity(intent);
            }
        });
    }



}