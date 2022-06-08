/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
package javaintroej15;

/**
 *
 * @author Facundo
 */
public class JavaIntroEj15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int[99];
        
        rellenarVector(vector);
    }
    
    public static void rellenarVector(int[] vector) {
        for (int i = vector.length - 1; i >= 0; i--) {
            vector[i] = i; 
            System.out.print(vector[i] + ", ");
        }
    }
}
