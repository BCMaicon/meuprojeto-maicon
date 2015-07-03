
import dao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.jogador;

public class TesteBancodeDados {

    public static void main(String[] args) {
        inserir();
        
        List<jogador>lista = listar();
        for (jogador jogador : lista) {
            System.out.println(jogador.getLogin());
        }
    }
    public static List<jogador> listar() {
        List<jogador> jogadores = new ArrayList<jogador>();
        
        try {
            String sql = " SELECT * FROM jogador";
            PreparedStatement pst = Conexao.getPreparedStatement(sql);

            ResultSet res = pst.executeQuery();
            while (res.next()) {
                // pega a estrutura do ResultSet e relaciona a classe jogador
                jogador jog = new jogador();
                jog.setLogin(res.getString("login"));
                jog.setSenha(res.getString("senha"));
                jog.setEmail(res.getString("email"));

                jogadores.add(jog);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TesteBancodeDados.class.getName()).log(Level.SEVERE, null, ex);
        }

        return jogadores;

    }

    public static void inserir() {
        String login, senha, email;
        login = JOptionPane.showInputDialog("L0GIN");
        senha = JOptionPane.showInputDialog("SENHA");
        email = JOptionPane.showInputDialog("EMAIL");

        String sql;
        sql = "INSERT INTO jogador(login,senha,email) " + " VALUES (?,?,?)";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
            pst.setString(1, login);
            pst.setString(2, senha);
            pst.setString(3, email);

            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TesteBancodeDados.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
