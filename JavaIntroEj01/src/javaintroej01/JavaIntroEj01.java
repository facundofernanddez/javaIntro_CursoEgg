/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej01;
import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class JavaIntroEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Escriba dos numeros postivos");
        Scanner leer = new Scanner(System.in);
        
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        int resultado = num1 + num2;
        
        System.out.println("El resultado de la suma es: " + resultado);
    }
}
