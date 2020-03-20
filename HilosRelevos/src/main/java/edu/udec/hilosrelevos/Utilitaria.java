/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.udec.hilosrelevos;

import java.util.Random;

/**
 *
 * @author @author Anderson Suarez y Albert Charry
 */
public class Utilitaria {
    
    /**
     * Metodo que retorna numeros aleatorios
     * @return 
     */
    
    public static int random(){
        double i=Math.random()*100;
        int j=(int) i;
      
        if(j<33){
            j=1;
        }
        else if(j>=33&&j<66){
            j=2;
        }
        else if(j>=66&&j<=100){
            j=3;
        }
        return j;
    } 
}
