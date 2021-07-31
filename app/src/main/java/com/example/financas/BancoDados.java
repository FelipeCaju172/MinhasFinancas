package com.example.financas;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class BancoDados extends SQLiteOpenHelper {

    private static BancoDados bancoDados;

    private static final int VERSAO_BANCO = 1;
    private static final String BANCO_FINANCAS = "bd_minhas_financas";

    private static final String TABELA_FINANCAS = "tb_minhas_financas";
    private static final String COLUNA_CODIGO = "codigo";
    private static final String COLUNA_DESCRICAO = "descricao";
    private static final String COLUNA_PARCELA = "parcela";
    private static final String COLUNA_VENCIMENTO ="data_vencimento";
    private static final String COLUNA_PAGAMENTO = "data_pagamento";
    private static final String COLUNA_VALOR = "valor";
    private static final String COLUNA_STATUS= "status";

    private static final DateFormat dataFormat = new SimpleDateFormat("dd-MM-yyyy");
    
    public BancoDados(Context context) {
        super(context, BANCO_FINANCAS, null, VERSAO_BANCO);
    }

    public static BancoDados instanceOfDatabase(Context context){

        if(bancoDados == null)
            bancoDados = new BancoDados(context);

         return bancoDados;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        StringBuilder QUERY_COLUNA;
        QUERY_COLUNA = new StringBuilder()
                .append("CREATE TABLE IF NOT EXISTS ")
                .append(TABELA_FINANCAS)
                .append("(")
                .append(COLUNA_CODIGO)
                .append(" INTEGER PRIMARY KEY AUTOINCREMENT, ")
                .append(COLUNA_DESCRICAO)
                .append(" TEXT, ")
                .append(COLUNA_PARCELA)
                .append(" INTEGER, ")
                .append(COLUNA_VENCIMENTO)
                .append(" TEXT, ")
                .append(COLUNA_PAGAMENTO)
                .append(" TEXT, ")
                .append(COLUNA_VALOR)
                .append(" REAL, ")
                .append(COLUNA_STATUS)
                .append(" INTEGER)");

        System.out.println(QUERY_COLUNA);

           db.execSQL(QUERY_COLUNA.toString());

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void addFinanca(Financa financa){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();


        values.put("Nome","Teste");
//        values.put(COLUNA_DESCRICAO, financa.getDescricao());
//        values.put(COLUNA_PARCELA, financa.getParcela());
//        values.put(COLUNA_VENCIMENTO, financa.getVencimento());
//        values.put(COLUNA_PAGAMENTO, financa.getPagamento());
//        values.put(COLUNA_VALOR, financa.getValor());
//        values.put(COLUNA_STATUS, financa.isStatus());

        db.insert(DbHelper.TABELA_FINANCAS, null, values);
        db.close();

    }

    public List<Financa> buscaFinancas(){

        SQLiteDatabase db = this.getReadableDatabase();

        try(Cursor result = db.rawQuery("SELECT * FROM "+TABELA_FINANCAS, null))
        {
            if(result.getCount() !=0)
            {
                ArrayList<Financa> listFinanca = new ArrayList<>();
                Financa f = new Financa();
                while (result.moveToNext())
                {
                    f.codigo = result.getInt(1);
                    f.descricao = result.getString(2);
                    f.parcela = result.getInt(3);
                    f.vencimento = result.getString(4);
                    f.pagamento = result.getString(5);
                    f.valor = result.getDouble(6);
                    f.status = result.getInt(7);
                    listFinanca.add(f);
                }
            }

        }

     return listFinanca;

    }




















}
