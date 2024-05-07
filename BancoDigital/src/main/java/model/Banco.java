package model;
import lombok.*;

import java.util.List;


@AllArgsConstructor
@Data
public class Banco {
    private String nome;
    private List<Cliente> clientes;

    public void imprimirClientes(List<Cliente> clientes){
        for (Cliente cliente : clientes) {
            System.out.println("Cliente : "+cliente.getNome());
        }
    }
}

