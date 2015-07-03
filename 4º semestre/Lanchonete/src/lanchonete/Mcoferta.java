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
public class Mcoferta extends Produto {

    private Bebida bebida;
    private BatataFrita batata;
    private Hamburguer hamburguer;

    public Bebida getBebida() {
        return bebida;
    }

    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }

    public BatataFrita getBatata() {
        return batata;
    }

    public void setBatata(BatataFrita batata) {
        this.batata = batata;
    }

    public Hamburguer getHamburguer() {
        return hamburguer;
    }

    public void setHamburguer(Hamburguer hamburguer) {
        this.hamburguer = hamburguer;
    }

    public Double ValorEconomia() {
        Double retorno;

        retorno = (this.batata.getPreco() + this.bebida.getPreco() + this.hamburguer.getPreco()) - this.getPreco();
        return retorno;
    }

    public String DescricaoOferta() {
        String retorno;

        retorno = this.hamburguer.getNome() + "-" + this.batata.getNome() + "" + this.batata.getTamanho() +  "-"  + this.bebida.getNome() + "" + this.bebida.getQuantidade() + this.bebida.getUnidadedemedida();
        return retorno;
    }
}
