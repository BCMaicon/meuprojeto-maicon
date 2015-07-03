package televisao;

public class Ator {

    private String nome;
    private String dat_nas;
    private Integer qtd_nov;
    private String email;
    private String nome_art;
    private double sal_mensal;
    private double cache_part;
    private String cidade;
    private String endereco;
    private String bairro;
    private String estado;
    private String status;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDat_nas() {
        return dat_nas;
    }

    public void setDat_nas(String dat_nas) {
        this.dat_nas = dat_nas;
    }

    public Integer getQtd_nov() {
        return qtd_nov;
    }

    public void setQtd_nov(Integer qtd_nov) {
        this.qtd_nov = qtd_nov;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome_art() {
        return nome_art;
    }

    public void setNome_art(String nome_art) {
        this.nome_art = nome_art;
    }

    public Double getSal_mensal() {
        return sal_mensal;
    }

    public void setSal_mensal(double sal_mensal) {
        this.sal_mensal = sal_mensal;
    }

    public double getCache_part() {
        return cache_part;
    }

    public void setCache_part(Double cache_part) {
        this.cache_part = cache_part;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String Status() {
        if (qtd_nov <= 3 && sal_mensal <= 5000) {
            return "Calouro";
        } else if (qtd_nov == 6) {
            return "Revelação";
        } else if (qtd_nov == 6 && sal_mensal >= 30000) {
            return "Jóia";
        } else if (qtd_nov >= 9 && sal_mensal < 30000) {
            return "Elenco de apoio";
        } else if (sal_mensal >= 30000 && sal_mensal <= 100000) {
            return "Elenco prinicpal";
        } else if (sal_mensal > 100000) {
            return "Estrela";
        }else{
            return "Elenco regular";
        }
        
    }
}

