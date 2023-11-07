/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_ejercicio_2;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_EJERCICIO_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int num1, num2;
        
          System.out.println("Introduce un número:");
            num1 = input.nextInt();
             System.out.println("Introduce un segundo número:");
            num2 = input.nextInt();
            
            if ((num1<0)||(num2<0)){
                System.out.println("Uno o más valores son negativos");
                return;
            }
            
             if (num1 > num2){
                 for (int i = num2; i <= num1; i++) {
                        if ((i % 2) == 0)
                     System.out.print( i + " - ");
                 }   
             }else if (num2 > num1){
                 for (int j = num1; j <= num2; j++) {
                       if ((j % 2) == 0)
                     System.out.print( j + " - ");
                 } 
             }
                 else
                 System.out.println("Los números son iguales");
    }
    
}
