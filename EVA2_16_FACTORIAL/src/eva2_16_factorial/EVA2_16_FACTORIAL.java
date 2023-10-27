/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_16_factorial;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_16_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el número a capturar");
        num = input.nextInt();
        int factorial = 2;
        
         for (int i = 1; i <= num; i++) {
            System.out.print(i + " x ");
             factorial = factorial * i;
                    
                    }
         System.out.println(" = " + factorial);
         
         
         for (int i = 1; i >= num; i--) {
            System.out.print(i + " x ");
             factorial = factorial * i;
                    
                    }
         System.out.println(" = " + factorial);
    }
    
}
