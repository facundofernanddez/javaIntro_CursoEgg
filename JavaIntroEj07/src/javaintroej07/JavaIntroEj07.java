/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej07;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class JavaIntroEj07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Escriba la palabra eureka");
        Scanner leer = new Scanner(System.in);
        String palabra = leer.nextLine();
                
        if (palabra.equals("eureka") == true){
            System.out.println("Correcto");
        }
        else {
           System.out.println("Incorrecto"); 
        }
    }
    
}
