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
import modelo.Pessoa;


public class PessoaDAO {
     public Boolean inserir(Pessoa pessoa) {
        Boolean retorno;
        // Monta o sql de insert na tabela
        String sql = "INSERT INTO Pessoa(nome,sexo)" + "VALUES (?,?)";
        //Prepara a conexão do meu sql
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
            //insere os parâmetros
            pst.setString(1, pessoa.getNome());
            pst.setString(2, pessoa.getSexo());
           //executa o sql
            pst.executeUpdate();
            retorno = true;
        } catch (Exception ex) {
            ex.printStackTrace();
            retorno = false;
        }
        return retorno;
    }

    public Boolean excluir(Pessoa pessoa) {
        Boolean retorno;
        // Monta o sql de insert na tabela
        String sql = "DELETE FROM Pessoa WHERE CODIGO = ?";
        //Prepara a conexão do meu sql
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
            //insere os parâmetros
            pst.setInt(1, pessoa.getCod());
            //executa o sql
            pst.executeUpdate();
            retorno = true;
        } catch (Exception ex) {
            ex.printStackTrace();
            retorno = false;
        }
        return retorno;
    }

    public List<Pessoa> listar() {

        List<Pessoa> lista = new ArrayList<Pessoa>();

        String sql = "SELECT * FROM Pessoa";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);

        try {
            //Executo o sql e jogo num ResultSet
            ResultSet res = pst.executeQuery();
            // Enquanto tiver REGISTRO eu vou relacionar com minha Classe jogador e adicionar na lista
            while (res.next()) {
                Pessoa pessoa = new Pessoa();
                pessoa.setCod(res.getInt("codigo"));
                pessoa.setNome(res.getString("nome"));
                pessoa.setSexo(res.getString("sexo"));
                lista.add(pessoa);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);

        }
        return lista;
    }
}
