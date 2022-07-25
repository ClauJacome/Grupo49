package co.edu.utp.misiontic2022.c2;
import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        double precioUnidad, iva, cantidadProducto, precioSinIva, totalIva, total;

        System.out.print("Por favor introduzca el precio del producto por unidad: ");
        precioUnidad = sc.nextDouble();

        System.out.print("Introduzca el número de productos vendidos: ");
        cantidadProducto = sc.nextDouble();

        System.out.print("Introduzca %IVA: ");
        iva = sc.nextDouble();

        precioSinIva = precioUnidad * cantidadProducto;
        totalIva = precioSinIva * iva / 100;

        total = precioSinIva + totalIva;

        System.out.println("Precio de la venta: " + total);
        
    }
    
}
