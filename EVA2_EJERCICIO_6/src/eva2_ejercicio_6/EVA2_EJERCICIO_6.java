/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_ejercicio_6;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class EVA2_EJERCICIO_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num, bin;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el numero que quieres convertir a decimal");
        num = input.nextInt();
        System.out.print("El resultado es = ");
        for (int i = 0; i < num; i++) {
            bin = i % 2;
         System.out.print(bin);
        }
        
    }
    
}
