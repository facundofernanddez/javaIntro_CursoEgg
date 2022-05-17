/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej05;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class JavaIntroEj05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Escriba un numero entero positivo");
        Scanner leer = new Scanner(System.in);
        
        double num = leer.nextInt();
        double doble = num * 2;
        double triple = num * 3;
        double raiz = Math.sqrt(num);
        
        System.out.println("El doble de " + num + " es " + doble + " El triple de " + num + " es " + triple  + " La raiz cuadrada de " + num + " es " + raiz);
    }
    
}
