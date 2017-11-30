/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice;

/**
 *
 * @author cice
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    static double  num = 2;
    public static void main(String[] args) {
        // TODO code application logic here
        // PREGUNTA EXAMEN
        // int a = 110_001_321;
        // log b = 1234_ 2345_4577_3456L; sirve por ejemplo para tarjetas de credito, pero ni se imprime ni nada es para programar
        //log b = 1234_ 2345_4577_3456l;
        // no da error de compilacion porque lo entiente como separador de miles
        
        
        System.out.println("El cuadrado de "+ num + " es  "+ Math.pow(num, 2));
    }
    
}
