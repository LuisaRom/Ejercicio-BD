import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double numero1, numero2, suma, resta, multi, raiz1, raiz2, seno, coseno;

        System.out.print("INGRESE EL PRIMER VALOR");
        numero1 = teclado.nextDouble();

        System.out.print("INGRESE EL SEGUNDO VALOR");
        numero2= teclado.nextDouble();

        suma = numero1+numero2;
        resta = numero1-numero2;
        multi= numero1*numero2;
        raiz1= Math.sqrt(numero1);
        raiz2 = Math.sqrt(numero2);
        seno= Math.sqrt(numero1);
        coseno= Math.sqrt(numero2);

        System.out.println("La suma es "+suma);
        System.out.println("La resta es: "+ resta);
        System.out.println("La multiplicacion es: "+multi);
        System.out.println("La Raiz 1 es:"+raiz1);
        System.out.println("La Raiz 2 es:"+raiz2);
        System.out.println("El seno es:"+seno);
        System.out.println("El coseno es:"+coseno);

        }
}