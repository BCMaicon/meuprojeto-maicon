/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Cidade;

/**
 *
 * @author Administrador
 */
public class CidadeDAO {
    
     public Boolean inserir(Cidade cidade) {
        Boolean retorno;
        // Monta o sql de insert na tabela
        String sql = "INSERT INTO Cidade(nome)" + "VALUES (?)";
        //Prepara a conexão do meu sql
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
            //insere os parâmetros
            pst.setString(1, cidade.getNome());
           //executa o sql
            pst.executeUpdate();
            retorno = true;
        } catch (Exception ex) {
            ex.printStackTrace();
            retorno = false;
        }
        return retorno;
    }

    public Boolean excluir(Cidade cidade) {
        Boolean retorno;
        // Monta o sql de insert na tabela
        String sql = "DELETE FROM Cidade WHERE CODIGO = ?";
        //Prepara a conexão do meu sql
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
            //insere os parâmetros
            pst.setInt(1, cidade.getCodigo());
            //executa o sql
            pst.executeUpdate();
            retorno = true;
        } catch (Exception ex) {
            ex.printStackTrace();
            retorno = false;
        }
        return retorno;
    }

    public List<Cidade> listar() {

        List<Cidade> lista = new ArrayList<Cidade>();

        String sql = "SELECT * FROM Cidade";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);

        try {
            //Executo o sql e jogo num ResultSet
            ResultSet res = pst.executeQuery();
            // Enquanto tiver REGISTRO eu vou relacionar com minha Classe jogador e adicionar na lista
            while (res.next()) {
                Cidade cidade = new Cidade();
                cidade.setCodigo(res.getInt("codigo"));
                cidade.setNome(res.getString("nome"));
          
                lista.add(cidade);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);

        }
        return lista;
    }
}
