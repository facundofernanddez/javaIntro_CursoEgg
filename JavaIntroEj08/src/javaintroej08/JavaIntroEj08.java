/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej08;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class JavaIntroEj08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Escriba una frase con mas de 8 caracteres de longitud");
        Scanner leer = new Scanner(System.in);
        
        String frase = leer.nextLine();
        
        if (frase.length() >= 8) {
            System.out.println("Correcto");
        }
        else {
            System.out.println("Incorrecto");
        }
    }
    
}
