/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_ejercicio_9;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class EVA2_EJERCICIO_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String cadena;
        char caracter;
        int acumulador = 0;
        
        System.out.println("Escribe una cadena:");
        cadena = input.next();
        System.out.println("Introduce el caracter que quieres contar: ");
        caracter = input.next().charAt(0);
        
        for (int i = 0; i < cadena.length(); i++) {
         if (caracter == cadena.charAt(i) ){
             acumulador++;
         }
            
        }
        System.out.println("-----------------");
        System.out.println("Se encontro " + acumulador + " veces el caracter " + caracter +" en la cadena " + cadena);
    }
    
}
