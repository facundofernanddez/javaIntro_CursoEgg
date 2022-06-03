/*
 Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package javaintroej14;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class JavaIntroEj14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("¿A cual de estas monedas desea realizar el cambio? libras/dolar/yenes");
        Scanner leer = new Scanner(System.in);
        String mon = leer.nextLine();
        
        System.out.println("Escriba la cantidad de euros que quiera saber el cambio a otra moneda");
        int euros = leer.nextInt();
        
       
        
       cambioMoneda(euros, mon);
    }
    
     public static void cambioMoneda(int euros, String moneda) {
         double libras = euros * 0.86;
         double dolar = euros * 1.28;
         double yenes = euros * 129.852;
            if (moneda.equalsIgnoreCase("libras")) {
                System.out.println("El cambio de euros a libras es: " + libras);
            }
            if (moneda.equalsIgnoreCase("dolar")) {
                System.out.println("El cambio de euros a dolares es: " + dolar);
            }
            if (moneda.equalsIgnoreCase("yenes")) {
                System.out.println("El cambio de euros a yenes es: " + yenes);
            }
        }
    
}
