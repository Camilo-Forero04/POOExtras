/*
 Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
 Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
 Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.
 Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
posibles soluciones.
 Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
Es en el caso en que se tenga una única solución posible.
 Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.
 */
package poo3extra.RaicesService;

import poo3extra.Raices;

/**
 *
 * @author PAVILION
 */
public class RaicesService {
    
    public double getDiscriminante(Raices r1){
        double discriminante=(Math.pow(r1.getB(), 2))-4*r1.getA()*r1.getC();
        System.out.println("El valor del discriminante es de: "+discriminante);
        return discriminante;
    }
    public void tieneRaices(Raices r1, double discriminante){
        boolean condicion=false;
        if (discriminante>0) {
            condicion=true;
        }
        System.out.println("¿Tiene dos soluciones?"+condicion);
    }
    public void tieneRaiz(Raices r1, double discriminante){
        boolean condicion2=false;
        if (discriminante==0) {
            condicion2=true;
        }
        System.out.println("¿Tiene una unica solucion?"+condicion2);
    }
//    (-b±√((b^2)-(4*a*c)))/(2*a)
    public void obtenerRaices(Raices r1){
       int a=r1.getA();
        int b=r1.getB();
        int c=r1.getC();
            double raiz1=(-b+Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a);
            double raiz2=(-b-Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a);
            System.out.println("El valor de la primer raiz: "+raiz1);
        System.out.println("El valor de la primera raiz es: "+raiz2);
        
    }
    public void obtenerRaiz(Raices r1){
        int a=r1.getA();
        int b=r1.getB();
        int c=r1.getC();
            double raiz1=(-b+Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a);
            System.out.println("El valor de la raiz es: : "+raiz1);
     
    }
    public void calcularRaiz(Raices r1){
       double discriminante2=getDiscriminante(r1);
        if (discriminante2==0) {
             tieneRaiz(r1, discriminante2);
             obtenerRaiz(r1);
        }else if (discriminante2>0) {
            tieneRaices(r1, discriminante2);
       obtenerRaices(r1); 
        }else{
            System.out.println("No tiene raiz");
        }
            
    }
}
