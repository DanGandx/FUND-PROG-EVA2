/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_ejercicio_5;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class EVA2_EJERCICIO_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int bas , exp;
        Scanner input= new Scanner(System.in);
        
        System.out.println("Introuduce el numero base");
        bas = input.nextInt();
        
        while (bas < 0){
            System.out.println("LA BASE DEBE SER UN NUMERO POSITIVO");
        }
                
        System.out.println("Introduce el valor del exponente");
        exp = input.nextInt();
        
        while (exp < 0){
            System.out.println("EL EXPONENTE DEBE SER UN NUMERO POSITIVO");
        }
        
        int resultado = 1;
        for (int i = 1; i <= exp; i++) {
            
            resultado *= bas;
        }

        System.out.println("El resultado de " + bas + " elevado a la " + exp + " es: " + resultado);
    
    }
    
}
