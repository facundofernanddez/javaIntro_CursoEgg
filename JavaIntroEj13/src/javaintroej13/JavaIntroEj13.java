/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     * 
* * * *
 */
package javaintroej13;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class JavaIntroEj13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Escriba el numero de dimension que quiera dibujar el cuadrado");
        Scanner leer = new Scanner(System.in);
        int num = leer.nextInt();
        String ast = "*";
        
        if (num > 0) {
           for (int i = 0; i < num; i++) {
            System.out.print(ast);
            }
           
            System.out.println();
           
           for (int i = 0; i < num-2; i++) {
               System.out.print(ast);
               for (int j = 0; j < num-2; j++) {
                   System.out.print(" ");
               }
               System.out.println(ast);
           }
           
           for (int i = 0; i < num; i++) {
            System.out.print(ast);
            } 
           
            System.out.println();
            
        } else {
            System.out.println("El numero ingresado no es correcto");
        }  
    }
}
