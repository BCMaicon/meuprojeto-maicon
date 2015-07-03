
package modelo;

import java.util.Date;


public class ranking {
    private Integer id;
    private jogador jog;
    private Integer pontos;
    private Date data;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public jogador getJog() {
        return jog;
    }

    public void setJog(jogador jog) {
        this.jog = jog;
    }
    
    public Integer getPontos() {
        return pontos;
    }

    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
