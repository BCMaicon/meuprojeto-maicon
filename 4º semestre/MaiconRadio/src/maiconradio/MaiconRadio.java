/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maiconradio;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class MaiconRadio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Exercício 1;
        Radio r = new Radio();
        String nome, dat_criacao, cidade_local;
        Boolean transmiteFM, transmiteAM;
        Double aud_med_dia;

        //Exercício música
        Musica m = new Musica();

        String nome_musica, nome_artista, album, genero;
        Double dur_musica;
        //Atribuindo valores da classe música
        nome_musica = JOptionPane.showInputDialog("Informe o nome dá música:");
        m.setNome_musica(nome_musica);
        nome_artista = JOptionPane.showInputDialog("Informe o nome do artista:");
        m.setNome_artista(nome_artista);
        album =  JOptionPane.showInputDialog("Informe o nome do álbum:");
        m.setAlbum(album);
        genero =  JOptionPane.showInputDialog("Informe o gênero da música:");
        m.setGenero(genero);
        dur_musica = Double.parseDouble(JOptionPane.showInputDialog("Informe a duração da música em segundos:"));
        m.setDur_musica(dur_musica);
        
        JOptionPane.showMessageDialog(null, "No formato o nome da música, o  nome do artista e o gênero da música, fica respectivamente:" + m.InformacoesMusica( ));
        
        //Atribuindo valores da classe rádio
        nome = JOptionPane.showInputDialog("Informe o nome da rádio:");
        r.setNome(nome);
        dat_criacao = JOptionPane.showInputDialog("Informe a data de criação da rádio:");
        r.setDat_criacao(dat_criacao);
        cidade_local = JOptionPane.showInputDialog("Informe a cidade onde a rádio transmite:");
        r.setCidade_local(cidade_local);
        aud_med_dia = Double.parseDouble(JOptionPane.showInputDialog("Informe a aundiência média do rádio:"));
        r.setAud_med_dia(aud_med_dia);
        transmiteFM = Boolean.parseBoolean(JOptionPane.showInputDialog("Informe se o rádio transmite em FM: \nS-Sim\nN-Não"));
        r.setTransmiteFM(transmiteFM);
        transmiteAM = transmiteFM = Boolean.parseBoolean(JOptionPane.showInputDialog("Informe se o rádio transmite em AM: \nS-Sim\nN-Não"));
        r.setTransmiteFM(transmiteFM);

        JOptionPane.showMessageDialog(null, "\nO nome do rádio é:"+nome +"\nA data de criação do rádio foi em:"+dat_criacao+"\nA nome da cidade onde o rádio transmite é em:"+cidade_local+"\nA audiência diária é:"+aud_med_dia);
        if (transmiteFM.equals("S")) {
            r.setTransmiteFM(true);
        } else {
            r.setTransmiteFM(false);
        }

        if (transmiteAM.equals("S")) {
            r.setTransmiteAM(true);
        } else {
            r.setTransmiteAM(false);
        }
        
        if (r.isTransmiteFM() == true) {
            JOptionPane.showMessageDialog(null, "O rádio transmite em FM");
        } else {
            JOptionPane.showMessageDialog(null, "O rádio não transmite em FM");
        }
        if (r.isTransmiteAM() == true) {
            JOptionPane.showMessageDialog(null, "O rádio transmite em AM");
        } else {
            JOptionPane.showMessageDialog(null, "O rádio não transmite em AM");
        }

    }

}
