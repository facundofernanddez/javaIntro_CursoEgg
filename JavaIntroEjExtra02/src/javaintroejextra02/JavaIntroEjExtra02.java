/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package javaintroejextra02;

/**
 *
 * @author Facundo
 */
public class JavaIntroEjExtra02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer A = 30;
        Integer B = 24;
        Integer C = 12;
        Integer D = 87;

        System.out.println("Los valores antiguos son: A " + A + " B " + B + " C " + C + " D " + D);

        int aux;
        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;

        System.out.println("Los nuevos valores son: A " + A + " B " + B + " C " + C + " D " + D);
    }
}
