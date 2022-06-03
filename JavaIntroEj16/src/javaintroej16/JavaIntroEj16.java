/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package javaintroej16;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class JavaIntroEj16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("¿Qué número quiere buscar en el vector? (Del 1 al 10)");
        Scanner leer = new Scanner(System.in);
        
        int num = leer.nextInt();
        
        System.out.println("Su numero se encuentra en las posiciones: ");
        buscarNumero(num);
        
    }
    
    public static void buscarNumero(int num) {
        int[] vector = new int[100];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10);
            if (vector[i] == num) {
                System.out.print(i + ", ");
            }
        } 
    }
    
}
