/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 *Esta clase abuelo es la que hereda atributos y metodos de sus padres e hijos.
 * @author ivan
 */
public class Animal {
    private String tipoAnimal;
    private int peso;
    private int tamaño;
    private String habitad;

    public Animal() {
    }

    public Animal(int peso, int tamaño) {
        this.peso = peso;
        this.tamaño = tamaño;
    }

    public Animal(String tipoAnimal, int peso, int tamaño, String habitad) {
        this.tipoAnimal = tipoAnimal;
        this.peso = peso;
        this.tamaño = tamaño;
        this.habitad = habitad;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public String getHabitad() {
        return habitad;
    }

    public void setHabitad(String habitad) {
        this.habitad = habitad;
    }

    @Override
    public String toString() {
        return "Animal{" + "tipoAnimal=" + tipoAnimal + ", peso=" + peso + ", tama\u00f1o=" + tamaño + ", habitad=" + habitad + '}';
    }
    
    
    
    
}
