/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanchonete;

/**
 *
 * @author Leonardo
 */
public class Hamburguer extends Produto {

    private Boolean novo;

    public Boolean getNovo() {
        return novo;
    }

    public void setNovo(Boolean novo) {
        this.novo = novo;
    }

    public String DescricaoCardapio() {
        String retorno;
        if (this.getPreco() > 20) {
            novo = true;
            retorno = super.descricaoCardapio() + this.novo;
        } else {
            retorno = super.descricaoCardapio();
        }
        
        return retorno;
    }
}
