/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_10_carreras;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_10_CARRERAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          System.out.println(" Introduce la siglas de tu carrera");
            Scanner input = new Scanner(System.in);
            String sigl;
            sigl=input.nextLine();
                
                 switch(sigl){
                     case ("ISC"): 
                        System.out.println("Ingenieria en Sistemas Computacionales");
                        break;
                     case "IF": 
                        System.out.println("Ingenieria Informatica");
                         break;
                     case "IGE": 
                        System.out.println("Ingenieria en Gestion Empresarial");
                        break;
                     case "IND":
                        System.out.println("Ingenieria Industrial");
                        break;
                     case "IDI": 
                        System.out.println("Ingenieria en Disenio Industrial");
                        break;
                     case "LA": 
                        System.out.println("Licenciatura en Administracion");
                        break;
                     case "ARQ": 
                        System.out.println("Arquitectura");
                        break;
                        default;
                            System.out.println("No hay datos para la sigla " + sigl);
                 }
    }
    
}
