/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_rubenmaldonado;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;
import javax.swing.JSpinner;

/**
 *
 * @author Ruben Dario Arias
 */
public class Archivos {

    private String artista;
    private String album;

    public Archivos(String artista, String album) {
        this.artista = artista;
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void llenar() {
        FileWriter salida = null;
        BufferedWriter br = null;
        try {
            salida = new FileWriter("./Informacion.txt", true);
            br = new BufferedWriter(salida);
            br.write("Artista:" + artista
                    + " Album:" + album);
            br.newLine();
            br.flush();
            salida.close();

        } catch (Exception ex) {
        }
    }

}
