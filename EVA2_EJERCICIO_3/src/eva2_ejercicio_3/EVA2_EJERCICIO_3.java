/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_ejercicio_3;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class EVA2_EJERCICIO_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner input = new Scanner(System.in);
        int num;
         System.out.println("Introduce un numero:");
            num = input.nextInt();
            
          int factorial = 0;
        
         for (int i = 1; i <= num; i++) {
            System.out.print(i + " + ");
             factorial = factorial + i;
                    
                    }
         System.out.println(" = " + factorial);
    }
    
}
