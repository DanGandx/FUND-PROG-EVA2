/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_31_uso_arreglos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_31_USO_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //GENERAR UN ARREGLO TAMAÑO 15
        //LLENARLO CON VALORES ALEATORIOS
        int[] arreglo = new int[15];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 100);
            
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("¿Que valor necesitas?");
        int valor = input.nextInt();
        int posi = -1; 
        //busqueda
        for (int i = 0; i <  arreglo.length; i++) {
            if(valor == arreglo[i]){
                posi = i;
                break;
            } 
        }
     if(posi != -1)
            System.out.println("EL valor esta en la posicion: " + posi);
     else
            System.out.println("Valor no encontrado");
    }
    
}
