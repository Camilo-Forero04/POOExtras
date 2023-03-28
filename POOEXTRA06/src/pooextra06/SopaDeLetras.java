/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextra06;

/**
 *
 * @author PAVILION
 */
public class SopaDeLetras {
    private char [] [] sopa= new char [10][10];
    private String palabraUsuario;
    public SopaDeLetras() {
    }

    public SopaDeLetras(String palabraUsuario) {
        this.palabraUsuario = palabraUsuario;
    }

    public char[][] getSopa() {
        return sopa;
    }

    public void setSopa(char[][] sopa) {
        this.sopa = sopa;
    }

    public String getPalabraUsuario() {
        return palabraUsuario;
    }

    public void setPalabraUsuario(String palabraUsuario) {
        this.palabraUsuario = palabraUsuario;
    }
    
}
