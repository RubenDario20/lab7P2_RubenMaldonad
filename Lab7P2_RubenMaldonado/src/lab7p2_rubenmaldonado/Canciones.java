/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_rubenmaldonado;

/**
 *
 * @author Ruben Dario Arias
 */
public class Canciones extends Album{
    private String nombre;
    private int duracion;
    private String compositor;
    private String distri; 
    private String exlusiva;
    private String nombreProductor;
    private String invitado;

    public Canciones() {
        super();
    }

    public Canciones(String nombre, int duracion, String compositor, String distri, String exlusiva, String nombreProductor, String invitado) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.compositor = compositor;
        this.distri = distri;
        this.exlusiva = exlusiva;
        this.nombreProductor = nombreProductor;
        this.invitado = invitado;
    }

    public String getNombree() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    public String getDistri() {
        return distri;
    }

    public void setDistri(String distri) {
        this.distri = distri;
    }

    public String getExlusiva() {
        return exlusiva;
    }

    public void setExlusiva(String exlusiva) {
        this.exlusiva = exlusiva;
    }

    public String getNombreProductor() {
        return nombreProductor;
    }

    public void setNombreProductor(String nombreProductor) {
        this.nombreProductor = nombreProductor;
    }

    public String getInvitado() {
        return invitado;
    }

    public void setInvitado(String invitado) {
        this.invitado = invitado;
    }

    @Override
    public String toString() {
        return "Canciones{" + "nombre=" + nombre + ", duracion=" + duracion + ", compositor=" +
                compositor + ", distri=" + distri + ", exlusiva=" + exlusiva + ", nombreProductor=" + nombreProductor + ", invitado=" + invitado + '}';
    }
    
    
    
}
