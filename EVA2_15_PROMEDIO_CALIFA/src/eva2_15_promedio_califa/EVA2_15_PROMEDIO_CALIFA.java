/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_15_promedio_califa;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_15_PROMEDIO_CALIFA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cantCali;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el número de calificaciones a capturar");
        cantCali = input.nextInt();
        int sumaCalifas = 0;
        
        //ACUMULADOR
        for (int i = 0; i < cantCali; i++) {
            System.out.println("Introduce la calificacion: ");
           int califa = input.nextByte();
           //ACUMULADOR
           sumaCalifas = sumaCalifas + califa;
           //SumaCalifas+= califa
           
        }
        System.out.println("LA SUMATORIA = " + sumaCalifas);
        double promedio = sumaCalifas / (cantCali * 1.0);
        System.out.println("El promedio de calificaciones es = " + promedio);
    }
    
}
