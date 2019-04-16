/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.clases.Leon;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ivan
 */
public class ControladorLeon {

    private List<Leon> lista;

    public ControladorLeon() {
        lista = new ArrayList<>();
    }

    public void create(Leon objeto) {
        lista.add(objeto);
    }
    
    public Leon read(int codigo){
        for (Leon leon : lista) {
            if(leon.getNumDientes() == codigo){
                return leon;
            }
        }
        return null;
    }
    
    public void update(Leon objeto){
        for (int i = 0; i < lista.size(); i++) {
            Leon elemento = lista.get(i);
            if(elemento.getNumDientes()== objeto.getNumDientes()){
                lista.set(i,objeto);
                break;
            }
        }
    }
    
    public void delete(Leon objeto){
        for (int i = 0; i < lista.size(); i++) {
            Leon elemento = lista.get(i);
            if(elemento.getNumDientes()== objeto.getNumDientes()){
                lista.remove(i);
            }
        }
    }
}
