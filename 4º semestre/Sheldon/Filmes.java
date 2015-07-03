/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonecosdosheldon;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrador
 */
public class Filmes extends InformacoesBonecos {

    private String nome_filme;
    List<InformacoesBonecos> personagens;

    public Filmes() {
        this.personagens = new ArrayList<InformacoesBonecos>();
    }

    public String getNome_filme() {
        return nome_filme;
    }

    public void setNome_filme(String nome_filme) {
        this.nome_filme = nome_filme;
    }

    public List<InformacoesBonecos> getPersonagens() {
        return personagens;
    }

    public void setPersonagens(List<InformacoesBonecos> personagens) {
        this.personagens = personagens;
    }

    public String Personagens() {
        String retorno;

        retorno = "Filme:" + nome_filme + "\n" + "Personagens:" + "\n";

        for (InformacoesBonecos informacoesBonecos : personagens) {

            retorno = retorno + informacoesBonecos.getNome_boneco() + "\t"+ informacoesBonecos.getEdit_boneco() + "\n";
        }

        return retorno;
    }
    
}
