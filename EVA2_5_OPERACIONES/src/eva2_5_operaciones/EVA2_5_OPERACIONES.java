/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_5_operaciones;

/**
 *
 * @author invitado
 */
public class EVA2_5_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //OPERADOR --> SÍMBOLO QUE EJECUTA ALGUNA ACCIÓN
        
        //SUMA --> +
        int suma, val1, val2;
        val1 = 100;
        val2 = 200;
        suma = val1 + val2;//suma aritmética
        System.out.println("SUMA ---------------");
        System.out.println("La suma es = " + suma);//poncatenación
        
        //RESTA -->
        int resta;
        resta = val1 - val2;
        System.out.println("RESTA --------------");
        System.out.println("La resta es = " + resta);
        
        //MULTIPLICACIÓN --> *
        int multi;
        multi = val1 * val2;
        System.out.println("MULTIPLICACIÓN ------------");
        System.out.println("La multiplicación es = " + multi);
        
        //DIVISIÓN --> /
        val1 = 2;
        val2 = 11;
        int div;
        div = val2 / val1;
        System.out.println("DIVISIÓN -------------");
        System.out.println("La división es = " + div);
        int residuo = val2 % val1;
        System.out.println("El residuo es = " + residuo);
        //----
        double resu = val2/val1;
        System.out.println("El resultado = " + resu);
        double val2Double =2;
        resu = val2/val2Double;
        System.out.println("La división es = " + resu);
        //int resu2 = 11 / 2.0;//pérdida de información
        System.out.println("La división = " + resu);
        
        //POTENCIA --> No hay operador de potencia
       double potencia = Math.pow(3, 3);
       System.out.println("POTENCIA ---------------");
       System.out.println("3 elevado a la 3 es = " + potencia);
        
       //RAÍZ --> NO HAY OPERADOR
       double raiz = Math.pow(100, 0.5);
       System.out.println("RAÍZ --------------");
       System.out.println("La raíz de 100 es = " + raiz);
       
       //procedencia de operadores
       int resuOp, x = 3,  y = 2, z = 5;
       resuOp = (x*z) + (x*y) / 2 - (y - z);
                //(15) + (6) / 2 - (-3)
                //15 + 3 - (-3)
                //15 + 3 +3 = 21
       System.out.println("OPERADORES ----------");
       System.out.println("El resultado es = " + resuOp);
       
       //FORMULA GENERAL
       double resuForm, a = 3, b = 9, c = 3;
       resuForm = (-b + (Math.sqrt(Math.pow(b, 2) - (4 * a * c)))) / (2 * a);
        System.out.println("FORMULA GENERAL ---------");
        System.out.println("El resultado es = " + resuForm);
      resuForm = (-b - (Math.sqrt(Math.pow(b, 2) - 4 * a * c))) / (2 * a);
       System.out.println("El resultado es = " + resuForm);
    }
    
}
