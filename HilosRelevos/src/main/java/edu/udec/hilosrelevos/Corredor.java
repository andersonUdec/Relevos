/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.udec.hilosrelevos;


import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author Anderson Suarez y Albert Charry
 */
public class Corredor extends Thread {

    Equipo equipo;
    private int paso;
    private int pasoFin;
    private String equipoUno;
    private String equipoDos;
    private String equipoTres;
    
    /**
     * Constuctor de la clase 
     * @param equipo
     * @param paso
     * @param pasoFin 
     */
    public Corredor(Equipo equipo, int paso, int pasoFin) {
        this.equipo = equipo;
        this.paso = paso;
        this.pasoFin = pasoFin;
    }
    
    /**
     * Metodo heredado de la clase Thread donde se realizaran validaciones con
     * variables sincronizadas
     */
    
    @Override
    public void run() {
        if (paso == 0) {
            while (true) {
                int pasoActual = posicionPasos(1);
                if (pasoActual >=33) {
                    equipo.setPosicionA(33);
                    synchronized (equipo) {
                        paso = 33;
                        equipo.notifyAll();
                    }
                    break;
                }
            }
        } else {
            synchronized (equipo) {
                try {
                    equipo.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
        if (paso == 33) {
            while (true) {
                int pasoActual = posicionPasos(2);
                if (pasoActual >= 66) {
                    equipo.setPosicionB(66);
                    synchronized (equipo) {
                        paso=66;
                        equipo.notifyAll();             
                    }
                    break;
                }
            }
        } else {
            synchronized (equipo) {
                try {
                    equipo.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
        if (paso == 66) {
            while (true) {
                int pasoActual = posicionPasos(3);
                if (pasoActual >= 100) {
                    equipo.setPosicionC(100);
                    paso=100;
                    System.out.println("Equipo ganador "+ equipo.getNombre());
                    System.exit(0);
                    break;
                }
            }
        } else {
            synchronized (equipo) {
                try {
                    equipo.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
    }
    /**
     * Metodo que suma pasos al trayecto del corredor
     * @param numPosi
     * @return 
     */
    public int posicionPasos(int numPosi) {
        try {
            Thread.sleep(500);            
        } catch (InterruptedException ex) {
            Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE, null, ex);
        }
        int valorAvance = Utilitaria.random();
        if (numPosi == 1) {
            equipo.setPosicionA(equipo.getPosicionA() + valorAvance);
            if(equipo.imprimir().contains("1")){
                equipoUno=equipo.imprimir();      
            }else if(equipo.imprimir().contains("2")){
                equipoDos=equipo.imprimir();
            }else if(equipo.imprimir().contains("3")){
                equipoTres=equipo.imprimir();
            }
            if(equipoUno!=null){
                System.out.println(equipoUno);
            }
            if(equipoDos!=null){
                System.out.println(equipoDos);
            }
            if(equipoTres!=null){
                System.out.println(equipoTres);
            }
            return equipo.getPosicionA();
        }
        if (numPosi == 2) {
            equipo.setPosicionB(equipo.getPosicionB() + valorAvance);
            if(equipo.imprimir().contains("1")){
                equipoUno=equipo.imprimir();
            }else if(equipo.imprimir().contains("2")){
                equipoDos=equipo.imprimir();
            }else if(equipo.imprimir().contains("3")){
                equipoTres=equipo.imprimir();
            }
            if(equipoUno!=null){
                System.out.println(equipoUno);
            }
            if(equipoDos!=null){
                System.out.println(equipoDos);
            }
            if(equipoTres!=null){
                System.out.println(equipoTres);
            }
            return equipo.getPosicionB();
        }
        if (numPosi == 3) {
            equipo.setPosicionC(equipo.getPosicionC() + valorAvance);
            if(equipo.imprimir().contains("1")){
                equipoUno=equipo.imprimir();
            }else if(equipo.imprimir().contains("2")){
                equipoDos=equipo.imprimir();
            }else if(equipo.imprimir().contains("3")){
                equipoTres=equipo.imprimir();
            }
            if(equipoUno!=null){
                System.out.println(equipoUno);
            }
            if(equipoDos!=null){
                System.out.println(equipoDos);
            }
            if(equipoTres!=null){
                System.out.println(equipoTres);
            }
            
            return equipo.getPosicionC();
        }
        return 0;
    }
}
