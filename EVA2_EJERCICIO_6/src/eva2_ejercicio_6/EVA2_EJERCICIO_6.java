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
        System.out.println("Introduce el numero que quieres convertir a binario");
        num = input.nextInt();
        System.out.print("El resultado es = ");
        while (num != 0) {
           resi = (num%2);
           bin += resi*Math.pow(10, apoy);
           apoy++;
           num/=2;
       }
        System.out.println(bin);
        
    }
    
}
