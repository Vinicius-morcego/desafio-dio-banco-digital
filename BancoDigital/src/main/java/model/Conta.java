package model;

import interfaces.IConta;

import javax.swing.*;
import java.math.BigDecimal;

public abstract class Conta implements IConta {
    private static String AGENCIA_PADRAO = "123";
    private static int SEQUENCIAL = 1;
    protected BigDecimal valor = new BigDecimal(0);
    protected int numero = 0;
    protected String agencia;

    public Conta(){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }


    @Override
    public void depositar(BigDecimal valor) {
        this.valor = this.valor.add(valor);
    }

    @Override
    public void sacar(BigDecimal valor) {
        this.valor = this.valor.subtract(valor);
    }

    @Override
    public void transferir(BigDecimal valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
}