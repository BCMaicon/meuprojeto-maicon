
package lanchonete;

import java.util.List;
import java.util.ArrayList;


public class Filial {
String cidade;
double preco_medio_lanches,faturamento;
Integer qtde_vendida;
Cozinheiro cozinheiros;
Gerente gerentes;
Caixa caixas;
List <Cozinheiro> listacoz;
List <Caixa> listacaixa;
Filial (){
    listacoz = new ArrayList<>();
    listacaixa = new ArrayList<>();
}

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public double getPreco_medio_lanches() {
        return preco_medio_lanches;
    }

    public void setPreco_medio_lanches(double preco_medio_lanches) {
        this.preco_medio_lanches = preco_medio_lanches;
    }

    public Integer getQtde_vendida() {
        return qtde_vendida;
    }

    public void setQtde_vendida(Integer qtde_vendida) {
        this.qtde_vendida = qtde_vendida;
    }

    public Cozinheiro getCozinheiros() {
        return cozinheiros;
    }

    public void setCozinheiros(Cozinheiro cozinheiros) {
        this.cozinheiros = cozinheiros;
    }

    public Gerente getGerentes() {
        return gerentes;
    }

    public void setGerentes(Gerente gerentes) {
        this.gerentes = gerentes;
    }

    public Caixa getCaixas() {
        return caixas;
    }

    public void setCaixas(Caixa caixas) {
        this.caixas = caixas;
    }
public Double futuramento_medio(){
    return preco_medio_lanches * qtde_vendida;
}
}
