/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package javaintroej20;

/**
 *
 * @author Facundo
 */
public class JavaIntroEj20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        System.out.println("Vamos a dibujar un cuadrado mágico");

        cuadradoMagico(matriz);
        boolean magic = esMagico(matriz);

        System.out.println("Su cuadrado es magico: " + magic);

    }

    public static void cuadradoMagico(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                int numRandom = (int) (Math.random() * 9);

                if (numRandom < 0 || numRandom > 9) {
                    numRandom = (int) (Math.random() * 1);
                }
                
                matriz[i][j] = numRandom;
                System.out.print(matriz[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    public static boolean esMagico(int[][] matriz) {
        boolean a = false;
        int count = 0;
        int count2 = 0;
        int count3 = 0;
        int b = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                count += matriz[0][j];
                count2 += matriz[1][j];
                count3 += matriz[2][j];
            }
        }

        if (count == count2 && count2 == count3) {
            b += 1;
        }
        
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                count4 += matriz[i][0];
                count5 += matriz[i][1];
                count6 += matriz[i][2];
            }
        }
        
        if (count4 == count5 && count5 == count6) {
            b += 1;
        }
        
        int count7 = 0;
        int count8 = 0;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                count7 += matriz[i][i];
                count8 += matriz[i][matriz.length - 1 - j];
            }
        }
        
        if (count7 == count8) {
            b += 1;
        }
        
        if (b == 3) {
            a = true;
        }

        return a;
    }
}
