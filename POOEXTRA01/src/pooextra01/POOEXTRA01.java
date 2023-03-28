/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextra01;

import java.util.Scanner;
import pooextra01.FraccionService.FraccionService;

/**
 *
 * @author PAVILION
 */
public class POOEXTRA01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Fraccion f = new Fraccion();
        FraccionService fs = new FraccionService();
        System.out.println("Ingrese los valores de su primera fraccion: ");
        f.setNumerador(leer.nextInt());
        System.out.println("---");
        f.setDenominador(leer.nextInt());
        System.out.println("Ingrese los valores de su segunda fraccion: ");
        f.setNumerador2(leer.nextInt());
        System.out.println("---");
        f.setDenominador2(leer.nextInt());
        fs.menu(f);
        
    }
    
}
