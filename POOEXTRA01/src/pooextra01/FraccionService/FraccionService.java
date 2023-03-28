/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextra01.FraccionService;

import java.util.Scanner;
import pooextra01.Fraccion;

/**
 *
 * @author PAVILION
 */
public class FraccionService {
    Scanner leer = new Scanner(System.in);
    double resultadoNumerador;
    double resultadoDenominador;
    double resultadoDividido;
   
    public void sumar(Fraccion f){
        boolean heterogenias=false;
        if (f.getDenominador()==f.getDenominador2()) {
            resultadoNumerador=f.getNumerador()+f.getNumerador2();
            resultadoDenominador=f.getDenominador();
            resultadoDividido=resultadoNumerador/resultadoDenominador;
            
        }else{
            resultadoNumerador=(f.getNumerador()*f.getDenominador2())+(f.getNumerador2()*f.getDenominador());
           resultadoDenominador=f.getDenominador()*f.getDenominador2();
            resultadoDividido=resultadoNumerador/resultadoDenominador;
            heterogenias=true;
        }
        simplificar();
        System.out.println("La suma de sus dos fracciones es de: "+resultadoNumerador);
        System.out.println("                                    ---");
        System.out.println("                                     "+resultadoDenominador);
        System.out.println("La suma de sus dos fracciones es de: "+resultadoDividido);
        System.out.println("¿Su fraccion es heterogenia?"+heterogenias);
    }
    public void restar(Fraccion f){
       boolean heterogenias=false;
        if (f.getDenominador()==f.getDenominador2()) {
            resultadoNumerador=f.getNumerador()-f.getNumerador2();
            resultadoDenominador=f.getDenominador();
            resultadoDividido=resultadoNumerador/resultadoDenominador;
            
        }else{
            resultadoNumerador=(f.getNumerador()*f.getDenominador2())-(f.getNumerador2()*f.getDenominador());
           resultadoDenominador=f.getDenominador()*f.getDenominador2();
            resultadoDividido=resultadoNumerador/resultadoDenominador;
            heterogenias=true;
        }
        simplificar();
        System.out.println("La resta de sus dos fracciones es de: "+resultadoNumerador);
        System.out.println("                                     ---");
        System.out.println("                                      "+resultadoDenominador);
        System.out.println("La resta de sus dos fracciones es de: "+resultadoDividido);
        System.out.println("¿Su fraccion es heterogenia?"+heterogenias);
    }
    public void multiplicar(Fraccion f){
        boolean heterogenias=false;
         if (f.getDenominador()==f.getDenominador2()) {
            
            heterogenias=true;
            }
            resultadoNumerador=f.getNumerador()*f.getNumerador2();
            resultadoDenominador=f.getDenominador()*f.getDenominador2();
            resultadoDividido=resultadoNumerador/resultadoDenominador;
            
        simplificar();
        System.out.println("La multiplicacion de sus dos fracciones es de: "+resultadoNumerador);
        System.out.println("                                              ---");
        System.out.println("                                               "+resultadoDenominador);
        System.out.println("El resultado de sus dos fracciones en decimales es de: "+resultadoDividido);
        System.out.println("¿Su fraccion es heterogenia?"+heterogenias);
    }
    public void dividir(Fraccion f){
        boolean heterogenias=false;
        if (f.getDenominador()==f.getDenominador2()) {
            
            heterogenias=true;
            }
        resultadoNumerador=(f.getNumerador()*f.getDenominador2());
        resultadoDenominador=f.getNumerador2()*f.getDenominador();
        resultadoDividido=resultadoNumerador/resultadoDenominador;
        simplificar();
        System.out.println("La division de sus dos fracciones es de: "+resultadoNumerador);
        System.out.println("                                        ---");
        System.out.println("                                         "+resultadoDenominador);
        System.out.println("La division de sus dos fracciones es de: "+resultadoDividido);
        System.out.println("¿Su fraccion es heterogenia?"+heterogenias);
        
    }
    public void simplificar(){
        do {
            if (resultadoNumerador%5==0&&resultadoDenominador%5==0){
                
                resultadoNumerador=resultadoNumerador/5;
                resultadoDenominador=resultadoDenominador/5;
                
            }else if (resultadoNumerador%3==0&&resultadoDenominador%3==0){
                
                resultadoNumerador=resultadoNumerador/3;
                resultadoDenominador=resultadoDenominador/3; 
            }else if (resultadoNumerador%2==0&&resultadoDenominador%2==0){
                
                resultadoNumerador=resultadoNumerador/2;
                resultadoDenominador=resultadoDenominador/2;
            }
                
            
        } while (resultadoNumerador%2==0&&resultadoDenominador%2==0||resultadoNumerador%3==0&&resultadoDenominador%3==0||resultadoNumerador%5==0&&resultadoDenominador%5==0);
        
    }
    public void menu(Fraccion f){
        int opc;
        String conf = "n";

        do {

            System.out.println("MENU:");
            System.out.println("1. Sumar fracciones: ");
            System.out.println("2. Restar fracciones: ");
            System.out.println("3. Multiplicar fracciones: ");
            System.out.println("4. Dividir fracciones: ");
            System.out.println("5. Salir...");
            opc = leer.nextInt();

            if (opc == 5) {

                do {
                    System.out.println("Esta seguro que quiere salir? s/n");
                    conf = leer.next();
                } while (!conf.equalsIgnoreCase("n") && !conf.equalsIgnoreCase("s"));
                if (conf.equalsIgnoreCase("s")) {
                    break;
                }

            }

            if (opc > 0 && opc < 5) {

                switch (opc) {
                    
                    case 1:
                        sumar(f);
                        break;
                    case 2:
                        restar(f);
                        break;
                    case 3:
                        multiplicar(f);
                        break;
                    case 4:
                        dividir(f);
                        break;
                }

            }

        } while (conf.equalsIgnoreCase("n"));
        
        System.out.println("EL PROGRAMA HA TERMINADO.....");
        
        
        
        
    }
}
