package co.edu.utp.misiontic2022.c2;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main (Scanner[] args){
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Ingrese el número entero: ");
        numero = sc.nextInt();

        if (numero%10 == 0)

            System.out.println("es multiplo de 10");

        else

            System.out.println("no es multiplo de 10");


    }
    
}
