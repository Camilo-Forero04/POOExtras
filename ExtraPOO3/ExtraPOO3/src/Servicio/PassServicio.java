package Servicio;

import Entidad.Pass;
import java.util.Scanner;

public class PassServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    String opc;
    Pass u1 =new Pass("Z37934299A", "Agustina",37934299);
    public void crearPass (Pass u1){
        String contN;
        do{
            System.out.print("Ingrese una contraseña de 10 digitos: ");
            contN= (leer.next());
        }while(contN.length()!=10);
        u1.setPass(contN);
    }
    public void analizarPass(Pass u1){
        int seguridad=0;
        boolean z = false;
        for (int i = 0; i < 10; i++) {
            if (u1.getPass().substring(i, i+1).equalsIgnoreCase("z")){
                z=true;
                break;
            }
        }
        if (z==true){
            seguridad++;
            for (int i = 0; i < 10; i++) {
                if (u1.getPass().substring(i, i+1).equalsIgnoreCase("a")){
                 seguridad++;  
                }
            }       
        }
        switch (seguridad){
            case 0:System.out.println("Seguridad nivel: BAJO");
            break;
            case 1: 
            case 2: System.out.println("Seguridad nivel: MEDIO");
            break;
            default:System.out.println("Seguridad nivel: ALTO");
        }
    }
    public void modificar(Pass u1, String opc){
        System.out.println("Ingrese su contraseña para continuar: ");
        if(u1.getPass().equals(leer.next())){
            switch (opc.toUpperCase()){
                case "C":
                    crearPass(u1);
                    break;
                case "D":
                    System.out.print("Ingrese el nuevo nombre: ");
                    u1.setNombre(leer.next());
                    break;
                case "E":
                    System.out.print("Ingrese el nuevo DNI: ");
                    u1.setDni(leer.nextInt());
            }
        } else{
            System.out.println("Contraseña inválida.");
        }
    }
    public void menu(){
        do{
            System.out.println("\n A) Ingresar contraseña nueva"
                            + "\n B) Verifique el nivel de su contraseña"
                            + "\n C) Modificar la contraseña"
                            + "\n D) Modificar nombre"
                            + "\n E) Modificar DNI"
                            + "\n F) Salir");
            System.out.println("----------------------------------");
            System.out.println(u1);
            System.out.println("----------------------------------");
            opc=leer.next();
            switch(opc.toUpperCase()){
                case "A":
                    crearPass(u1);
                    break;
                case "B":
                    analizarPass(u1);
                    break;
                case "C":
                case "D":
                case "E":
                    modificar(u1, opc);
                    break;
                case "F":
                    System.out.println("Hasta la próxima");
                    break;
                default:
                    System.out.println("Opción inválida, vuelva a intentarlo");
            }
            
        }while(!opc.equalsIgnoreCase("F"));
    }
}
