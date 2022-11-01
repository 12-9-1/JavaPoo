/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crazy1;

import java.util.Scanner;


/**
 *
 * @author Costilla
 */
public class HolaMundo {

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