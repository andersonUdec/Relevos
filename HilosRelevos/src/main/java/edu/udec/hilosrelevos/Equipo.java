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
public class Equipo extends Thread {
    
   /**
    * Declaracion de variables
    */
    
    public static final String ANSI_RESET = "\u001B[0m";
    
    public static final String ANSI_RED = "\u001B[31m";
    
    public static final String ANSI_GREEN = "\u001B[32m";
    
    public static final String ANSI_BLUE = "\u001B[34m";
    
    private String nombre;
  
    private int inicio;
   
    private int fin;
    
    private int posicionA;
   
    private int posicionB;
    
    private int posicionC;


   /**
    * Constructor de la clase
    * @param nombre
    * @param inicio
    * @param fin 
    */
    public Equipo(String nombre, int inicio, int fin) {
        this.nombre = nombre;
        this.inicio = inicio;
        this.fin = fin;
        this.posicionA = 0;
        this.posicionB = 33;
        this.posicionC = 66;
    }
    /**
     * metodo sincronizado que imprime posiciones de los 
     * corredores
     * @return 
     */
    public synchronized String imprimir(){
       String trayecto = "Equipo: "+nombre+" ";
       if(nombre.contains("1")){
        for (int i = inicio; i <= fin; i++) {
            if (i == posicionA) {
                trayecto +=ANSI_RED+ "A" ;
            } else if (i == posicionB) {
                trayecto += ANSI_RED+ "B";
            } else if (i == posicionC) {
                trayecto +=ANSI_RED+  "C";
            } else {
                trayecto += ANSI_RED+"_"+ANSI_RESET;
            }    
            
        }
       }else if(nombre.contains("2")){
        for (int i = inicio; i <= fin; i++) {
            if (i == posicionA) {
                trayecto +=ANSI_BLUE+  "A";
            } else if (i == posicionB) {
                trayecto += ANSI_BLUE+ "B";
            } else if (i == posicionC) {
                trayecto += ANSI_BLUE+ "C";
            } else {
                trayecto += ANSI_BLUE+ "_"+ANSI_RESET;
            }
        }
       }else if(nombre.contains("3")){
        for (int i = inicio; i <= fin; i++) {
            if (i == posicionA) {
                trayecto +=ANSI_GREEN+ "A";
            } else if (i == posicionB) {
                trayecto += ANSI_GREEN+"B";
            } else if (i == posicionC) {
                trayecto +=ANSI_GREEN+ "C";
            } else {
                trayecto += ANSI_GREEN+"_"+ANSI_RESET;
            }
        }
       }
       return trayecto;
    }
    /**
     * Metodo que retorna
     * @return 
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo que recibe
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Metodo que retorna
     * @return 
     */
    public int getInicio() {
        return inicio;
    }
    /**
     * Metodo que recibe
     * @param inicio 
     */
    public void setInicio(int inicio) {
        this.inicio = inicio;
    }
    /**
     * Metodo que retorna
     * @return 
     */
    public int getFin() {
        return fin;
    }
    /**
     * Metodo que recibe
     * @param fin 
     */
    public void setFin(int fin) {
        this.fin = fin;
    }
    /**
     * Metodo que retorna
     * @return 
     */
    public int getPosicionA() {
        return posicionA;
    }
    /**
     * Metodo que recibe
     * @param posicionA 
     */
    public void setPosicionA(int posicionA) {
        this.posicionA = posicionA;
    }
    /**
     * Metodo que retorna
     * @return 
     */
    public int getPosicionB() {
        return posicionB;
    }
    /**
     * Metodo que recibe
     * @param posicionB 
     */
    public void setPosicionB(int posicionB) {
        this.posicionB = posicionB;
    }
    /**
     * Metodo que retorna
     * @return 
     */
    public int getPosicionC() {
        return posicionC;
    }
   /**
    * Metodo que recibe
    * @param posicionC 
    */
    public void setPosicionC(int posicionC) {
        this.posicionC = posicionC;
    }
    
}
