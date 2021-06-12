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
public class Album extends Artista{
    private String fecha;
    private String genero;
    private String formato;
    private String alias;
    ArrayList canciones = new ArrayList();

    public Album() {
        super();
    }

    public Album(String fecha, String genero, String formato, String alias) {
        this.fecha = fecha;
        this.genero = genero;
        this.formato = formato;
        this.alias = alias;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getAliass() {
        return alias;
    }

    public void setAliass(String alias) {
        this.alias = alias;
    }

    public ArrayList getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList canciones) {
        this.canciones = canciones;
    }
    
    @Override
    public String toString() {
        return "Album{" + "fecha=" + fecha + ", genero=" + genero + ", formato=" + formato + ", alias=" + alias + '}';
    }
    
    
}
