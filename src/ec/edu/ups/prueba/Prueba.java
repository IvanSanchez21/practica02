/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.prueba;

import ec.edu.ups.clases.Acuatico;
import ec.edu.ups.clases.Animal;
import ec.edu.ups.clases.Avestruz;
import ec.edu.ups.clases.Leon;
import ec.edu.ups.clases.Pulpo;
import ec.edu.ups.clases.Terrestre;
import ec.edu.ups.clases.Tiburon;
import java.util.ArrayList;
import java.util.List;

/**
 *Esta es la clase prueba, en donde el codigo se ejecuta.
 * @author ivan
 */
public class Prueba {

    public static void main(String args[]) {
        Tiburon tiburon = new Tiburon("Tiburon Martillo", 58, 76, 97, 2, 8, 3, 3, "Tiburon", 50, 12, "Acuatico");
        Pulpo pulpo = new Pulpo(8, "negra", "pequeño", 25, 2, 5, 3, 3, "Pulpo", 34, 5, "Acuatico");
        Leon leon = new Leon(25, "fuerte", 4, "grandes", 4, "cafe", "grandes", "pequeña", "León", 200, 3, "Terrestre");
        Avestruz avestruz = new Avestruz("blanco y plomo", "grande", "grandes", 2, 2, "Blanco", "pequeñas", "pequeña", "Terrestre", 34, 5, "Terrestre");

        List<Animal> animal = new ArrayList<>();
        animal.add(leon);
        animal.add(avestruz);
        animal.add(pulpo);
        animal.add(tiburon);

        for (Animal obj : animal) {
            if (obj instanceof Leon) {
                Leon tem = (Leon) obj;
                System.out.println(tem);
            } else if (obj instanceof Avestruz) {
                Avestruz tem = (Avestruz) obj;
                System.out.println(tem);
            } else if (obj instanceof Pulpo) {
                Pulpo tem = (Pulpo) obj;
                System.out.println(tem);
            } else if (obj instanceof Tiburon) {
                Tiburon tem = (Tiburon) obj;
                System.out.println(tem);
            }
        }
        
        Terrestre te = new Terrestre(4, "cafe", "pequeñas", "pequeña", "Leon", 3, 6, "Terrestre") {
            @Override
            public String caminar() {
               return " esta caminado";
            }
        };
        
        System.out.println(te);
        System.out.println(te.caminar());
    }

}
