/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package javaintroej17;

/**
 *
 * @author Facundo
 */
public class JavaIntroEj17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int[100];
        for (int i = 0; i < 100; i++) {
            vector[i] = (int) (Math.random() * 10000);
        }
        
        recorrerVector(vector);

    }

    public static void recorrerVector(int[] vector) {
        int unDigito = 0;
        int dosDigitos = 0;
        int tresDigitos = 0;
        int cuatroDigitos = 0;
        int cincoDigitos = 0;
        for (int i = 0; i < vector.length; i++) {

            if (vector[i] >= 0 && vector[i] <= 9) {
                unDigito++;
            }

            if (vector[i] >= 10 && vector[i] <= 99) {
                dosDigitos++;
            }

            if (vector[i] >= 100 && vector[i] <= 999) {
                tresDigitos++;
            }

            if (vector[i] >= 1000 && vector[i] <= 9999) {
                cuatroDigitos++;
            }

            if (vector[i] >= 10000 && vector[i] <= 99999) {
                cincoDigitos++;
            }
        }
        System.out.println("La cantidad de números de un dígito es: " + unDigito);
        System.out.println("La cantidad de números de dos dígitos es: " + dosDigitos);
        System.out.println("La cantidad de números de tres dígitos es: " + tresDigitos);
        System.out.println("La cantidad de números de cuatro dígitos es: " + cuatroDigitos);
        System.out.println("La cantidad de números de cinco dígitos es: " + cincoDigitos);
    }

}
