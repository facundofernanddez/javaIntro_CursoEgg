/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.
 */
package javaintroej21;

import java.util.Arrays;

/**
 *
 * @author Facundo
 */
public class JavaIntroEj21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matrizM = new int[10][10];
        int[][] matrizP = new int[3][3];

    }

    public static void dibujarMatriz(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void isInside(int[][] matrizA, int[][] matrizB) {
        boolean inside = false;
        int count = 0;
        int count2 = 0;
        int a = 0;
        int b = 0;
        int[] arr = new int[9];
        int[] arr2 = new int[9];

        while (count <= 9 && count2 < 100) {

            for (int i = 0; i < matrizA.length; i++) {
                for (int j = 0; j < matrizA.length; j++) {
                    a = matrizA[i][j];
                }
            }

            for (int i = 0; i < matrizB.length; i++) {
                for (int j = 0; j < matrizB.length; j++) {
                    b = matrizB[i][j];
                    count2 += 1;
                    if (a == b) {
                        count += 1;
                        arr[i] = i;
                        arr2[j] = j;
                    }
                }
            }
            
            if (count == 9) {
                String toString1 = Arrays.toString(arr);
                String toString2 = Arrays.toString(arr2);
                System.out.println("La primera matriz se encuentra contenida en la segunda matriz en las posiciones: Y: " + toString1 + " X: " + toString2);
            } else {
                System.out.println("No se encuentra la primera matriz dentro de la segunda matriz");
            }

        }
    }
}
