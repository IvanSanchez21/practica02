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
public class Leon extends Terrestre implements Interfaz {
    private int numDientes;
    private String fuerzaMordida;
    private int medGarras;
    private String tamañoOrejas;

    public Leon() {
    }


    public Leon(int numDientes, String colorPelaje, int numPatas, String tamañoOrejas) {
        this.numDientes = numDientes;
        this.fuerzaMordida = colorPelaje;
        this.medGarras = numPatas;
        this.tamañoOrejas = tamañoOrejas;
    }

    public Leon(int numDientes, String fuerzaMordida, int medGarras, String tamañoOrejas, int numPatas, String colorPelaje, String tamañaOrejas, String tamañoNariz, String tipoAnimal, int peso, int tamaño, String habitad) {
        super(numPatas, colorPelaje, tamañaOrejas, tamañoNariz, tipoAnimal, peso, tamaño, habitad);
        this.numDientes = numDientes;
        this.fuerzaMordida = fuerzaMordida;
        this.medGarras = medGarras;
        this.tamañoOrejas = tamañoOrejas;
    }

    public int getNumDientes() {
        return numDientes;
    }

    public void setNumDientes(int numDientes) {
        this.numDientes = numDientes;
    }

    public String getColorPelaje() {
        return fuerzaMordida;
    }

    public void setColorPelaje(String colorPelaje) {
        this.fuerzaMordida = colorPelaje;
    }

    public int getNumPatas() {
        return medGarras;
    }

    public void setNumPatas(int numPatas) {
        this.medGarras = numPatas;
    }

    public String getTamañoOrejas() {
        return tamañoOrejas;
    }

    public void setTamañoOrejas(String tamañoOrejas) {
        this.tamañoOrejas = tamañoOrejas;
    }

    @Override
    public String toString() {
        return super.toString()+ "Leon{" + "numDientes=" + numDientes + ", colorPelaje=" + fuerzaMordida + ", numPatas=" + medGarras + ", tama\u00f1oOrejas=" + tamañoOrejas + '}';
    }

    @Override
    public String emitirSonido() {
        return super.getTipoAnimal()+" esta rujiendo";
    }

    @Override
    public String moverse() {
        return super.getTipoAnimal()+" esta corriendo";
    }

    @Override
    public String caminar() {
        return super.getTipoAnimal()+" esta caminando";
    }
    
    
    
}
