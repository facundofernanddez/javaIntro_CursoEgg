/*
Ejercicio 12
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */
package javaintroej12;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class JavaIntroEj12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Escriba una frase de mas de 5 caracteres, debe empezar con X y terminar con O");
        Scanner leer = new Scanner(System.in);
        
        String frase = leer.nextLine().toUpperCase();
        int correcto = 0;
        int incorrecto = 0;
        
        while (frase.length() > 5) {
            System.out.println("Ha escrito una frase incorrecta vuelva a intentarlo");
            frase = leer.nextLine().toUpperCase();
        }
        
        while (frase.length() > 0 && frase.length() <= 5) {
            if (frase.equals("&&&&&") == true) {
            System.out.println("Ha finalizado el programa");
            System.out.println("Incorrectos: " + incorrecto + " Correctas: " + correcto);
            break;
            } else {
                System.out.println("Entrada incorrecta");
                incorrecto++;
                break;
            }
            
            if (frase.substring(0, 1).equalsIgnoreCase("X") && frase.substring(frase.length() - 1, frase.length()).equalsIgnoreCase("O")) {
                System.out.println("Ha ingresado una frase correcta");
                correcto++;
                System.out.println("Incorrectos: " + incorrecto + " Correctas: " + correcto);
                break;
            } else {
                System.out.println("Entrada incorrecta");
                incorrecto++;
                System.out.println("Incorrectos: " + incorrecto + " Correctas: " + correcto);
                break;
            }
        }
    }
    
}
