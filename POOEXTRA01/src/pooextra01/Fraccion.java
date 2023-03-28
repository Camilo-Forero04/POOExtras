/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextra01;

/**
 *
 * @author PAVILION
 */
public class Fraccion {
    private int denominador;
    private int numerador;
    private int denominador2;
    private int numerador2;

    public Fraccion() {
    }

    public Fraccion(int denominador, int numerador, int denominador2, int numerador2) {
        this.denominador = denominador;
        this.numerador = numerador;
        this.denominador2 = denominador2;
        this.numerador2 = numerador2;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador2() {
        return denominador2;
    }

    public void setDenominador2(int denominador2) {
        this.denominador2 = denominador2;
    }

    public int getNumerador2() {
        return numerador2;
    }

    public void setNumerador2(int numerador2) {
        this.numerador2 = numerador2;
    }
    
}
