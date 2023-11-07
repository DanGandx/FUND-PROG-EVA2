/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_ejercicio_3;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_EJERCICIO_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner input = new Scanner(System.in);
        int num, sum;
        
         System.out.println("Introduce un número:");
            num = input.nextInt();
            
           sum = num;
        
         for (int i = 1; i <= num; i++) {
            System.out.print(i + " + ");
             sum = sum + i;
                    
                    }
         System.out.println(" = " + sum);
    }
    
}
