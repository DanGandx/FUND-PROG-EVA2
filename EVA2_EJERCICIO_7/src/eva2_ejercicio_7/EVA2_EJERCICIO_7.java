/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_ejercicio_7;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class EVA2_EJERCICIO_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Integer.MAX_VALUE
        Scanner input = new Scanner(System.in);
        int num;
        int min =  Integer.MAX_VALUE; //asignar el máximo número entero posible
        int max = 0;
        
        System.out.println("Introduce numeros positivos (o cero) y finaliza introduciendo un valor negativo");
        while (true){
            System.out.println("Introduce un numero: ");
            num = input.nextInt();
             
            if (num < 0) {
                break;
            }
            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            
             } 
        
           
        }
            System.out.println("El numero mas chico introducido es: " + min);
            System.out.println("El numero mas grande introducido es: " + max);
                
            
        
    }
    
}
