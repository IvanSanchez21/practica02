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
public class Avestruz extends Terrestre implements Interfaz {
    private String colorPlumaje;
    private String tamañoPico;
    private String tamañoAlas;
    private int cantidadHuevos;

    public Avestruz() {
    }

    public Avestruz(String colorPlumaje, String tamañoPico, String tamañoAlas, int cantidadHuevos) {
        this.colorPlumaje = colorPlumaje;
        this.tamañoPico = tamañoPico;
        this.tamañoAlas = tamañoAlas;
        this.cantidadHuevos = cantidadHuevos;
    }

    public Avestruz(String colorPlumaje, String tamañoPico, String tamañoAlas, int cantidadHuevos, int numPatas, String colorPelaje, String tamañaOrejas, String tamañoNariz, String tipoAnimal, int peso, int tamaño, String habitad) {
        super(numPatas, colorPelaje, tamañaOrejas, tamañoNariz, tipoAnimal, peso, tamaño, habitad);
        this.colorPlumaje = colorPlumaje;
        this.tamañoPico = tamañoPico;
        this.tamañoAlas = tamañoAlas;
        this.cantidadHuevos = cantidadHuevos;
    }
    
    

    public String getColorPlumaje() {
        return colorPlumaje;
    }

    public void setColorPlumaje(String colorPlumaje) {
        this.colorPlumaje = colorPlumaje;
    }

    public String getTamañoPico() {
        return tamañoPico;
    }

    public void setTamañoPico(String tamañoPico) {
        this.tamañoPico = tamañoPico;
    }

    public String getTamañoAlas() {
        return tamañoAlas;
    }

    public void setTamañoAlas(String tamañoAlas) {
        this.tamañoAlas = tamañoAlas;
    }

    public int getCantidadHuevos() {
        return cantidadHuevos;
    }

    public void setCantidadHuevos(int cantidadHuevos) {
        this.cantidadHuevos = cantidadHuevos;
    }

    @Override
    public String toString() {
        return super.toString()+"Avestruz{" + "colorPlumaje=" + colorPlumaje + ", tama\u00f1oPico=" + tamañoPico + ", tama\u00f1oAlas=" + tamañoAlas + ", cantidadHuevos=" + cantidadHuevos + '}';
    }

    @Override
    public String moverse() {
        return super.getTipoAnimal()+" se esta moviendo";
        
    }
    
    @Override
    public String emitirSonido() {
        return super.getTipoAnimal()+" esta haciendo sonidos";
        
    }

    @Override
    public String caminar() {
        return super.getTipoAnimal()+" esta caminando";
    }
}
