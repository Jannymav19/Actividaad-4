import java.util.Scanner;
public class Calculadora {

    public static void main(String[] args) {

       Scanner entrada = new Scanner (System.in);
       int numero1;
       int numero2;
       int suma;
       int resta;
       int multiplicacion;
       int division;
       int modulo;
       
       System.out.printf ("Poner el primer digito");
       numero1 = entrada.nextInt();
       
       System.out.printf ("Poner el segundo digito");
       numero2 = entrada.nextInt();
    
       suma = numero1 + numero2;
       System.out.printf ("La suma es %d\n", suma );
     
       resta = numero1 - numero2; 
       System.out.printf ("La resta es %d\n", resta);
       
       multiplicacion = numero1 * numero2;
       System.out.printf ("La multiplicacion es %d\n", multiplicacion);
       
       division = numero1 / numero2;
       System.out.printf ("La division es %d\n", division);
       
       modulo = numero1 % numero2;
       System.out.printf ("El modulo es %d\n", modulo);



    }
}