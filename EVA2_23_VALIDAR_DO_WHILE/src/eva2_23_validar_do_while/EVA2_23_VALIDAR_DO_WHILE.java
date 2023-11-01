/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_23_validar_do_while;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_23_VALIDAR_DO_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor;
       
         Scanner input = new Scanner(System.in);
         
         do{
             System.out.println("Introduce un valor entero: ");
             valor = input.nextInt();
         }while(true);
    }
    
}
