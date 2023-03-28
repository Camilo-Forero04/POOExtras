/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.extraej04;

import Servicio.NIFServicio;

/**
 *
 * @author Estefania
 */
public class POOExtraEj04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NIFServicio ns = new NIFServicio();
        ns.crearNif();
        ns.mostrar();
    }
    
}
