package model;

public class Poupanca extends Conta{
    @Override
    public void imprimirExtrato(){
        System.out.println("#######CONTA POUPANÇA#######");
        System.out.println("Agência : "+super.agencia);
        System.out.println("Conta   : "+super.numero);
        System.out.println("Saldo   : "+super.valor);
    }
}
