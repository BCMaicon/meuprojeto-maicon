package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.jogador;

public class JogadorDAO {

    public Boolean inserir(jogador jog) {
        Boolean retorno;
        // Monta o sql de insert na tabela
        String sql = "INSERT INTO jogador(login,senha,email,imagem)" + "VALUES (?,?,?,?)";
        //Prepara a conexão do meu sql
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
            //insere os parâmetros
            pst.setString(1, jog.getLogin());
            pst.setString(2, jog.getSenha());
            pst.setString(3, jog.getEmail());
            pst.setBytes(4, jog.getImagem());
            //executa o sql
            pst.executeUpdate();
            retorno = true;
        } catch (Exception ex) {
            ex.printStackTrace();
            retorno = false;
        }
        return retorno;
    }

    public Boolean excluir(jogador jog) {
        Boolean retorno;
        // Monta o sql de insert na tabela
        String sql = "DELETE FROM jogador WHERE LOGIN = ?";
        //Prepara a conexão do meu sql
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
            //insere os parâmetros
            pst.setString(1, jog.getLogin());
            //executa o sql
            pst.executeUpdate();
            retorno = true;
        } catch (Exception ex) {
            ex.printStackTrace();
            retorno = false;
        }
        return retorno;
    }

    public Boolean atualizar(jogador jog) {
        Boolean retorno;
        // Monta o sql de insert na tabela
        String sql = "UPDATE jogador SET LOGIN = ?, SENHA = ?, EMAIL = ?,IMAGEM = ?" + " WHERE LOGIN = ?";
        //Prepara a conexão do meu sql
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
            //insere os parâmetros

            pst.setString(1, jog.getLogin());
            pst.setString(2, jog.getSenha());
            pst.setString(3, jog.getEmail());
            pst.setBytes(4, jog.getImagem());
            pst.setString(5, jog.getLogin());
            //executa o sql
            pst.executeUpdate();
            retorno = true;
        } catch (Exception ex) {
            ex.printStackTrace();
            retorno = false;
        }
        return retorno;
    }
  public jogador login(jogador jog) {
        jogador retorno = null;

        String sql = "SELECT * FROM jogador WHERE login = ? AND senha = ?";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);

        try {
            pst.setString(1, jog.getLogin());
            pst.setString(2, jog.getSenha());
           
            ResultSet res = pst.executeQuery();

            //Se tiver um jogador com login e senha igual ao informado
            //preenche os campos de variável de retorno
            if (res.next()) {
                retorno = new jogador();
                retorno.setEmail(res.getString("email"));
                retorno.setLogin(res.getString("login"));
                retorno.setSenha(res.getString("senha"));
                retorno.setImagem(res.getBytes("imagem"));

            }
        } catch (Exception e) {

        }
        return retorno;
    }
    
    public List<jogador> listar() {

        List<jogador> lista = new ArrayList<jogador>();

        String sql = "SELECT * FROM jogador";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);

        try {
            //Executo o sql e jogo num ResultSet
            ResultSet res = pst.executeQuery();
            // Enquanto tiver REGISTRO eu vou relacionar com minha Classe jogador e adicionar na lista
            while (res.next()) {
                jogador jog = new jogador();
                jog.setLogin(res.getString("Login"));
                jog.setSenha(res.getString("senha"));
                jog.setEmail(res.getString("email"));
                jog.setImagem(res.getBytes("imagem"));
                lista.add(jog);
            }
        } catch (SQLException ex) {
            Logger.getLogger(JogadorDAO.class.getName()).log(Level.SEVERE, null, ex);

        }
        return lista;
    }
}
