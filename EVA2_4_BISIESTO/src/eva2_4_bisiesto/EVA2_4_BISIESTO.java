/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_4_bisiesto;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_4_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          int year, residuo;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce el año a evaluar:");
        year = input.nextInt();
        
        residuo = year % 4;
        if (residuo == 0){
            residuo = year % 100;
             if (residuo == 0){
                 residuo = year % 400;
                 if (residuo == 0){
                     System.out.println("ES AÑO BISIESTO");
                 }else
                     System.out.println("NO ES AÑO BISIESTO");
                 
             }else
                        System.out.println("ES AÑO BISIESTO");
             
        }else
                                System.out.println("NO ES AÑO BISIESTO");
    }
    
}
