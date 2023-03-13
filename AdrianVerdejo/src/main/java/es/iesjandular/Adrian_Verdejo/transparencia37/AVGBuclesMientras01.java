package es.iesjandular.Adrian_Verdejo.transparencia37;
import java.util.Scanner;
public class AVGBuclesMientras01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.println("Introduce el numero de asteriscos");
		numero=sc.nextInt();
		
		for(int i=0;i<numero;i++) {
			System.out.print("*");
		}

	}

}
