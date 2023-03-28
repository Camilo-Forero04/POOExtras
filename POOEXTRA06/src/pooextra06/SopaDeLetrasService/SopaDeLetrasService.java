/*

● Que el usuario ingrese una palabra y la busque en la matriz. Deberá retornar en que
posición de la matriz inicia la palabra.
● Imprimir la sopa de letras en pantalla
● Que el usuario pueda reemplazar una palabra especifica de la matriz ya pre -cargada (Es
decir, por ejemplo, que si en posición 0.0 estabae el usuario pueda reemplazar una palabra especifica de la matriz ya pre -cargada (Es perro, cambiarla a polo). Para realizar esta
gestión, el método recibirá la palabra a buscar y a reemplazar sus datos
● Imprimir la sopa de letras, invertida (es decir, filas por columnas)

 */
package pooextra06.SopaDeLetrasService;

import java.util.Scanner;
import pooextra06.SopaDeLetras;

public class SopaDeLetrasService {
    Scanner leer = new Scanner(System.in);
    String palabraAReemplazar;
    char letraRandom;
    String palabraReemplazadora;
    String[] palabras = new String[10];
    public void crearSopaDeLetras(SopaDeLetras s1) {
    
        if (s1.getPalabraUsuario() == null) {
            System.out.println("Ingrese una palabra: ");
            s1.setPalabraUsuario(leer.nextLine());
        }
        
    
    palabras[0] = s1.getPalabraUsuario();
    palabras[1] = "perro";
    palabras[2] = "miedo";
    palabras[3] = "poder";
    palabras[4] = "unico";
    palabras[5] = "valor";
    palabras[6] = "apoyo";
    palabras[7] = "deseo";
    palabras[8] = "golpe";
    palabras[9] = "tocar";
    
if (palabraReemplazadora!=null) {
         for (int i = 0; i < 10; i++) {
             if (palabras[i].equals(palabraReemplazadora)) {
                 palabras[i]=palabraReemplazadora;
             }
    }
 
        }
    for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 10; j++) {
            int num= (int)(Math.random()*27);
            switch (String.valueOf(num)) {
                case "0":
                    letraRandom = 'a';
                    break;
                case "1":
                    letraRandom = 'b';
                    break;
                case "2":
                    letraRandom = 'c';
                    break;
                case "3":
                    letraRandom = 'd';
                    break;
                case "4":
                    letraRandom = 'e';
                    break;
                case "5":
                    letraRandom = 'f';
                    break;
                case "6":
                    letraRandom = 'g';
                    break;
                case "7":
                    letraRandom = 'h';
                    break;
                case "8":
                    letraRandom = 'i';
                    break;
                case "9":
                    letraRandom = 'j';
                    break;
                case "10":
                    letraRandom = 'k';
                    break;
                case "11":
                    letraRandom = 'l';
                    break;
                case "12":
                    letraRandom = 'm';
                    break;
                case "13":
                    letraRandom = 'n';
                    break;
                case "14":
                    letraRandom = 'ñ';
                    break;
                case "15":
                    letraRandom = 'o';
                    break;
                case "16":
                    letraRandom = 'p';
                    break;
                case "17":
                    letraRandom = 'q';
                    break;
                case "18":
                    letraRandom = 'r';
                    break;
                case "19":
                    letraRandom = 's';
                    break;
                case "20":
                    letraRandom = 't';
                    break;
                case "21":
                    letraRandom = 'u';
                    break;
                case "22":
                    letraRandom = 'v';
                    break;
                case "23":
                    letraRandom = 'w';
                    break;
                case "24":
                    letraRandom = 'x';
                    break;
                case "25":
                    letraRandom = 'y';
                    break;
                case "26":
                    letraRandom = 'z';
                    break;
            }
            if (i < palabras.length && j < palabras[i].length()) {
                s1.getSopa()[i][j] = palabras[i].charAt(j);
            } else {
                s1.getSopa()[i][j] = letraRandom;
            }
            
//            System.out.println("Cual es la primera posicion en la que se encuentra su palabra?");
//            int posicionUsuario1=leer.nextInt();
//            int posicionUsuario2=leer.nextInt();
            
        }
    }
}
    
    
//    public void crearSopaDeLetras(SopaDeLetras s1){
//        String [] palabras= new String[10];
//        System.out.println("Ingrese una palabra: ");
//        s1.setPalabraUsuario(leer.nextLine());
//        palabras[0]=s1.getPalabraUsuario();
//        palabras[1]="perro";
//        palabras[2]="miedo";
//        palabras[3]="poder";
//        palabras[4]="unico";
//        palabras[5]="valor";
//        palabras[6]="apoyo";
//        palabras[7]="deseo";
//        palabras[8]="golpe";
//        palabras[9]="tocar";
//        
//        for (int i = 0; i < 10; i++) {
//           
//              for (int j = 0; j < 10; j++) {
//                 
//                  if (i<5&&j<5) {
//                      
//                     for (int k = 0; k < 5; k++) {
//                     s1.getSopa()[i][j]=palabras[k].charAt(k);
//                  }                        
//                  }else{
//                      s1.getSopa()[i][j]='*';
//                  }  
//                  }
//                  
//                  
//            }  
//         }
        
    public void imprimirSopaDeLetras(SopaDeLetras s1){
        System.out.println("SOPA DE LETRAS: ");
        for (int i = 0; i < 10; i++) {
             for (int j = 0; j < 10; j++) {
                 System.out.print(s1.getSopa()[i][j]+" ");
             }
             System.out.println(" ");
         }
        
    }
    public void Reemplazarpalabra(SopaDeLetras s1){
        System.out.println("Que palabra desea reemplazar: ");
        palabraAReemplazar=leer.nextLine();
       int i=0;
             do {
               if (palabraAReemplazar.equals(palabras[i])){
                  break; 
               }else{
                   i++;
               }
               
                 if (i>9) {
                     System.out.println("Escriba una palabra que se encuentre en la sopa de letras");
                     palabraAReemplazar=leer.nextLine();
                     i=0;
                 }
            } while (!palabraAReemplazar.equals(palabras[i]));
             
        System.out.println("¿Por cual palabra la desea reemplazar: ");
       palabraReemplazadora= leer.nextLine();
       
        while(palabraReemplazadora.length()>10){
            System.out.println("Escriba una palabra que tenga menos de 10 letras");
           palabraReemplazadora=leer.nextLine();
        }
        s1.setPalabraUsuario(palabraReemplazadora);
        crearSopaDeLetras(s1);
        
    }
     public void imprimirSopaDeLetrasInvertida(SopaDeLetras s1){
         System.out.println("SOPA DE LETRAS INVERTIDA: ");
         for (int i = 0; i < 10; i++) {
             
             for (int j = 0; j < 10; j++) {
                 System.out.print(s1.getSopa()[j][i]+" ");
             }
             System.out.println(" ");
         }
        
    }
    }


     ////                  if (i > 5&& j > 5) {
//                      s1.getSopa()[i][j]="*";
////                  }else{
////                      s1.getSopa()[i][j]=palabras[h].substring(h, h+1);
////                  } 

