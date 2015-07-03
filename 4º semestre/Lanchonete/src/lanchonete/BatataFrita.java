/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanchonete;

/**
 *
 * @author big
 */
public class BatataFrita extends Produto {

    private String tamanho;

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String DescricaoCardapio() {
        String retorno;

        retorno = super.descricaoCardapio() + this.tamanho;
        return retorno;

    }

}
