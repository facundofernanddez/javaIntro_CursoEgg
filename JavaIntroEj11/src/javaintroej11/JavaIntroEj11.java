/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej11;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class JavaIntroEj11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Escriba dos numeros enteros positivos");
        Scanner leer = new Scanner(System.in);
        
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        String menu =
        "MENU\n" + 
        "1. Sumar\n" + 
        "2. Restar\n" + 
        "3. Multiplicar\n" +
        "4. Dividir\n" + 
        "5. Salir\n" + 
        "Elija opción:";
        System.out.println(menu);
        int opcion = leer.nextInt();
        double resultado = 0;
        

          switch (opcion) {
            case 1:
                resultado = num1 + num2;
                System.out.println(resultado);
                break;    
            case 2:
                resultado = num1 - num2;
                System.out.println(resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println(resultado);
                break;
            case 4:
                resultado = num1 / num2;
                System.out.println(resultado);
                break;
            case 5:
                System.out.println("¿Está seguro que desea salir del programa? (S/N)");
                String sn = leer.nextLine();
                if (sn.equals("S") || sn.equals("s")) {
                    break;
                }
                else {
                    System.out.println(menu);
                }
        }  
        
                
    }
    
}
