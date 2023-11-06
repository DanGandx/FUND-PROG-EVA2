/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_26_cilcos_anidados;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_26_CILCOS_ANIDADOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        int num;
          Scanner input = new Scanner(System.in);
          System.out.println("Introduce un número:");
          num = input.nextInt();
          
          for (int i = 1; i <= num; i++) {
              for (int j = 1; j <= i; j++) {
                  System.out.print("*");
              }
              System.out.println("");
              
        }
    
          System.out.println("---------------------------------------------");
           for (int i = num; i >= 1; i--) {
              for (int j = 1; j <= i; j++) {
                  System.out.print("*");
              }
              System.out.println("");
              
               for(int i=1; i<n+(n/2); i++){
            for(int j=n+(n/2); j>i; j--){
                System.out.print(" ");}
            for(int k=1; k<=2*i-1; k++){
                System.out.print("*");}
            System.out.println("");
        }
              
        }
    }
    
}
