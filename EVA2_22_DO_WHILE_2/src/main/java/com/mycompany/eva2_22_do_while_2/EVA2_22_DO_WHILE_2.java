/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_22_do_while_2;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class EVA2_22_DO_WHILE_2 {
final static String NOMBRE_USUARIO= "Admin";
final static String PASWORD= "Admin";
    public static void main(String[] args) {
         String usuario;
        String pwd;
     Scanner input = new Scanner(System.in);
     do{
         System.out.println("Introduce tu usuario");
         usuario = input.nextLine();
         System.out.println("Inroduce tu contraseña");
         pwd = input.nextLine();         
     }while((!usuario.equals(NOMBRE_USUARIO))||(!pwd.equals(PASWORD)));
        System.out.println("Bienvenido al sistema");
    }
}
