package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.pergunta;

public class PerguntaDAO {

    public Boolean inserir(pergunta perg) {
        Boolean retorno;
        String sql = "INSERT INTO pergunta(a,b,c,d,certa,enunciado,nivel)VALUES(?,?,?,?,?,?,?)";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
            //insere os parâmetros
            pst.setString(1, perg.getA());
            pst.setString(2, perg.getB());
            pst.setString(3, perg.getC());
            pst.setString(4, perg.getD());
            pst.setString(5, perg.getCerta());
            pst.setString(6, perg.getEnunciado());
            pst.setInt(7, perg.getNivel());

            //executa o sql
            pst.executeUpdate();
            retorno = true;
        } catch (Exception ex) {
            ex.printStackTrace();
            retorno = false;
        }
        return retorno;
    }

    public Boolean excluir(pergunta perg) {
        Boolean retorno;
        String sql = "DELETE FROM PERGUNTA WHERE ID = ?";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
            //insere os parâmetros
            pst.setInt(1, perg.getId());

            //executa o sql
            pst.executeUpdate();
            retorno = true;
        } catch (Exception ex) {
            ex.printStackTrace();
            retorno = false;
        }
        return retorno;
    }

    public Boolean atualizar(pergunta perg) {
        Boolean retorno;
        String sql = "UPDATE pergunta SET a = ?, b = ?, c = ?, d = ?, certa = ?, nivel = ?, enunciado = ?" + "WHERE ID = ?";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
            //insere os parâmetros
            pst.setString(1, perg.getA());
            pst.setString(2, perg.getB());
            pst.setString(3, perg.getC());
            pst.setString(4, perg.getD());
            pst.setString(5, perg.getCerta());
            pst.setInt(6, perg.getNivel());
            pst.setString(7, perg.getEnunciado());
            pst.setInt(8, perg.getId());

            //executa o sql
            pst.executeUpdate();
            retorno = true;
        } catch (Exception ex) {
            ex.printStackTrace();
            retorno = false;
        }
        return retorno;
    }

    public List<pergunta> listarNivel(Integer nivel) {
        List<pergunta> lista = new ArrayList<pergunta>();

        String sql = "SELECT * FROM pergunta WHERE NIVEL = ? ORDER BY RANDOM()";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
            //Executo o sql e pergo num ResultSet
            pst.setInt(1,nivel);
            ResultSet res = pst.executeQuery();
            
            // Enquanto tiver REGISTRO eu vou relacionar com minha Classe pergunta e adicionar na lista
            while (res.next()) {
                pergunta perg = new pergunta();
                perg.setA(res.getString("A"));
                perg.setB(res.getString("B"));
                perg.setC(res.getString("C"));
                perg.setD(res.getString("D"));
                perg.setCerta(res.getString("certa"));
                perg.setEnunciado(res.getString("enunciado"));
                perg.setNivel(res.getInt("nivel"));
                perg.setId(res.getInt("id"));
                lista.add(perg);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PerguntaDAO.class.getName()).log(Level.SEVERE, null, ex);

        }
        return lista;
    }

    public List<pergunta> listar() {

        List<pergunta> lista = new ArrayList<pergunta>();

        String sql = "SELECT * FROM pergunta";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);

        try {
            //Executo o sql e pergo num ResultSet
            ResultSet res = pst.executeQuery();
            // Enquanto tiver REGISTRO eu vou relacionar com minha Classe pergunta e adicionar na lista
            while (res.next()) {
                pergunta perg = new pergunta();
                perg.setA(res.getString("A"));
                perg.setB(res.getString("B"));
                perg.setC(res.getString("C"));
                perg.setD(res.getString("D"));
                perg.setCerta(res.getString("certa"));
                perg.setEnunciado(res.getString("enunciado"));
                perg.setNivel(res.getInt("nivel"));
                perg.setId(res.getInt("id"));
                lista.add(perg);

            }
        } catch (SQLException ex) {
            Logger.getLogger(PerguntaDAO.class
                    .getName()).log(Level.SEVERE, null, ex);

        }
        return lista;
    }

}
