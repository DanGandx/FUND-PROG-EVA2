/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_ejercicio_4;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class EVA2_EJERCICIO_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int num;
        String res;
       
        while (true){
        System.out.println("Introduce un numero: ");
        num = input.nextInt();
        
        if (num > 0) {
            System.out.println("El numero " + num + " es postivo");
        }else if (num < 0) {
            System.out.println("El numero " + num + " es negativo");
        }else if (num == 0) {
            System.out.println("El numero " + num + " es igual a cero");
        }
        
        System.out.println("¿Deseas terminar el programa? (si/no)");
        res = input.next();
        
        if (res.equals("si") || res.equals("Si") || res.equals("SI")){
            System.out.println("va");
            break;
        }
    }
    }
}
