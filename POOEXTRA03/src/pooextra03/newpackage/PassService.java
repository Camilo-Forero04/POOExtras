/*




● A través de un menú de opciones:
o A) ingresar la contraseña, recordar que antes de guardarla debe ser ingresada una
contraseña valida).
o B) Mensaje al usuario que tipo de NIVEL es su contraseña
o C) Modificar contraseña, donde primero debe poner su contraseña anterior para
dar permiso
o C) Modificar nombre, donde primero debe poner su contraseña para dar permiso,
SINO impedir cambios
o D) Modificar DNI, donde primero debe poner su contraseña para dar permiso,
SINO impedir cambios

 */
package pooextra03.newpackage;

import java.util.Scanner;
import pooextra03.Pass;

/**
 *
 * @author PAVILION
 */
public class PassService {
    Scanner leer = new Scanner(System.in);
    Pass p = new Pass("12345678", "camilo", 1014658839);
    private void crearPass(){
        do {
        System.out.println("Ingrese su nueva contraseña");
        p.setPass(leer.nextLine());
        } while (p.getPass().length()!=10);
    }

    private void analizarPass(){
        String analisis;
        String analisis2="BAJO";
        int contA=0, contZ=0;
        for (int i = 0; i < 10; i++) {
            analisis=p.getPass().toLowerCase().substring(i,i+1);
            if (analisis.equals("z")){
                contZ++;
            }
            if (analisis.equals("a")) {
                contA++;
            }
        }
        if (contZ>=1) {
            analisis2="MEDIO";
        }
        if(contZ>=1&&contA>=2){
            analisis2="ALTO";
        }
        
        System.out.println("Su contraseña es de nivel: "+analisis2);
    }

    public void modificadorNombre(){
        System.out.println("Ingrese su contraseña para modificar sus datos");
        String verificacion=leer.nextLine();
        if (verificacion.equals(p.getPass())) {
            System.out.println("Digite su nuevo nombre: ");
            p.setNombre(leer.nextLine());
        }else{
            System.out.println("Su contraseña no coincide, será arrojado nuevamente al menú");
        }
        }
        public void modificadorDNI(){
        System.out.println("Ingrese su contraseña para modificar sus datos");
        String verificacion=leer.nextLine();
        if (verificacion.equals(p.getPass())) {
            System.out.println("Digite su nuevo DNI: ");
            p.setDni(leer.nextInt());
        }else{
            System.out.println("Su contraseña no coincide, será arrojado nuevamente al menú");
        }
    }
    private void modificarPass(){
        System.out.println("Ingrese su contraseña para modificar sus datos");
        String verificacion=leer.nextLine();
        if (verificacion.equals(p.getPass())) {
        do {
        System.out.println("Ingrese su nueva contraseña");
        p.setPass(leer.nextLine());
        } while (p.getPass().length()!=10);
        }else{
            System.out.println("Su contraseña no coincide, será arrojado nuevamente al menú");
        }
    }
    public void menu(){
        System.out.println(p.toString());
        String opc;
        String confirma;
        do {
            System.out.println("\n A) Ingresar contraseña nueva"
                            + "\n B) Verifique el nivel de su contraseña"
                            + "\n C) Modificar la contraseña"
                            + "\n D) Modificar nombre"
                            + "\n E) Modificar DNI"
                            + "\n F) Salir");
            opc=leer.nextLine().toUpperCase();
            switch(opc){
                case "A":
                    crearPass();
                    break;
                case "B":
                    analizarPass();
                    break;
                case "C":
                     modificarPass(); 
                     break;
                case "D":
                    modificadorNombre();
                    break;
                case "E":
                    modificadorDNI();
                    break;
                default:
                System.out.println("No se ha introducido una opcion valida");
            }
            if (opc.equals("F")) {
                do {
                    System.out.println("¿Esta seguro que quiere salir? s/n");
                    confirma = leer.next();
                } while (!confirma.equalsIgnoreCase("n") && !confirma.equalsIgnoreCase("s"));
                if (confirma.equalsIgnoreCase("s")) {
                    break;
                }
            }
        } while (!opc.equals("F"));
        System.out.println(p.toString());
}
}


