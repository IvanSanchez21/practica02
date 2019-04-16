/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.clases.Tiburon;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ivan
 */
public class ControladorTiburon {
   private List<Tiburon> lista;

    public ControladorTiburon() {
        lista = new ArrayList<>();
    }

    public void create(Tiburon objeto) {
        lista.add(objeto);
    }
    
    public Tiburon read(int codigo){
        for (Tiburon tiburon : lista) {
            if(tiburon.getNumHuesos()== codigo){
                return tiburon;
            }
        }
        return null;
    }
    
    public void update(Tiburon objeto){
        for (int i = 0; i < lista.size(); i++) {
            Tiburon elemento = lista.get(i);
            if(elemento.getNumHuesos() == objeto.getNumHuesos()){
                lista.set(i,objeto);
                break;
            }
        }
    }
    
    public void delete(Tiburon objeto){
        for (int i = 0; i < lista.size(); i++) {
            Tiburon elemento = lista.get(i);
            if(elemento.getNumHuesos() == objeto.getNumHuesos()){
                lista.remove(i);
            }
        }
    } 
}
