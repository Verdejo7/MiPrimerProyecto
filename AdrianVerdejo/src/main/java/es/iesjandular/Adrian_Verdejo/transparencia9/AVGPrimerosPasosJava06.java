package es.iesjandular.Adrian_Verdejo.transparencia9;
import java.util.Scanner;
public class AVGPrimerosPasosJava06 {
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	 
	int a,b,c,resultado;
	
	System.out.println("Escribe el primer numero: ");
	a=sc.nextInt();
	
	System.out.println("Escribe el segundo numero: ");
	b=sc.nextInt();
	
	System.out.println("Escribe el tercer numero: ");
	c=sc.nextInt();
	
	resultado=a*b*c;
	
	System.out.println("El resultado es: "+resultado);
	}
}
