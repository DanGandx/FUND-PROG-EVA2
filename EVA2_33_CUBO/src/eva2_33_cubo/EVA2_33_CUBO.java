/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_33_cubo;

/**
 *
 * @author invitado
 */
public class EVA2_33_CUBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][][] cubo = new int [3][4][6];
        
        for (int i = 0; i < cubo.length; i++) {
            for (int j = 0; j < cubo[i].length; j++) {
                for (int k = 0; k < cubo[i][j].length; k++) {
                    cubo[i][j][k] = (int)(Math.random() * 100);
                }
            }
        }
         for (int i = 0; i < cubo.length; i++) {
            for (int j = 0; j < cubo[i].length; j++) {
                for (int k = 0; k < cubo[i][j].length; k++) {
                    System.out.print("{" + cubo[i][j][k] + "}");
                    
                }
                System.out.println("");
            }
          System.out.println("");
          System.out.println("");
        }
         
    }
    
}
