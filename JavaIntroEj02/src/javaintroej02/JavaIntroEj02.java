/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej02;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class JavaIntroEj02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Escriba su nombre");
        Scanner leer = new Scanner(System.in);
        
        String nombre = leer.nextLine();
        
        System.out.println("Su nombre es " + nombre);
    }
    
}
