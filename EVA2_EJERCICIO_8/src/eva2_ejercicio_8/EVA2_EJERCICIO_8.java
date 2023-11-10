/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_ejercicio_8;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class EVA2_EJERCICIO_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner input = new Scanner(System.in);
          String caracter;
          
          while (true) {
          System.out.println("Introduce un caracter(para cerrar introduce un espacio en blanco):");
          caracter = input.nextLine();
         
          if (caracter.length() != 1) {
                System.out.println("Por favor solo utiliza un caracter.");
                System.out.println("");
                continue;
            }
          
          if (caracter.equals(" ")) {
              System.out.println("Terminando programa...");
              break;
          } 
              switch(caracter.charAt(0)){
            case 'a':                         
            case 'e':                     
            case 'i':                            
            case 'o':                         
            case 'u':                      
            case 'A':                         
            case 'E':                         
            case 'I':                          
            case 'O':                       
            case 'U': 
                System.out.println(caracter + " es una vocal.");
                break;
            default:               
                    System.out.println(caracter + " es una consonante.");
                    break;
              }
          }
    }
    }
