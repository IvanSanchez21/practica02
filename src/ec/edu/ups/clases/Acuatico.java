/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 *Esta clase es la segundo padre. 
 * @author ivan
 */
public abstract class Acuatico extends Animal{
    private int numbranquias;
    private int profundidad;
    private int aletas;
    private int branquias;

    public Acuatico() {
    }

    public Acuatico(int numbranquias, int profundidad, int aletas, int branquias) {
        this.numbranquias = numbranquias;
        this.profundidad = profundidad;
        this.aletas = aletas;
        this.branquias = branquias;
    }

    public Acuatico(int numbranquias, int profundidad, int aletas, int branquias, String tipoAnimal, int peso, int tamaño, String habitad) {
        super(tipoAnimal, peso, tamaño, habitad);
        this.numbranquias = numbranquias;
        this.profundidad = profundidad;
        this.aletas = aletas;
        this.branquias = branquias;
    }
    
    
    public int getNumbranquias() {
        return numbranquias;
    }

    public void setNumbranquias(int numbranquias) {
        this.numbranquias = numbranquias;
    }

    public int getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(int profundidad) {
        this.profundidad = profundidad;
    }

    public int getAletas() {
        return aletas;
    }

    public void setAletas(int aletas) {
        this.aletas = aletas;
    }

    public int getBranquias() {
        return branquias;
    }

    public void setBranquias(int branquias) {
        this.branquias = branquias;
    }

    public abstract String nadar();
    
    @Override
    public String toString() {
        return super.toString()+"Acuatico{" + "numbranquias=" + numbranquias + ", profundidad=" + profundidad + ", aletas=" + aletas + ", branquias=" + branquias + '}';
    }
    
    
}
