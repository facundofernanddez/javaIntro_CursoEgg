/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej04;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class JavaIntroEj04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Escriba cuantos grados quiere convertir a Fahrenheit");
        Scanner leer = new Scanner(System.in);
        
        int grados = leer.nextInt();
        double resultado = 32 + (9 * grados / 5);
        
        System.out.println("El resultado de convertir " + grados + " a Fahrenheit es " + resultado);
      
    }
    
}
