/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maiconradio;

/**
 *
 * @author Aluno
 */
public class Musica {

    private String nome_musica, nome_artista, album, genero;
    private Double dur_musica;

    public String getNome_musica() {
        return nome_musica;
    }

    public void setNome_musica(String nome_musica) {
        this.nome_musica = nome_musica;
    }

    public String getNome_artista() {
        return nome_artista;
    }

    public void setNome_artista(String nome_artista) {
        this.nome_artista = nome_artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Double getDur_musica() {
        return dur_musica;
    }

    public void setDur_musica(Double dur_musica) {
        this.dur_musica = dur_musica;
    }

    public String InformacoesMusica() {
        String info;
        info = "\n" + nome_musica + " - " + nome_artista + " - " + genero;
        return info;
    }
    void Zerando(){
        nome_musica = null;
        nome_artista = null;
        genero = null;
        dur_musica = 0.0;
        
    }
}
