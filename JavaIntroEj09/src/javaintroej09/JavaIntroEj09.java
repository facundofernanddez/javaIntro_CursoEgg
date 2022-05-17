/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej09;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class JavaIntroEj09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Escriba una frase con la primer letra a");
        Scanner leer = new Scanner(System.in);
        
        String frase = leer.nextLine();
        String letra = frase.substring(0, 1);
        
        if (letra.equals("a")){
            System.out.println("Correcto");
        }
        else {
            System.out.println("Incorrecto");
        }
    }
}
