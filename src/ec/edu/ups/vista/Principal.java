/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorAvestruz;
import ec.edu.ups.controlador.ControladorLeon;
import ec.edu.ups.controlador.ControladorPulpo;
import ec.edu.ups.controlador.ControladorTiburon;
import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int opcionMenuPrincipal = 0;
        int opcionMenuLeon = 0;
        int opcionMenuAvestruz = 0;
        int opcionMenuPulpo = 0;
        int opcionMenuTiburon = 0;
        
        ControladorLeon leon = new ControladorLeon();
        ControladorAvestruz avestruz = new ControladorAvestruz();
        ControladorPulpo pulpo = new ControladorPulpo();
        ControladorTiburon tiburon = new ControladorTiburon();
        
        do{
                    
            System.out.println("MENU PRINCIPAL");
            System.out.println("1. CRUD Leon");
            System.out.println("2. CRUD Avestruz");
            System.out.println("3. CRUD Pulpo");
            System.out.println("4. CRUD Tiburón");
            System.out.println("5. Salir");
            System.out.println("Selecciona una opción");
            opcionMenuPrincipal = entrada.nextInt();
            
            switch(opcionMenuPrincipal){
                case 1: 
                    //opcion para el crud aire acondicionado
                    do{
                        System.out.println("MENU AIRE ACONDICIONADO");
                        System.out.println("1. Create");
                        System.out.println("2. Read");
                        System.out.println("3. Update");
                        System.out.println("4. Delete");
                        System.out.println("5. Regresar al menu principal");
                        System.out.println("Selecciona una opción");
                        opcionMenuLeon = entrada.nextInt();
                        
                        switch(opcionMenuLeon){
                            case 1:
                                    int numDiente;
                                    String fuerzaMordida;
                                    int numGarras;
                                    String tamañoOrejas;
                                    System.out.println("Números de Dientes: ");
                                    numDiente=entrada.nextInt();
                                    System.out.println("Fuerza de la Mordida: ");
                                    fuerzaMordida=entrada.next();
                                    System.out.println("Número de Garras");
                                    numGarras=entrada.nextInt();
                                    System.out.println("Tamaño de las Orejas: ");
                                    tamañoOrejas=entrada.next();
                                //create
                                //pide todos los datos por teclado
                                //instancia un objeto
                                //llama al metodo create del controlador
                                break;
                            case 2:
                                //read
                                //pide el codigo por teclado
                                //llama al metodo read del controlador
                                //visualizo los datos del objeto
                                break;
                            case 3:
                                //update
                                //pide todos los datos por teclado
                                //instancia un objeto
                                //llama al metodo update del controlador
                                break;
                            case 4:
                                //delete
                                //pide el codigo por teclado
                                //llama al metodo delete del controlador
                                break;
                            case 5:
                                //regresar
                                System.out.println("Regresando al menú principal");
                                break;
                        }
                        
                    }while(opcionMenuLeon !=5);
                    break;
                case 2:
                    //opcion para el crud de refrigerador
                    do{
                        
                    }while(opcionMenuAvestruz !=5);
                    break;
                case 3:
                    //opcion para el crud de computador
                    do{
                        
                    }while(opcionMenuPulpo !=5);
                    break;
                case 4:
                    //opcion para el crud de televisor
                    do{
                        
                    }while(opcionMenuTiburon !=5);
                    break;
                case 5:
                    //opcion para salir
                    System.out.println("Adiós !!!");
                    break;
            }
        }while(opcionMenuPrincipal != 5);
    }

}
