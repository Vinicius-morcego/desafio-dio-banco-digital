package model;

public class ContaCorrente extends Conta{

    public void imprimirExtrato(){
        System.out.println("#######CONTA CORRENTE#######");
        System.out.println("Agência : "+super.agencia);
        System.out.println("Conta   : "+super.numero);
        System.out.println("Saldo   : "+super.valor);
    }
}
