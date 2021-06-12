/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_rubenmaldonado;

import javax.swing.JProgressBar;

/**
 *
 * @author Ruben Dario Arias
 */
public class AdministrarBarra extends Thread {

    private JProgressBar auxiliar;
    private boolean vive;
    private boolean avanzar;
    private String name;

    public AdministrarBarra(JProgressBar auxiliar) {
        this.auxiliar = auxiliar;
        vive = true;
        avanzar = true;
    }
    public AdministrarBarra(String name){
        this.name = name;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public void setVida(boolean vive) {
        this.vive = vive;
    }

    @Override
    public void run() {
        auxiliar.setStringPainted(true);
        while (vive) {
            if (avanzar) {
                auxiliar.setValue(auxiliar.getValue() + 1);
                auxiliar.setString(name+"");
            }
            if (auxiliar.getValue() == 400){
                auxiliar.setValue(0);
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
            }
        }

    }

}
