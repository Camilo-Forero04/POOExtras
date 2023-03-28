/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooext6.AhorcadoService;

import java.util.Arrays;
import java.util.Scanner;
import pooext6.Ahorcado;

/**
 *
 * @author PAVILION
 */
public class AhorcadoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Ahorcado a1 = new Ahorcado();
    String palabraUsuario;
    int longitud;

    public void crearJuego() {
        System.out.println("Ingrese la palabra a buscar");
        palabraUsuario = leer.next();
        System.out.println("Ingrese la cantidad de jugadas maximas");
        a1.setCantidadJugadasMaximas(leer.nextInt());
        longitud = palabraUsuario.length();
        a1.setVectorPalabra(new String[longitud]);
        for (int i = 0; i < longitud; i++) {
            a1.getVectorPalabra()[i] = palabraUsuario.substring(i, i + 1);
        }
        a1.setCantidadDeLetrasEncontradas(0);
    }

    public void longitud() {
        System.out.println("La longitud de su palabra es de: " + longitud);
    }

    public void buscar(String letra) {
        boolean condicion = false;
        for (int i = 0; i < longitud; i++) {
            if (a1.getVectorPalabra()[i].equals(letra)) {
                condicion = true;
            }
        }
       
        System.out.println("¿La letra se encuentra en la palabra?" + condicion);
    }

    public void encontradas(String letra) {
        boolean condicion=false;
        for (int i = 0; i < longitud; i++) {
            if (a1.getVectorPalabra()[i].equals(letra)) {
                a1.setCantidadDeLetrasEncontradas(a1.getCantidadDeLetrasEncontradas()+ 1);
                condicion=true;
            }
        }
        if (!condicion) {
            a1.setCantidadJugadasMaximas(a1.getCantidadJugadasMaximas()-1);
        }
        System.out.println("El numero de letras encontradas es de : "+a1.getCantidadDeLetrasEncontradas());
        
    }
    public void intentos(){
        System.out.println("Tiene estas oportunidades: "+a1.getCantidadJugadasMaximas());
    }
    
    public void juego(){
    String letra; 
    crearJuego();
    longitud();
    int confirmacion1=a1.getCantidadJugadasMaximas();
    String[] confirmacion =new String[confirmacion1];
    System.out.println("Ingrese una letra");
    letra = leer.next();
    buscar(letra);
    encontradas(letra);
    intentos();
    confirmacion[0]=letra;
    for (int i = 1; i < confirmacion1; i++) {
        if (a1.getCantidadDeLetrasEncontradas()==a1.getVectorPalabra().length) {
            break;
        }
    do {    
        System.out.println("Ingrese una letra");
        letra = leer.next();
        if (Arrays.asList(confirmacion).contains(letra)) {
            System.out.println("Su letra se encuentra repetida, por favor, ingrese una letra que no este repetida");
        } else {
            confirmacion[i] = letra;
        }
    } while (confirmacion[i] == null);
    buscar(letra);
    encontradas(letra);
    intentos();
} 
    if (a1.getCantidadDeLetrasEncontradas()==a1.getVectorPalabra().length) {
            System.out.println("La palabra se ha encontrado exitosamente");
        }else{
        System.out.println("La palabra no se logró encontrar :c");
    }
    } 
    
    }
//        for (int i = 1; i < longitud; i++) {
//            while (confirmacion[i].equals(letra)){
//                if (confirmacion[i].equals(letra)) {
//                System.out.println("Su letra se encuentra repetida, por favor, ingrese una letra que no este repetida");
//                letra=leer.next();
//            }else{
//                confirmacion[i]=letra;
//            }
//            }
//
//    System.out.println("Ingrese una letra");
//    letra = leer.next();
//    encontradas(letra,buscar(letra));
//    intentos();
//        }
//    }  

//
