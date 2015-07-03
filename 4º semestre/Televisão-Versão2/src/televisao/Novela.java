/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package televisao;

/**
 *
 * @author Aluno
 */
public class Novela {
    
    private String Título, perdur,dataprimcap,dataúltcap,horaexibição,autornov; 
    private Emissora emissora;
    private int ibope;
    private boolean violencia, sexo, drogas;

    public String getTítulo() {
        return Título;
    }

    public void setTítulo(String Título) {
        this.Título = Título;
    }

    public String getPerdur() {
        return perdur;
    }

    public void setPerdur(String perdur) {
        this.perdur = perdur;
    }

    public String getDataprimcap() {
        return dataprimcap;
    }

    public void setDataprimcap(String dataprimcap) {
        this.dataprimcap = dataprimcap;
    }

    public String getDataúltcap() {
        return dataúltcap;
    }

    public void setDataúltcap(String dataúltcap) {
        this.dataúltcap = dataúltcap;
    }

    public String getHoraexibição() {
        return horaexibição;
    }

    public void setHoraexibição(String horaexibição) {
        this.horaexibição = horaexibição;
    }

    public String getAutornov() {
        return autornov;
    }

    public void setAutornov(String autornov) {
        this.autornov = autornov;
    }

    public Emissora getEmissora() {
        return emissora;
    }

    public void setEmissora(Emissora emissora) {
        this.emissora = emissora;
    }


    public int getIbope() {
        return ibope;
    }

    public void setIbope(int ibope) {
        this.ibope = ibope;
    }

    public boolean isViolencia() {
        return violencia;
    }

    public void setViolencia(boolean violencia) {
        this.violencia = violencia;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public boolean isDrogas() {
        return drogas;
    }

    public void setDrogas(boolean drogas) {
        this.drogas = drogas;
    }
    
    
    
    
    
}
