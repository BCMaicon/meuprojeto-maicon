
package caixa_eletrônico;
import java.util.ArrayList;
import java.util.List;

public class ListaBanco {


    public static void main(String[] args) {
        List<Banco> banco = new ArrayList<Banco>();
        Banco b = new Banco();
        b.setNome("Nome do banco: Banco do Brasil");
        b.setNúmero("Número do banco: 456123");
        banco.add(b);
        b = new Banco();
        b.setNome("\nNome do banco: Bradesco");
        b.setNúmero("Número do banco: 789451");
        banco.add(b);
        
        for (Banco Banco : banco) {
            System.out.println(Banco.getNome());
            System.out.println(Banco.getNúmero());
        } 
    }
}
