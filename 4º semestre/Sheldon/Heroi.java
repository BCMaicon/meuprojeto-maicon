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
public class Heroi extends InformacoesBonecos {

    private String alterego;
    private Boolean preferido;

    public String getAlterego() {
        return alterego;
    }

    public void setAlterego(String alterego) {
        this.alterego = alterego;
    }

    public Boolean isPreferido() {
        return preferido;
    }

    public void setPreferido(Boolean preferido) {
        this.preferido = preferido;
    }

    public String Preferido() {

        String retorno = "";

        if (preferido == true) {
            retorno = super.InformacoesGeraisBoneco() + "(" + this.alterego + ")" + "\n"+ super.getNome_boneco() + " - BAZINGAAAAAAA";
        }else{
            retorno = super.InformacoesGeraisBoneco() + "(" + this.alterego + ")"; 
        }
        return retorno;
    }
}
