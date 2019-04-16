/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 * Esta clase es la padre ya que hereda atributos y metodos de sus hijas.
 *
 * @author ivan
 */
public abstract class Terrestre extends Animal {

    private int numPatas;
    private String colorPelaje;
    private String tamañaOrejas;
    private String tamañoNariz;

    public Terrestre() {
    }

    public Terrestre(int numPatas, String colorPelaje, String tamañaOrejas, String tamañoNariz) {
        this.numPatas = numPatas;
        this.colorPelaje = colorPelaje;
        this.tamañaOrejas = tamañaOrejas;
        this.tamañoNariz = tamañoNariz;
    }

    public Terrestre(int numPatas, String colorPelaje, String tamañaOrejas, String tamañoNariz, String tipoAnimal, int peso, int tamaño, String habitad) {
        super(tipoAnimal, peso, tamaño, habitad);
        this.numPatas = numPatas;
        this.colorPelaje = colorPelaje;
        this.tamañaOrejas = tamañaOrejas;
        this.tamañoNariz = tamañoNariz;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }

    public String getTamañaOrejas() {
        return tamañaOrejas;
    }

    public void setTamañaOrejas(String tamañaOrejas) {
        this.tamañaOrejas = tamañaOrejas;
    }

    public String getTamañoNariz() {
        return tamañoNariz;
    }

    public void setTamañoNariz(String tamañoNariz) {
        this.tamañoNariz = tamañoNariz;
    }

    public abstract String caminar();

    @Override
    public String toString() {
        return super.toString() + "Terrestre{" + "numPatas=" + numPatas + ", colorPelaje=" + colorPelaje + ", tama\u00f1aOrejas=" + tamañaOrejas + ", tama\u00f1oNariz=" + tamañoNariz + '}';
    }

}
