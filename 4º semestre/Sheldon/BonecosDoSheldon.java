/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonecosdosheldon;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class BonecosDoSheldon {

    
    public static void main(String[] args) {
        
        Heroi h = new Heroi();
        
        h.setNome_boneco("Hulk");
        h.setEdit_boneco("Marvel");
        h.setData_pri_apa("1962");
        h.setSuper_poder("Força");
        h.setAlterego("Bruce Banner");
        h.setPreferido(false);
        
        Heroi h2 = new Heroi();
        h2.setNome_boneco("Capitão América");
        h2.setEdit_boneco("Marvel");
        h2.setData_pri_apa("1940");
        h2.setSuper_poder("Força, Agilidade, Velocidade");
        h2.setAlterego("Steve Rogers");
        h2.setPreferido(false);
        
        Heroi h3 = new Heroi();
        h3.setNome_boneco("Homem de Ferro");
        h3.setEdit_boneco("Marvel");
        h3.setData_pri_apa("1963");
        h3.setSuper_poder("Super-Força, Inteligência, Disparos de Energia");
        h3.setAlterego("Tony Stark");
        h3.setPreferido(false);
        
        Heroi h4 = new Heroi();
        h4.setNome_boneco("Batman");
        h4.setEdit_boneco("DC");
        h4.setData_pri_apa("1939");
        h4.setSuper_poder("Inteligência, Estratégia, Mestre em Artes Marciais");
        h4.setAlterego("Tony Stark");
        h4.setPreferido(false);
        
        Heroi h5 = new Heroi();
        h5.setNome_boneco("Superman");
        h5.setEdit_boneco("DC");
        h5.setData_pri_apa("1938");
        h5.setSuper_poder("Agilidade Super-Humana, Sopro Congelante, Visão raio-x");
        h5.setAlterego("Clark Kent");
        h5.setPreferido(false);
        
        Heroi h6 = new Heroi();
        h6.setNome_boneco("Lanterna Verde");
        h6.setEdit_boneco("DC");
        h6.setData_pri_apa("1960");
        h6.setSuper_poder("Possui um anel com poderes");
        h6.setAlterego("Alan Scott");
        h6.setPreferido(true);
        
        Vilao v = new Vilao();
        v.setNome_boneco("Loki");
        v.setEdit_boneco("Marvel");
        v.setData_pri_apa("1962");
        v.setSuper_poder("Imortalidade Relativa, Força, Agilidade");
        v.setArqui_inimigo("Os Vingadores");
        
        Vilao v1 = new Vilao();
        v1.setNome_boneco("Coringa");
        v1.setEdit_boneco("DC");
        v1.setData_pri_apa("1940");
        v1.setSuper_poder("Inteligente,Conhecimento em: Artes, Química, Engenharia e Genética");
        v1.setArqui_inimigo("Batman");
        
        Vilao v2 = new Vilao();
        v2.setNome_boneco("Lex Luthor");
        v2.setEdit_boneco("DC");
        v2.setData_pri_apa("1940");
        v2.setSuper_poder("Gênio, Utiliza armadura com incríveis poderes tecnológicos");
        v2.setArqui_inimigo("Superman");
                   
        Filmes f = new Filmes();
        f.setNome_filme("Vingadores 2");
        f.personagens.add(h);
        f.personagens.add(h2);
        f.personagens.add(h3);
        f.personagens.add(v);
        
        Filmes f2 = new Filmes();
        f2.setNome_filme("Batman vs Superman");
        f2.personagens.add(h4);
        f2.personagens.add(h5);
        f2.personagens.add(h6);
        f2.personagens.add(v1);
        f2.personagens.add(v2);
        
        JOptionPane.showMessageDialog(null, f.Personagens());
        JOptionPane.showMessageDialog(null, f2.Personagens());
    }

}
