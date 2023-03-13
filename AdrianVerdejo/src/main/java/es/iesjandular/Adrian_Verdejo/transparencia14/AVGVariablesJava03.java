package es.iesjandular.Adrian_Verdejo.transparencia14;
import java.util.Scanner;
public class AVGVariablesJava03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double precioSinIva, iva=0.21, sumaDeIva;
		
		System.out.println("Introduce el precio:");
		precioSinIva=sc.nextDouble();
		
		sumaDeIva=(precioSinIva*iva)+precioSinIva;
		System.out.println("Total con iva: "+sumaDeIva);
		
		

	}

}
