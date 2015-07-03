/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonecosdosheldon;

/**
 *
 * @author Administrador
 */
public class InformacoesBonecos {

    private String nome_boneco;
    private String edit_boneco;
    private String data_pri_apa;
    private String super_poder;

    public String getNome_boneco() {
        return nome_boneco;
    }

    public void setNome_boneco(String nome_boneco) {
        this.nome_boneco = nome_boneco;
    }

    public String getEdit_boneco() {
        return edit_boneco;
    }

    public void setEdit_boneco(String edit_boneco) {
        this.edit_boneco = edit_boneco;
    }

    public String getData_pri_apa() {
        return data_pri_apa;
    }

    public void setData_pri_apa(String data_pri_apa) {
        this.data_pri_apa = data_pri_apa;
    }

    public String getSuper_poder() {
        return super_poder;
    }

    public void setSuper_poder(String super_poder) {
        this.super_poder = super_poder;
    }

    public String InformacoesGeraisBoneco() {
        String retorno;

        retorno = "\n" + this.nome_boneco + " - " + "Editora" + this.edit_boneco;
        return retorno;

    }

}
