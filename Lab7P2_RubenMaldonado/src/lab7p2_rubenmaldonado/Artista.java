/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_rubenmaldonado;

import java.util.ArrayList;

/**
 *
 * @author Ruben Dario Arias
 */
public class Artista {

    private String name;
    private String gender;
    private String disquera;
    private String alias;
    private String tipo;
    ArrayList<Album> album = new ArrayList();
    Canciones songs;

    public Artista() {
    }

    public Artista(String name, String gender, String disquera, String alias, String tipo) {
        this.name = name;
        this.gender = gender;
        this.disquera = disquera;
        this.alias = alias;
        this.tipo = tipo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDisquera() {
        return disquera;
    }

    public void setDisquera(String disquera) {
        this.disquera = disquera;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList getAlbum() {
        return album;
    }

    public void setAlbum(ArrayList album) {
        this.album = album;
    }

    public Canciones getSongs() {
        return songs;
    }

    public void setSongs(Canciones songs) {
        this.songs = songs;
    }



    
    
    @Override
    public String toString() {
        return "Artista{" + "name=" + name + ", gender=" + gender + ", disquera=" + disquera + ", alias=" + alias + ", tipo=" + tipo + '}';
    }

}
