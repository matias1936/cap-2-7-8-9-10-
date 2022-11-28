
package ejercicio2;

import java.util.Scanner;

public class ejercicio210 {
     public static void main (String []args) {
         Scanner sc = new Scanner(System.in);
         int dm, um,c,d,u;
         boolean capicua = false;
         System.out.println("Por favor ingrese un numero entre 0 y 99.999");
         int num = sc.nextInt();
         u=num % 10;
         num = num /10;
         d= num % 10;
         num =num%10;
         c=num%10;
         num = num/10;
         um=num%10;
         num=num/10;
         
dm=num;
if (dm!=9 &&dm ==u && um ==d){
    capicua=true;
}
if (dm==0 &&um!=0&&um==u&&c==d){
    capicua=true;
}
if (dm==0 &&um==0&&c!=0&&c==u){
    capicua=true;
}
      
if (dm==0 &&um==0&&c==0&&d!=0&&d==u){
    capicua=true;
}
if (capicua){
    System.out.println("El numero es capicua.");
} else {
    System.out.println("El numero NO es capicua.");
}
}
}

      

         