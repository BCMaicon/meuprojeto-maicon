/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package televisãorev;

/**
 *
 * @author Red bull
 */
public class EmissoraRev {
    String nome;                                                                                     
    boolean exibicao;
    String endereco;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isExibicao() {
        return exibicao;
    }

    public void setExibicao(boolean exibicao) {
        this.exibicao = exibicao;
    }
   
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    } 
}

