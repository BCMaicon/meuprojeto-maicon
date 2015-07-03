package maiconradio;


public class Radio {

    private String nome, dat_criacao, cidade_local;
    private Double aud_med_dia;
    private Boolean transmiteFM, transmiteAM;
    private Double vanuncio = 0.0;
    private int qtdanuncio = 1;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDat_criacao() {
        return dat_criacao;
    }

    public void setDat_criacao(String dat_criacao) {
        this.dat_criacao = dat_criacao;
    }

    public String getCidade_local() {
        return cidade_local;
    }

    public void setCidade_local(String cidade_local) {
        this.cidade_local = cidade_local;
    }

    public Double getAud_med_dia() {
        return aud_med_dia;
    }

    public void setAud_med_dia(Double aud_med_dia) {
        this.aud_med_dia = aud_med_dia;
    }

    public Boolean isTransmiteFM() {
        return transmiteFM;
    }

    public void setTransmiteFM(Boolean transmiteFM) {
        this.transmiteFM = transmiteFM;
    }

    public Boolean isTransmiteAM() {
        return transmiteAM;
    }

    public void setTransmiteAM(Boolean transmiteAM) {
        this.transmiteAM = transmiteAM;
    }

    public Double ValorAnuncioRadio() {

        if (aud_med_dia <= 15) {
            vanuncio = 450.00;
        } else if (aud_med_dia >= 15.01 && aud_med_dia <= 30) {
            vanuncio = 700.00;
        } else {
            vanuncio = 1200.00;
        }
        return vanuncio;
    }

    public Double PacotesAnuncio() {
        Double total;
        if (qtdanuncio > 40) {
            total = ((aud_med_dia / vanuncio) * qtdanuncio) * 0.15;
        } else {
            total = (aud_med_dia / vanuncio) * qtdanuncio;
        }
        return total;
    }
        
   
}
