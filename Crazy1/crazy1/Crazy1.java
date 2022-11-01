//Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
//dos. El programa deberá después mostrar el resultado de la suma
package crazy1;

import java.util.Scanner;

/**
 *
 * @author Costilla
 */
public class Crazy1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          int num1, num2, sum;
      Scanner leer = new Scanner (System.in);
      System.out.println("Ingresa dos números enteros");
    num1 = leer.nextInt();
    num2 = leer.nextInt();
    
    sum = num1 + num2;
    System.out.println("el resultado es " + sum);
}
}
        
        
        
        
        
        
        
        
    
    
    
    
