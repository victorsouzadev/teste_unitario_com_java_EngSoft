/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unifesspa.faceel.fatorial;


public class Programa {

    public static void main(String[] args) {
        Fatorial fatorial = new Fatorial();
        
        
                
        System.out.println("\nFatorial");
        System.out.println("Fatorial não recursivo: "+fatorial.calculoNaoRecursivo(5));
        System.out.println("Fatorial recursivo: "+fatorial.calculoRecursivo(5));
    }
}
