/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_ejercicio_10;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class EVA2_EJERCICIO_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String cadena;
        int help = -1;
        
     
        System.out.println("Introduce una texto para verificarlo: ");
        cadena = input.next();
        
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i)== '1' ||cadena.charAt(i)== '2' || cadena.charAt(i)== '3' ||cadena.charAt(i)== '4' ||cadena.charAt(i)== '5' ||cadena.charAt(i)== '6' ||cadena.charAt(i)== '7' ||cadena.charAt(i)== '8' ||cadena.charAt(i)== '9') {
                help = i;
                
                break;
            }
        }
        if (help != -1 ){
            System.out.println("No es un texto valido");
            
        }else 
            System.out.println("Es un texto valido");
            
     
}
}
    





      

