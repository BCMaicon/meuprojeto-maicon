/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonecosdosheldon;

/**
 *
 * @author Aluno
 */
public class Vilao extends InformacoesBonecos {

    private String arqui_inimigo;

    public String getArqui_inimigo() {
        return arqui_inimigo;
    }

    public void setArqui_inimigo(String arqui_inimigo) {
        this.arqui_inimigo = arqui_inimigo;
    }

    public String Vilao() {
        String retorno;

        retorno = super.getNome_boneco() + " - " + "arqui_inimigo" + super.InformacoesGeraisBoneco();
        return retorno;
    }
}
