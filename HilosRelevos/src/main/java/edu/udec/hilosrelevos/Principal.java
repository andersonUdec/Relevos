/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.udec.hilosrelevos;

/**
 *
 * @author @author Anderson Suarez y Albert Charry
 */
public class Principal {
    
    /**
     * Instancia de las clases para iniciar carrera
     */
    
    Equipo equipo1 = new Equipo("1", 0, 100);
    Equipo equipo2 = new Equipo("2", 0, 100);
    Equipo equipo3 = new Equipo("3", 0, 100);
    Corredor atleta1 = new Corredor(equipo1, 0, 33);
    Corredor atleta2 = new Corredor(equipo2, 0, 33);
    Corredor atleta3 = new Corredor(equipo3, 0, 33);
    Corredor atleta4 = new Corredor(equipo1, 33, 66);
    Corredor atleta5 = new Corredor(equipo2, 33, 66);
    Corredor atleta6 = new Corredor(equipo3, 33, 66);
    Corredor atleta7 = new Corredor(equipo1, 66, 100);
    Corredor atleta8 = new Corredor(equipo2, 66, 100);
    Corredor atleta9 = new Corredor(equipo3, 66, 100);
    
    /**
     * metodo que inicializa hilos
     */
    
    public void iniciar(){
        atleta1.start ();
        atleta1.setPriority(10);   //10
        atleta2.start ();
        atleta2.setPriority(7);   //7
        atleta3.start ();
        atleta3.setPriority(4);   //4
        atleta4.start ();
        atleta4.setPriority(9);   //9
        atleta5.start ();
        atleta5.setPriority(6);   //6
        atleta6.start ();
        atleta6.setPriority(3);   //3
        atleta7.start ();
        atleta7.setPriority(8);   //8
        atleta8.start ();
        atleta8.setPriority(5);   //5
        atleta9.start ();
        atleta6.setPriority(2);  //2

    }
}