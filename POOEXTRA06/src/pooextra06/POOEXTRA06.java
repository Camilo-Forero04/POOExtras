/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextra06;

import pooextra06.SopaDeLetrasService.SopaDeLetrasService;

/**
 *
 * @author PAVILION
 */
public class POOEXTRA06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SopaDeLetrasService ss = new SopaDeLetrasService();
        SopaDeLetras s1 = new SopaDeLetras();
        ss.crearSopaDeLetras(s1);
        ss.imprimirSopaDeLetras(s1);
        ss.Reemplazarpalabra(s1);
        ss.imprimirSopaDeLetrasInvertida(s1);
    }
    
}
