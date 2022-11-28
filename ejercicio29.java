
package ejercicio2;

import java.util.Scanner;

public class ejercicio29 {
     public static void main (String []args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Introduzca un numero entre 0 y 99.999");
         int num = sc.nextInt();
         
         if (num<10){
             System.out.println("Es un numero de 1 cifra.");
         } else if (num<100) {
             System.out.println("Es un numero de 2 cifras.");
             } else if (num<1000) {
             System.out.println("Es un numero de 3 cifras.");
             } else if (num<10000) {
             System.out.println("Es un numero de 4 cifras.");
             } else if (num<100000) {
             System.out.println("Es un numero de 5 cifras.");
             
             
         }
     }
}
