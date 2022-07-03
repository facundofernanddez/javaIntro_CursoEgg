/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */
package javaintroejextra03;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class JavaIntroEjExtra03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una vocal");
        String letra = leer.nextLine();
        
        
        if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U")){
            System.out.println("Ha escrito correctamente una vocal");
        } else {
            System.out.println("Ha escrito una letra inválida");
        }
    }
    
}
