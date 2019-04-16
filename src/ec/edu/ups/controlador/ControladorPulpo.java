/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.clases.Pulpo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ivan
 */
public class ControladorPulpo {
    private List<Pulpo> lista;

    public ControladorPulpo() {
        lista = new ArrayList<>();
    }

    public void create(Pulpo objeto) {
        lista.add(objeto);
    }
    
    public Pulpo read(int codigo){
        for (Pulpo pulpo : lista) {
            if(pulpo.getNumTentaculo()== codigo){
                return pulpo;
            }
        }
        return null;
    }
    
    public void update(Pulpo objeto){
        for (int i = 0; i < lista.size(); i++) {
            Pulpo elemento = lista.get(i);
            if(elemento.getNumTentaculo() == objeto.getNumTentaculo()){
                lista.set(i,objeto);
                break;
            }
        }
    }
    
    public void delete(Pulpo objeto){
        for (int i = 0; i < lista.size(); i++) {
            Pulpo elemento = lista.get(i);
            if(elemento.getNumTentaculo() == objeto.getNumTentaculo()){
                lista.remove(i);
            }
        }
    }
}
