/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_20_while_retiros;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_20_WHILE_RETIROS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int saldo = 1000;
         Scanner input = new Scanner(System.in);
        
        while(saldo > 0) { //MIENTRAS HAYA SALDO, SE PUEDE RETIRAR
            System.out.println("¿CUÁNTO DESEAS RETIRAR?");
            int retiro = input.nextInt();
                   saldo -= retiro;
                    System.out.println("TE QUEDAN$" + saldo + " DE SALDO");
                    
                    
        }
    }
    
}
