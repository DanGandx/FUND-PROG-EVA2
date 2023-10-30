/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_19_while_infinito;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_19_WHILE_INFINITO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int num = 100;
       int capt = 0;
       Scanner input = new Scanner(System.in);
       
       while(true){ //CICLO INFINITO, POKR SI SOLO,  NUNCA SE VA A DETENER
           System.out.println("Introduce un número:");
            capt = input.nextInt();
           if(capt == num){
               System.out.println("LE ATINASTE");
               break; //ROMPER --> DETIENE LA EJECUCUIÓN DEL CICLO
           }
       }
    }
    
}
