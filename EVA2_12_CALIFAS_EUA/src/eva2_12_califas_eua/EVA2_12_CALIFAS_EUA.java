/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_12_califas_eua;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_12_CALIFAS_EUA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int califa;
          Scanner input = new Scanner(System.in);
          System.out.println("Captura tu calificación:");
          califa = input.nextInt();
          
           if((califa >= 0) && (califa <= 100)) {
            System.out.println("La calificación " + califa + " es válida");
             if((califa >= 90) && (califa <= 100))
                System.out.println("Sacaste una A");
             if((califa >= 80) && (califa <= 89))
                System.out.println("Sacaste una B");
            if((califa >= 70) && (califa <= 79))
                System.out.println("Sacaste una C");
           if((califa >= 60) && (califa <= 69))
                System.out.println("Sacaste una D");
            if((califa >= 0) && (califa <= 60))
                System.out.println("Sacaste una F");
               }else
            System.out.println("La calificación " + califa + " No es válida");
    }
    
}
