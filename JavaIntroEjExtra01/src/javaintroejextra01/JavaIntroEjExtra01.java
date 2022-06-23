/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package javaintroejextra01;

/**
 *
 * @author Facundo
 */
public class JavaIntroEjExtra01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        calculo(60);
    }
    
    public static void calculo(int min) {
        int horas = min/60%24;
        int dias = min/24/60;
        
        System.out.println(min + " minutos equivale a " + dias + " dia/s, " + horas + " horas");
    }
}
