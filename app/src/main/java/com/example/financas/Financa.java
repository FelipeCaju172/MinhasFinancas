package com.example.financas;

import java.util.ArrayList;
import java.util.Date;

public class Financa {



    int codigo, parcela;
    String descricao;
    int status;
    String vencimento, pagamento;
    Double valor;

    public Financa(){
    }

    public Financa(int _codigo, int _parcela, String _descricao, int _status, String _vencimento, String _pagamento, Double _valor){

        this.codigo = _codigo;
        this.parcela = _parcela;
        this.descricao = _descricao;
        this.status = _status;
        this.vencimento = _vencimento;
        this.pagamento = _pagamento;
        this.valor = _valor;

    }
    public Financa(String _descricao, int _parcela, String _vencimento, String _pagamento, Double _valor, int _status){


        this.parcela = _parcela;
        this.descricao = _descricao;
        this.status = _status;
        this.vencimento = _vencimento;
        this.pagamento = _pagamento;
        this.valor = _valor;

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getParcela() {
        return parcela;
    }

    public void setParcela(int parcela) {
        this.parcela = parcela;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int isStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
