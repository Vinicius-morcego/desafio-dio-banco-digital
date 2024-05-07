import interfaces.IConta;
import model.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Conta corrente = new ContaCorrente();
        Conta poupanca = new Poupanca();
        corrente.depositar(new BigDecimal(100));
        corrente.imprimirExtrato();
        corrente.transferir(new BigDecimal(50), poupanca);
        poupanca.imprimirExtrato();
        corrente.imprimirExtrato();
        corrente.sacar(new BigDecimal(20));
        corrente.imprimirExtrato();
        Cliente denilson = new Cliente();
        denilson.setNome("Denilson Vitorino");
        Cliente igor = new Cliente();
        igor.setNome("Igor");
        List<Cliente> clientes = new ArrayList<Cliente>();
        clientes.add(denilson);
        clientes.add(igor);
        Banco banco = new Banco("Banco Inter", clientes);
        System.out.println("Banco : "+banco.getNome());
        banco.imprimirClientes(clientes);


    }

}