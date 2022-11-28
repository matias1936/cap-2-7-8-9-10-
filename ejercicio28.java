
package ejercicio2;
    import java.util.Scanner;
import java.util.Locale;

public class ejercicio28 {
 public static void main (String []args) {
     Scanner sc = new Scanner(System.in);
     sc.useLocale(Locale.US);
     double a,b,c;
     double x1,x2,d;
     System.out.println("Introduzca primer coeficiente (a):");
     a=sc.nextDouble();
     System.out.println("   Introduzca el segundo coeficiente: (b):");
     b = sc.nextDouble();
     System.out.println("Introduzca el tercer coeficiente (c)");
     c = sc.nextDouble();
     d = (b*b-4*a*c);
     if (d<0){
         System.out.println("No existe una solución real");
     } else {
         if (a==0) {
             System.out.println("No se puede dividir por 0.");
         }else{
             x1= (-b + Math.sqrt (d))/(2*a); 
                x2= (-b - Math.sqrt (d))/(2*a); 
                System.out.println("Solucion n°1:" + x1);
                  System.out.println("Solucion n°2:" + x2);
             
         }
     }
 }
    
    
}
