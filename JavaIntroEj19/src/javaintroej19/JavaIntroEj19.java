/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package javaintroej19;

import java.util.Arrays;

/**
 *
 * @author Facundo
 */
public class JavaIntroEj19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //(Math.random()*((max-min)+1))+min)

        int[][] matrizA = new int[3][3];

        System.out.println("Matriz A");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizA[i][j] = (int) (Math.random() * (10-(-10)+1)+(-10));
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("Matriz B");
        
        boolean a = antiSimetric(matrizA);
        System.out.println(a);
    }

    public static boolean antiSimetric(int[][] matriz) {
        boolean a = false;
        int[][] matrizB = new int[matriz.length][matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matrizB[i][j] = -matriz[j][i];
                System.out.print(matrizB[i][j] + " ");
            }
            System.out.println("");
        }
        
        if (Arrays.equals(matrizB, matriz)) {
            a = true;
        }

        return a;
    }

}
