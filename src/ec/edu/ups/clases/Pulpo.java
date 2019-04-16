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
public class Pulpo extends Acuatico implements Interfaz {
    private int numTentaculo;
    private String tinta;
    private String tamañoPico;
    private int numVentosa;

    public Pulpo() {
    }


    public Pulpo(int numTentaculo, String tinta, String tamañoPico, int numVentosa) {
        this.numTentaculo = numTentaculo;
        this.tinta = tinta;
        this.tamañoPico = tamañoPico;
        this.numVentosa = numVentosa;
    }

    public Pulpo(int numTentaculo, String tinta, String tamañoPico, int numVentosa, int numbranquias, int profundidad, int aletas, int branquias, String tipoAnimal, int peso, int tamaño, String habitad) {
        super(numbranquias, profundidad, aletas, branquias, tipoAnimal, peso, tamaño, habitad);
        this.numTentaculo = numTentaculo;
        this.tinta = tinta;
        this.tamañoPico = tamañoPico;
        this.numVentosa = numVentosa;
    }

    public int getNumTentaculo() {
        return numTentaculo;
    }

    public void setNumTentaculo(int numTentaculo) {
        this.numTentaculo = numTentaculo;
    }

    public String getTinta() {
        return tinta;
    }

    public void setTinta(String tinta) {
        this.tinta = tinta;
    }

    public String getTamañoPico() {
        return tamañoPico;
    }

    public void setTamañoPico(String tamañoPico) {
        this.tamañoPico = tamañoPico;
    }

    public int getNumVentosa() {
        return numVentosa;
    }

    public void setNumVentosa(int numVentosa) {
        this.numVentosa = numVentosa;
    }

    @Override
    public String toString() {
        return super.toString()+"Pulpo{" + "numTentaculo=" + numTentaculo + ", tinta=" + tinta + ", tama\u00f1oPico=" + tamañoPico + ", numVentosa=" + numVentosa + '}';
    }

    @Override
    public String emitirSonido() {
        return super.getTipoAnimal()+" esta haciendo un sonido";
    }

    @Override
    public String moverse() {
        return super.getTipoAnimal()+" esta moviendo con rapidez";
    }

    @Override
    public String nadar() {
        return super.getTipoAnimal()+" esta nadando.";
    }
    
    
}
