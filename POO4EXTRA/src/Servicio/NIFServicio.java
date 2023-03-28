/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author Estefania
 */
public class NIFServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    NIF ni = new NIF();
    char lt[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','I','J','Z','S','Q','V','H','L','C','K','E'};
    int num;
    public NIF crearNif(){
        System.out.print("Ingrese su DNI: ");
        ni.setDNI(leer.nextLong());
        num = (int) ni.getDNI()%23;
        for(int i = 0; i < lt.length;i++){
            if(num==i){
                ni.setLetra(lt[i]);
            }
        }
        return ni;
    }
    public void mostrar(){
        System.out.println("NIF: "+ni.getDNI()+"-"+ni.getLetra());
    }
}
