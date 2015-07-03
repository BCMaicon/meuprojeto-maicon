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
public class Bebida extends Produto {
    
    private Double quantidade;
    private String unidadedemedida;

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public String getUnidadedemedida() {
        return unidadedemedida;
    }

    public void setUnidadedemedida(String unidadedemedida) {
        this.unidadedemedida = unidadedemedida;
    }
    
    public String Cardapio (){
        return super.descricaoCardapio() + this.getQuantidade()+" "+this.getUnidadedemedida();
    }
}
