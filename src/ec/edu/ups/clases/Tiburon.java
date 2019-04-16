/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import ec.edu.ups.interfaces.Interfaz;

/**
 *
 * @author ivan
 */
public class Tiburon extends Acuatico implements Interfaz{
    private String tipoTiburon;
    private int numHuesos;
    private int numDientes;
    private int numVertebras;

    public Tiburon() {
    }

    public Tiburon(String tipoTiburon, int numHuesos, int numDientes, int numVertebras) {
        this.tipoTiburon = tipoTiburon;
        this.numHuesos = numHuesos;
        this.numDientes = numDientes;
        this.numVertebras = numVertebras;
    }

    public Tiburon(String tipoTiburon, int numHuesos, int numDientes, int numVertebras, int numbranquias, int profundidad, int aletas, int branquias, String tipoAnimal, int peso, int tamaño, String habitad) {
        super(numbranquias, profundidad, aletas, branquias, tipoAnimal, peso, tamaño, habitad);
        this.tipoTiburon = tipoTiburon;
        this.numHuesos = numHuesos;
        this.numDientes = numDientes;
        this.numVertebras = numVertebras;
    }
    
    public String getTipoTiburon() {
        return tipoTiburon;
    }

    public void setTipoTiburon(String tipoTiburon) {
        this.tipoTiburon = tipoTiburon;
    }

    public int getNumHuesos() {
        return numHuesos;
    }

    public void setNumHuesos(int numHuesos) {
        this.numHuesos = numHuesos;
    }

    public int getNumDientes() {
        return numDientes;
    }

    public void setNumDientes(int numDientes) {
        this.numDientes = numDientes;
    }

    public int getNumVertebras() {
        return numVertebras;
    }

    public void setNumVertebras(int numVertebras) {
        this.numVertebras = numVertebras;
    }

    @Override
    public String toString() {
        return super.toString()+ "Tiburon{" + "tipoTiburon=" + tipoTiburon + ", numHuesos=" + numHuesos + ", numDientes=" + numDientes + ", numVertebras=" + numVertebras + '}';
    }

    @Override
    public String emitirSonido() {
        return super.getTipoAnimal()+" esta haciendo sonidos muy agudos.";
    }

    @Override
    public String moverse() {
        return super.getTipoAnimal()+" esta nadando muy rapido.";
    }

    @Override
    public String nadar() {
        return super.getTipoAnimal()+" esta nadando muy veloz";
    }
    
    
}
