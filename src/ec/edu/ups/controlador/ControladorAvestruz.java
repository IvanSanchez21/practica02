/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.clases.Avestruz;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ivan
 */
public class ControladorAvestruz {

    private List<Avestruz> lista;

    public ControladorAvestruz() {
        lista = new ArrayList<>();
    }

    public void create(Avestruz objeto) {
        lista.add(objeto);
    }
    
    public Avestruz read(int codigo){
        for (Avestruz avestruz : lista) {
            if(avestruz.getCantidadHuevos()== codigo){
                return avestruz;
            }
        }
        return null;
    }
    
    public void update(Avestruz objeto){
        for (int i = 0; i < lista.size(); i++) {
            Avestruz elemento = lista.get(i);
            if(elemento.getCantidadHuevos()== objeto.getCantidadHuevos()){
                lista.set(i,objeto);
                break;
            }
        }
    }
    
    public void delete(Avestruz objeto){
        for (int i = 0; i < lista.size(); i++) {
            Avestruz elemento = lista.get(i);
            if(elemento.getCantidadHuevos()== objeto.getCantidadHuevos()){
                lista.remove(i);
            }
        }
    }
}

