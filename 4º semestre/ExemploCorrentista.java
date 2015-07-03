package caixa_eletrônico;

import java.util.List;
import java.util.ArrayList;


public class ExemploCorrentista {   

    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<Cliente>();
        Cliente c = new Cliente();
        c.setNome("Nome: Maicon");
        c.setCpf("CPF: 037.595.990-44");
        
        c = new Cliente();
        c.setNome("Nome: Marina");
        c.setCpf("CPF: 037.038.820-85");
        clientes.add(c);
        for (Cliente cliente : clientes) {
            System.out.println(cliente.getNome());
            System.out.println(cliente.getCpf());
        }      
        
             
    }
    
}
