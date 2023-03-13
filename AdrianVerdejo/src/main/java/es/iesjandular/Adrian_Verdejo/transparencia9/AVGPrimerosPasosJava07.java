package es.iesjandular.Adrian_Verdejo.transparencia9;
import java.util.Scanner;
public class AVGPrimerosPasosJava07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,resultado;
		
		System.out.println("Introduce el numero x: ");
		x=sc.nextInt();
		resultado=x*x+x+1;
		
		System.out.println("El resultado es: "+resultado);

	}

}
