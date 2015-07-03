/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Aluno
 */
public class JogoCompleto {

    private jogador jog;
    private Integer pular;
    private Integer cartas;
    private Integer placas;
    private Integer ganhos;

    public JogoCompleto() {
        this.jog = null;
        this.cartas = 1;
        this.pular = 1;
        this.placas = 1;
        this.ganhos = 0;

    }

    public jogador getJog() {
        return jog;
    }

    public void setJog(jogador jog) {
        this.jog = jog;
    }

    public Integer getPular() {
        return pular;
    }

    public void setPular(Integer pular) {
        this.pular = pular;
    }

    public Integer getCartas() {
        return cartas;
    }

    public void setCartas(Integer cartas) {
        this.cartas = cartas;
    }

    public Integer getPlacas() {
        return placas;
    }

    public void setPlacas(Integer placas) {
        this.placas = placas;
    }

    public Integer getGanhos() {
        return ganhos;
    }

    public void setGanhos(Integer ganhos) {
        this.ganhos = ganhos;
    }
}
