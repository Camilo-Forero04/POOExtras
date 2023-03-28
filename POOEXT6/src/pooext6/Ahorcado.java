/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooext6;

/**
 *
 * @author PAVILION
 */
public class Ahorcado {
    private int cantidadDeLetrasEncontradas;
    private int cantidadJugadasMaximas;
    private String [] vectorPalabra;
    
    public Ahorcado() {
    }

    public Ahorcado(int cantidadDeLetrasEncontradas, int cantidadJugadasMaximas, String[] vectorPalabra) {
        this.cantidadDeLetrasEncontradas = cantidadDeLetrasEncontradas;
        this.cantidadJugadasMaximas = cantidadJugadasMaximas;
        this.vectorPalabra = vectorPalabra;
    }

    public String[] getVectorPalabra() {
        return vectorPalabra;
    }

    public void setVectorPalabra(String[] vectorPalabra) {
        this.vectorPalabra = vectorPalabra;
    }

    public int getCantidadDeLetrasEncontradas() {
        return cantidadDeLetrasEncontradas;
    }

    public void setCantidadDeLetrasEncontradas(int cantidadDeLetrasEncontradas) {
        this.cantidadDeLetrasEncontradas = cantidadDeLetrasEncontradas;
    }

    public int getCantidadJugadasMaximas() {
        return cantidadJugadasMaximas;
    }

    public void setCantidadJugadasMaximas(int cantidadJugadasMaximas) {
        this.cantidadJugadasMaximas = cantidadJugadasMaximas;
    }
    
    
}
