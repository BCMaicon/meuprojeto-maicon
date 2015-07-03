/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.jogador;
import modelo.ranking;

/**
 *
 * @author Aluno
 */
public class RankingDAO {

    public Boolean inserir(ranking r) {
        Boolean retorno;
        String sql = "INSERT INTO ranking(login,pontos,data) VALUES(?,?,?)";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
            pst.setString(1, r.getJog().getLogin());
            pst.setInt(2, r.getPontos());
            pst.setDate(3, new Date(r.getData().getTime()));
            pst.executeUpdate();
            retorno = true;
        } catch (Exception ex) {
            ex.printStackTrace();
            retorno = false;
        }
        return retorno;

    }

    public List<ranking> listar() {

        List<ranking> lista = new ArrayList<ranking>();

        String sql = "SELECT * FROM ranking ORDER BY pontos desc";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);

        try {
            //Executo o sql e jogo num ResultSet
            ResultSet res = pst.executeQuery();
            // Enquanto tiver REGISTRO eu vou relacionar com minha Classe jogador e adicionar na lista
            while (res.next()) {
                
                ranking rank = new ranking();
                jogador jog = new jogador();
                jog.setLogin(res.getString("login"));
                rank.setJog(jog);
                //rank.getJog().setLogin(res.getString("login"));
                rank.setPontos(res.getInt("pontos"));
                rank.setData(res.getDate("data"));
                lista.add(rank);
            }
        } catch (SQLException ex) {
            Logger.getLogger(JogadorDAO.class.getName()).log(Level.SEVERE, null, ex);

        }
        return lista;
    }
}
